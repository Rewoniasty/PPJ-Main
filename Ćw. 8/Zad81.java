public class Zad81 {
    public static void main(String[] args) {
        int a = -2;
        if (a<=-1 || a>6)
            System.out.println("A");
        else if ((a>-1 && a<=0) || (a>=5 && a<=6))
            System.out.println("A && B");
        else if ((a>0 && a<2) || (a>3 && a<5))
            System.out.println("B");
        else
            System.out.println("B && C");
    }
}
