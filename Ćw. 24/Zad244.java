public class Zad244 {
    
}

class Drzewo{
    private boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;


    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString(){
        return "Drzewo wiecznie zielone? : " + this.wiecznieZielone + ", Wysokosc: " + this.wysokosc + ", Przekroj drzewa: " + this.przekrojDrzewa;
    }

    void zerwijOwoc() throws DrzewoBezOwocoweExeption {
        throw new DrzewoBezOwocoweExeption("Drzewo nie ma owoców");
    }
}

class DrzewoIglaste extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString(){
        return super.toString() + ", Ilosc igiel: " + this.iloscIgiel + ", Dlugosc szyszki: " + this.dlugoscSzyszki;
    }

    void zerwijOwoc() throws DrzewoBezOwocoweExeption {
        throw new DrzewoBezOwocoweExeption("Drzewo nie ma owoców");
    }
}

class DrzewoLisciaste extends Drzewo{
    private int ksztaltLiscia;


    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + ", ksztalt liscia: " + this.ksztaltLiscia;
    }

    void zerwijOwoc() throws DrzewoBezOwocoweExeption {
        throw new DrzewoBezOwocoweExeption("Drzewo nie ma owoców");
    }
}

class DrzewoOwocowe extends Drzewo{
    private String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + ", nazwa owoca: " + this.nazwaOwoca;
    }

    void zerwijOwoc() {
        System.out.println("Owoc zerwany");
    }
}

class DrzewoBezOwocoweExeption extends Exception{
    public DrzewoBezOwocoweExeption(String komunikat){
        super(komunikat);
    }
}