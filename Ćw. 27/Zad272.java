import java.io.*;

public class Zad272 {
    public static void main(String[] args) {
        try {
            readFile1("cw27.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void readFile1(String fname) throws IOException {
        FileInputStream f = new FileInputStream(fname);

        int b = 0;
        StringBuilder sb = new StringBuilder();
        while ((b = f.read()) != -1) {
            sb.append((char) b);
        }

        String text = sb.toString();
        String used = "";
        
        for (int i = 0; i < text.length(); i++) {
            if (used.indexOf(text.charAt(i)) != -1){
                continue;
            }
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == text.charAt(i)){
                    count++;
                }
            }
            System.out.print(text.charAt(i));
            System.out.print(" : ");
            System.out.print(count);
            System.out.println("");
            if (used.length() == 0){
                used += text.charAt(i);
                continue;
            }
            for (int j = 0; j < used.length(); j++) {
                if (text.charAt(i) == used.charAt(j)){
                    continue;
                }
                else{
                    used += text.charAt(i);
                    break;
                }
            }
        }
        f.close();
    }
}
