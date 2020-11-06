public class Zad75 {
    public static void main(String[] args){
        int W=1,X=5,Y=3,Z=0,suma;
        suma = W + X + Y + Z;

        if (suma > 0xA){
            if ((W & 16) == 16) System.out.println(W);
            if ((X & 16) == 16) System.out.println(X);
            if ((Y & 16) == 16) System.out.println(Y);
            if ((Z & 16) == 16) System.out.println(Z);
        }
        else{
            if ((W & 0xA3) < 5) System.out.println(W);
            if ((X & 0xA3) < 5) System.out.println(X);
            if ((Y & 0xA3) < 5) System.out.println(Y);
            if ((Z & 0xA3) < 5) System.out.println(Z);
        }
    }
}
