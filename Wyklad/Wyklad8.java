import java.awt.*;
import java.util.Arrays;

public class Wyklad8 {

    public static void main(String[] args) {

        char[] arr = { 'k', 'a', 'j', 'b', 'k' };
        /*
         * arr[0] == arr[4] arr[1] == arr[3] arr[2] == arr[2]
         */
        // arr[0+i] == arr[arr.length-1-i]

        boolean palindrom = true;
        int i = 0;
        while (palindrom && i < arr.length - 1 - i) {
            if (arr[i] != arr[arr.length - 1 - i])
                palindrom = false;
            i++;
        }
        System.out.println(palindrom);

        System.out.println(arrPalindrom(arr, 0));
        // ===========================================================

        int[] tab = { 13, 10, 15, 5, 6 };

        // insertionSort( tab, tab.length);
        bubbleSort(tab, tab.length);
        System.out.println(Arrays.toString(tab));
        // ===========================================================

        new Frame() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                setSize(640, 480);
                setVisible(true);
            }

            public void paint(Graphics g) {
                int xp = 200, yp = 300;
                int xk = 600, yk = 300;

                g.setColor(Color.BLUE);
                myDraw(g, xp, yp, xk, yk, 5);

                // g.setColor(Color.RED);
                // g.drawLine( (int)x2, (int)y2, (int)mx, (int)my);
                // g.drawLine( (int)mx, (int)my, (int)x3, (int)y3);

            }

            public void myDraw(Graphics g, double xp, double yp, double xk, double yk, int level) {
                if (level == 0) {
                    g.drawLine((int) xp, (int) yp, (int) xk, (int) yk);
                    return;
                }

                double x2 = xp + (xk - xp) / 3;
                double y2 = yp + (yk - yp) / 3;

                double x3 = xp + 2 * (xk - xp) / 3;
                double y3 = yp + 2 * (yk - yp) / 3;

                double mx = x2 + (x3 - x2) / 2 - Math.sqrt(3) * (y3 - y2) / 2;
                double my = y2 + (y3 - y2) / 2 - Math.sqrt(3) * (x3 - x2) / 2;

                myDraw(g, xp, yp, x2, y2, level - 1);
                myDraw(g, x2, y2, mx, my, level - 1);
                myDraw(g, mx, my, x3, y3, level - 1);
                myDraw(g, x3, y3, xk, yk, level - 1);

            }
        };

    }

    public static void bubbleSort(int[] arr, int size) {
        if (size == 1)
            return;

        for (int i = 0; i < size - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }

        bubbleSort(arr, size - 1);

    }

    public static void insertionSort(int[] arr, int size) {
        if (size <= 1)
            return;

        insertionSort(arr, size - 1);

        int last = arr[size - 1];
        int j = size - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static boolean arrPalindrom(char[] arr, int i) {
        if (i >= arr.length - 1 - i)
            return true;
        if (arr[i] != arr[arr.length - 1 - i])
            return false;
        else
            return arrPalindrom(arr, i + 1);
    }
}
