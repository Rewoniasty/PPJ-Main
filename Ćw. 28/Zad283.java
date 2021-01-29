import java.util.regex.*;

public class Zad283{
    public static void main(String[] args) {
        String binary = "101";
        String regex = "^1[0-1]+1$";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(binary);
        System.out.println(mat.matches());
    }
}