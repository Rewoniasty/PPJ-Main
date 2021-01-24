public class Zad201 {
    public static int fiboR(int n) {
        if (n <= 1)
            return n;
        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        int arr[] = new int[n + 2];
        int i;

        arr[0] = 0;
        arr[1] = 1;

        for (i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static int factR(int n) {
        if (n <= 1)
            return n;
        return n * (factR(n - 1));
    }

    public static int factI(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int gcdR(int a, int b) {
        if (a < b)
            return gcdR(a, b - a);
        if (a > b)
            return gcdR(a - b, b);
        return a;
    }

    public static int gcdI(int a, int b) {
        while (a != b) {
            if (a < b)
                b -= a;
            else
                a -= b;
        }
        return a;
    }
    public static void main(String[] args) {
        // int[] arr = {1,4,6,4,7,9,34,5,3,6,235};
        // System.out.println(maxElem(arr, 0));
        System.out.println(fiboI(10));
        System.out.println(fiboR(10));
        System.out.println(factI(10));
        System.out.println(factR(10));
        System.out.println(gcdI(63636, 636));
        System.out.println(gcdR(63636, 636));
    }
}
