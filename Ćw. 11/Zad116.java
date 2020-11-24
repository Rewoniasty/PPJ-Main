import java.util.concurrent.ThreadLocalRandom;

public class Zad116 {
    public static void main(String[] args) {

        int arr1[] = new int[10];
        int arr2[] = new int[10];

        for (int i=0; i<arr1.length; i++){
            arr1[i] = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            arr2[i] = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        int sum[] = new int[arr1.length + arr2.length];

        for (int i=0; i<sum.length; i++){
             sum[i] = arr1[i];
             sum[i+10] = arr2[i];     
        }

        int both[] = new int[10];

        for (int i=0; i<both.length; i++){
            for (int j=0; j<both.length; j++){
                if (arr1[i] == arr2[j]){
                    both[i] = arr1[i];
                    break;
                }
            }
        }
    }
}
