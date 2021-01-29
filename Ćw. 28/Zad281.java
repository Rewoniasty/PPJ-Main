import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad281 {
    public static void main(String[] args) {
        String[] inputs = {"aaaabbcch", "bbaaaacch", "ccaaacch", "bbaaaabbh", "abch"};

        String regex = "[a|b|c|h]+";

        Pattern pat = Pattern.compile(regex);
        for (String input: inputs){
            Matcher mat = pat.matcher(input);
            System.out.println(mat.matches());
        }

    }
}
