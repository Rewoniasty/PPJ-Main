public class Zad96 {
    public static void main(String[] args) {
        boolean change = true;
        for(int i=1;i<=54;i++){

            if (change == true)
                System.out.print("*");
            else
                System.out.print(" ");

            if(i%9 == 0)
                System.out.println("");

            change = !change;
        }
    }
}
