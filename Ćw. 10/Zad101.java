public class Zad101{
    public static void main(String[] args){

        String string_4 = "";
        byte reminder = 0;
        byte byte_10 = 15;

        while(byte_10 != 0){
            reminder = (byte)(byte_10%4);
            string_4 = (char)(reminder+48) + string_4;
            byte_10 = (byte)(byte_10/4);
        }

        System.out.println(string_4);
    }
}