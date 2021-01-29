import java.util.regex.*;

public class Zad284 {
    public static void main(String[] args) {
        String input = "Jan III Sobieski herbu Janina (ur. 17sierpnia 1629 w Olesku, zm. 17 czerwca 1696 w Wilanowie) – król Polski iwielki książę litewski od 1674, hetman wielki koronny od 1668, hetman polnykoronny od 1666, marszałek wielki koronny od 1665, chorąży wielki koronnyod 1656.";

        Pattern word = Pattern.compile("\s");
        Matcher countWords = word.matcher(input);
        int wordCount = 0;
        while(countWords.find()){
            wordCount++;
        }
        System.out.println("ilość słów = "wordCount);

        Pattern date = Patern.compile("\d{1,2}\s[a-zA-Z]+\s\d{4}");
        Matcher countDates = date.matcher(input);
        int dateCount = 0;
        while(countWords.find()){
            dateCount++;
        }
        System.out.println(dateCount);
    }
}
