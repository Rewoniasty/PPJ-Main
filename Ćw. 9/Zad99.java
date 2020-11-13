public class Zad99 {
    public static void main(String[] args) {
        byte b = 8;
        char c;
        if (b>=0 && b<=9){
            c = (char)(b+48);
        }
        else{
            c = (char)(b+65);
        }
        System.out.println(c);
    }
}
