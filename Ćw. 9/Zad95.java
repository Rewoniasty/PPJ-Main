public class Zad95 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            double suma = 0;
            int n = i;
            while(n>=0){ 
                suma = suma + 1/Math.pow(2, n);
                n--;
            }
            System.out.println(suma);
        }
    }
}
