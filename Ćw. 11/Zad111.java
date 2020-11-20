public class Zad111{
    public static void main(String[] args) {
        long l = 0xAA55AA55AA55AA55l;
        String bin = Long.toBinaryString(l);
        for (int i=0; i<bin.length(); i++){
            if (i%8 == 0){
                System.out.println();
            }
            long pow = (long)(Math.pow(2, i));
            long compare = (l & pow);
            if (compare == (Math.pow(2, i))){
                System.out.print("*");
            }
            else
                System.out.print(" ");
        }
    }
}