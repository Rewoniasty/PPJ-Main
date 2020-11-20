import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Zad115 {
    public static void main(String[] args) {
        int length = ThreadLocalRandom.current().nextInt(10, 15);
        int iArr[] = new int[length];

        for (int i=0; i<iArr.length; i++){
            iArr[i] = i;
            System.out.print(iArr[i]+" ");
        }

        System.out.println("");

        int index, temp; //losowanie
        Random random = new Random();
        for (int i=iArr.length-1; i>=0; i--){
            index = random.nextInt(i + 1);
            temp = iArr[index];
            iArr[index] = iArr[i];
            iArr[i] = temp;
        }

        for (int i=0; i<iArr.length; i++){
            System.out.print(iArr[i]+" ");
        }

        System.out.println("");

        for (int i=0; i<iArr.length; i++){
            for(int j=0; j<iArr.length; j++){
                if (iArr[j] == i){
                    System.out.print("* ");
                }
                else
                    System.out.print(". ");
            }
            System.out.println();
        }

    }
}
