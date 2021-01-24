public class Zad252 {
    public static void main(String[] args) {
        Telefon t = new Telefon("qwe", "czarny");
        Komorka k = new Komorka("asd", "brązowy", null);
        Smartfon s = new Smartfon("zxc", "niebieski", null, null);
        Telefon[] telefony = {t, k, s};

        
    }
}

class Osoba{
    protected String imie, nazwisko, numer;

    public Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }
}

class Telefon {
    protected String interfejsKomunikacyjny, color;

    public Telefon(String interfejsKomunikacyjny, String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    void zadzwon(String numer) {
        System.out.println(numer);
    }

    void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}

class Komorka extends Telefon {
    protected String[] polaczenia = new String[10];

    public Komorka(String interfejsKomunikacyjny, String color, String[] polaczenia) {
        super(interfejsKomunikacyjny, color);
        this.polaczenia = polaczenia;
    }

    void zadzwon(String numer){
        for (int i = 0; i < polaczenia.length-1; i++) {
            polaczenia[i+1] = polaczenia[i];
        }

        polaczenia[0] = numer;
    }

    void wyswietlHistoriePolaczen() {
        for (String numer : polaczenia) {
            System.out.println(numer);
        }
    }
}

class Smartfon extends Komorka {
    protected Osoba[] znajomi = new Osoba[10];

    public Smartfon(String interfejsKomunikacyjny, String color, String[] polaczenia, Osoba[] znajomi) {
        super(interfejsKomunikacyjny, color, polaczenia);
        this.znajomi = znajomi;
    }

    void zadzwon(Osoba znajomy) {
        for (int i = 0; i < znajomi.length-1; i++) {
            znajomi[i + 1] = znajomi[i];
        }

        znajomi[0] = znajomy;
    }

    void wyswietlHistoriePolaczen() {
        super.wyswietlHistoriePolaczen();

        for (Osoba osoba : znajomi) {
            System.out.println(osoba.imie + " " + osoba.nazwisko + " " + osoba.numer);
        }
    }
}