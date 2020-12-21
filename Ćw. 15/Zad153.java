public class Zad153 {
    public static int findMax (int a, int b, int c){
        int max = 0;
        max = (a<b)?b:a;
        if (c>max){
            max = c;
        }
        return max;
    }
    public static int findMaxFromArr (int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
