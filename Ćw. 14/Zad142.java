import java.util.Arrays;

public class Zad142 {
    public static void main(String[] args) {
        int x [] = new int [4];
        int y [] = new int [4];

        for (int i = 0; i < y.length; i++) {
            x[i] = (int)(Math.random()*10);
            y[i] = (int)(Math.random()*10);
        }

        Arrays.sort(x);
        Arrays.sort(y);
        
        int length = x[x.length-1] - x[0];
        int height = y[y.length-1] - y[0];

        double px = length/2;
        double py = height/2;

        System.out.printf("%d, %d, %d, %d", length, height, px, py);
    }
}
