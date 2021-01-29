import java.util.regex.*;

public class Zad282 {
    public static void main(String[] args) {
        String binary = "010101011011";
        String regex = "^[0-1]+$";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(binary);
        System.out.println(mat.matches());
    }
}
