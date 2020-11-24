import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Zad117 {
    public static void main(String[] args) {

        int len = 10;
        int arr1[] = new int[len];
        double arr2[] = new double[len];

        for (int i=0; i<len; i++){
            arr1[i] = ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
            arr2[i] = ThreadLocalRandom.current().nextDouble(Double.MIN_VALUE, Double.MAX_VALUE);
        }

        double sum[] = new double[len];

        for (int i=0; i<len; i++){
            sum[i] = arr1[i] + arr2[i];
        }

        Arrays.sort(sum);

        System.out.println(Arrays.toString(sum));
    }
}
