public class Zad241 {
    public static void main(String[] args) {
        
    }
}

class Prostokąt{
    private int dl, sz;

    public Prostokąt(int dl, int sz){
        this.dl = dl;
        this.sz = sz;
    }

    public int getSz() {
        return this.sz;
    }

    public int getDl() {
        return this.dl;
    }

    @Override
    public String toString(){
        return "Dlugosc: " + this.dl + ", Szerokosc: " + this.sz;
    }

    public void polePow(){
        System.out.println("Pole powierzchni = " + this.dl*this.sz);
    }
}

class Prostopadloscian extends Prostokąt{
    private int wys;

    Prostopadloscian(int dl, int sz, int wys){
        super(dl, sz);
        this.wys = wys;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wysokosc:" + this.wys;
    }

    public void objetosc(){
        System.out.println("Objetosc: " + getDl()*getSz()*this.wys);
    }
}

class Trojkat{
    private int bok;

    public Trojkat(int bok) {
        this.bok = bok;
    }

    public int getBok() {
        return this.bok;
    }

    @Override
    public String toString() {
        return "Bok: " + this.bok;
    }

    public void polePow(){
        System.out.println("Pole powierzchni: " + Math.pow(bok, 2)*Math.sqrt(3)/4);
    }
}

class Ostroslup extends Trojkat{
    private int pod;

    public Ostroslup(int bok, int pod){
        super(bok);
        this.pod = pod;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dł. boku podstawy: " + this.pod;
    }

    public void polePow(){
        System.out.println("Pole powierzchni podstawy: " + pod*pod);
    }
}

class Graniastoslup extends Trojkat {
    private int wys;

    public Graniastoslup(int bok, int wys) {
        super(bok);
        this.wys = wys;
    }

    @Override
    public String toString() {
        return super.toString() + ", Wysokosc: " + this.wys;
    }

    public void polePow() {
        System.out.println("Objetosc: " + getBok()*getBok()*Math.sqrt(3)/4*wys);
    }
}
