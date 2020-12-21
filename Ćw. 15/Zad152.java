public class Zad152 {
    
    public static void modifyValue (int i){
        System.out.println(i);
        i *= 5;
        System.out.println(i);
    }
    public static void main(String[] args) {
        int wrt = 5;
        modifyValue(wrt);
    }
}
