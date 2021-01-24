public class Zad242 {
    public static void main(String[] args) {
        
    }
}

class Osoba{
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String wyswietl(){
        return this.imie;
    }

    public String getImie() {
        return imie;
    }
}

class Spawacz extends Osoba{
    private int stazpracy;

    public Spawacz(String imie, int stazpracy) {
        super(imie);
        this.stazpracy = stazpracy;
    }

    public String wyswietl(){
        return getImie() + this.stazpracy;
    }

}
