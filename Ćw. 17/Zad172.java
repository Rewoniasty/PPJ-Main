public class Zad172 {
    static int[] splitToDigits(int num){
        int num_start = num;
        int counter = 0;

        while (num_start !=0){
            num_start /= 10;
            counter++;
        }

        int arr[] = new int [counter];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num%10;
            num /=10;
        }
        return arr;
    }
    public static void main(String[] args) {
        splitToDigits(516463634);
    }
}
