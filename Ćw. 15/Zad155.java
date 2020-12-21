public class Zad155 {
    public static int[] f1(int arr1[], int arr2[], int i){
        if (i<0){
            int lenMin = (arr1.length<arr2.length)?arr2.length:arr1.length;
            int[] sum = new int [lenMin];
            for (int j = 0; j < sum.length; j++) {
                sum[j] = arr1[j] + arr2[j];
            }
            return sum;
        }
        if (i>0){
            int lenDiff = arr2.length-arr1.length;
            int extended[] = new int [Math.abs(lenDiff)];
            if (lenDiff>0){
                for (int j = 0; j < extended.length; j++) {
                    extended[j] = arr2[arr1.length+j];
                }
            }
            else{
                for (int j = 0; j < extended.length; j++) {
                    extended[j] = arr1[arr2.length+j];
                }
            }
            return extended;
        }
        if (i == 0){
            System.out.println("Paremeter i can't equal 0");
            return null;
        }
        if (arr1.length == arr2.length){
            return null;
        }
    }
    public static void main(String[] args) {
        int arr1[] = new int [10];
        int arr2[] = new int [6];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*1000);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random()*1000);
        }
        int i = 1;
        System.out.println(f1(arr1, arr2, i));
    }
}
