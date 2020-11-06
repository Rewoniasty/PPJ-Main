import java.util.Scanner;

public class Zad78 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int wrt = in.nextInt();
        if (wrt>1)
            System.out.println("A");
        else if (wrt<0)
            System.out.println("B");
        else
            System.out.println("ABC");
    }
}
