public class Zad82 {
    public static void main(String[] args) {
        int deg = (int)(Math.random()*360);
        System.out.println(deg);
        if (deg == 45)
            System.out.println("Północ");
        else if (deg == 135)
            System.out.println("Wschód");
        else if (deg == 225)
            System.out.println("Południe");
        else if (deg == 315)
            System.out.println("Zachód");
        else if (deg>45 && deg<135)
            System.out.println("Północny-wschód");
        else if (deg>135 && deg<225)
            System.out.println("Południowy-wschód");
        else if (deg>225 && deg<315)
            System.out.println("Południowy-zachód");
        else
            System.out.println("Północny-zachód");
    }
}
