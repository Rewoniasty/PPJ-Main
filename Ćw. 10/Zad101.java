public class Zad101{
    public static void main(String[] args){

        String s = "";
        byte reminder = 0;
        byte b = 15;

        while(b != 0){
            reminder = (byte)(b%4);
            s = (char)(reminder+48) + s;
            b = (byte)(b/4);
        }

        System.out.println(s);
    }
}