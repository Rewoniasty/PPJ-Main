import java.util.Arrays;

public class Zad123{
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = {11,10,8,7,6,5,4,3,2,1};
        int temp = 0;
        int len_same = 1;
        int sum[] = new int [10];

        for (int i = 0; i < arr2.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        Arrays.sort(sum);

        for (int i = 0; i < sum.length - 1; i++) {
            if (sum[i] != sum[i+1]){
                len_same++;
            }
        }

        int same[] = new int [len_same];
        int index = 0;
        same[index] = sum[0];

        for (int i = 0; i < sum.length; i++){
            if (sum[i] == same[index]){
                continue;
            }
            else{
                same[index+1] = sum[i];
                index++;   
            }
        }


    }
}