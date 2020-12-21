public class Zad184 {
    static int fibonaci(int n){
        if (n <= 1) 
            return n; 
        return fibonaci(n - 1) + fibonaci(n - 2);   
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) { 
            System.out.print(fibonaci(i) + " "); 
        } 
    }
}