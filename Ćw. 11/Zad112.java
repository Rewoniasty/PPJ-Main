import java.util.concurrent.ThreadLocalRandom;

public class Zad112{
    public static void main(String[] args) {
        double[] dArr = new double[10];
        int length = dArr.length;
        for (int i=0; i<length; i++){
            dArr[i] = ThreadLocalRandom.current().nextDouble(Double.MIN_VALUE, Double.MAX_VALUE);
            System.out.println(dArr[i]);
        }

        System.out.println();

        for (int i=0; i<length; i++){
            if (i%2 == 0){
                System.out.println(dArr[i]);
            }
        }

        System.out.println();

        for (int i=0; i<length; i++){
            int temp = (int) dArr[i];
            if (temp%2 == 1){
                System.out.println(dArr[i]);
            }
        }
    }
}