public class Zad243 {
    public static void main(String[] args) {
        
    }    
}

class Pojazd{
    protected String color;

    public Pojazd(String color) {
        this.color = color;
    }

}

class PojazdKolowy extends Pojazd{
    private int iloscOsi;

    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }
    
}

class CiagnikSiodlowy extends PojazdKolowy{
    private int masa;

    public CiagnikSiodlowy(String color, int iloscOsi, int masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public void rozpocznijJazde(){
        if (this.masa/getIloscOsi() > 11000){
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }
    }

}

class Samochod extends PojazdKolowy{
    private int miejsca;

    public Samochod(String color, int iloscOsi, int miejsca) {
        super(color, iloscOsi);
        this.miejsca = miejsca;
    }

    public int getMiejsca() {
        return this.miejsca;
    }

    @Override
    public String toString() {
        return "{" +
            " miejsca='" + getMiejsca() + "'" +
            "}";
    }
}
