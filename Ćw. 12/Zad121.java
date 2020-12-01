import java.util.concurrent.ThreadLocalRandom;

public class Zad121{
    public static void main(String[] args) {
        int len = 9;
        boolean arr[] = new boolean [len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextBoolean();
        }

        int count_true = 0;
        int count_false = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true)
                count_true++;
            else
                count_false++;
        }

        boolean trues[] = new boolean [count_true];
        boolean falses[] = new boolean [count_false];
        int i = 0;
        int t = 0;
        int f = 0;

        while (i<arr.length){
            if (arr[i] == true){
                trues[t] = arr[i];
                t++;
            }
            else{
                falses[f] = arr[i];
                f++;
            }
            i++;
        }
    }
}