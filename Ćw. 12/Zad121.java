import java.util.concurrent.ThreadLocalRandom;

public class Zad121{
    public static void main(String[] args) {
        boolean arr[] = new boolean [8];

        for (int i=0; i<arr.length; i++){
            arr[i] = ThreadLocalRandom.current().nextBoolean();
        }

        int count_true = 0;
        int count_false = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == true)
                count_true++;
            else
                count_false++;
        }

        boolean trues[] = new boolean [count_true];
        boolean falses[] = new boolean [count_false];

        for (int i=0; i<arr.length; i++){
            if (arr[i] == true)
                trues[i] = arr[i];
            else
                falses[i] = arr[i];
        }
    }
}