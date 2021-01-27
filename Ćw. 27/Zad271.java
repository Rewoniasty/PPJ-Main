public class Zad271 {
    public static void main(String[] args) {
        SecretFile f = new SecretFile(
        "Plik",
        "Following a two-month congress between the Ottoman Empire on one side and the Holy League of 1684, a coalition of the Holy Roman Empire, the Polish–Lithuanian Commonwealth, the Republic of Venice and Peter the Great, Tsar of Russia,[3] a treaty was signed on 26 January 1699.[citation needed]",
        5);

        f.show();
    }
}

class File{
    String name, text;
    int pages;

    public File(String name, String text, int pages) {
        this.name = name; // nazwa
        this.text = text; // opis
        this.pages = pages; // il stron
    }

    public void show(){
        System.out.println("czy masz dostęp?");
    }
}

class SecretFile extends File{

    public SecretFile(String name, String text, int pages) {
        super(name, text, pages);
    }

    @Override
    public void show(){
        StringBuilder sb = new StringBuilder();
        int b, i = 0;
        boolean canWrite = true;
        int spaces = 0;
        while((b = this.text.charAt(i)) != -1){
            i++;
            if (spaces == 6){
                spaces = 0;
                canWrite = true;
                sb.append((char)b);
                continue;
            }
            if (canWrite){
                sb.append((char)b);
            }
            if (b == 32 && canWrite){
                canWrite = false;
                spaces = 1;
            }
            if (!canWrite){
                sb.append('*');
                if (b == 32){
                    spaces++;
                }
            }
        }
        System.out.println(sb.toString());
    }
}

class TopSecretFile extends File{

    public TopSecretFile(String name, String text, int pages) {
        super(name, text, pages);
    }

    @Override
    public void show(){
        StringBuilder sb = new StringBuilder();
        int b, i = 0;
        boolean canWrite = true;
        int spaces = 0;
        while((b = this.text.charAt(i)) != -1){
            i++;
            if (spaces == 3){
                spaces = 0;
                canWrite = true;
                sb.append((char)b);
                continue;
            }
            if (canWrite){
                sb.append((char)b);
            }
            if (b == 32 && canWrite){
                canWrite = false;
                spaces = 1;
            }
            if (!canWrite){
                sb.append('*');
                if (b == 32){
                    spaces++;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
