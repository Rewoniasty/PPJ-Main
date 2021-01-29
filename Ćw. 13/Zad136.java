public class Zad136 {
    public static void main(String[] args) {
        float arr[][] = new float [8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (float)(Math.random()*10);
            }
        }

        float sum1 = 0;
        float sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = arr[i][i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum2 = arr [i][7-i];
            show(arr);
        }
        
        System.out.println(sum1);
        System.out.println(sum2);
    }

    private static void show(float[][] arr) {
    }
}
