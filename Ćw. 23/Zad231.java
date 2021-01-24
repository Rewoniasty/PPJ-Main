public class Zad231 {
    public static void main(String[] args) {
        Atom a1 = new Atom("Hel", 0.0222, 9);
        System.out.println(a1.toString());
        System.out.println(a1);
    }
}

class Atom{
    private String name;
    private double mass;
    private int charge;

    public Atom(String name, double mass, int charge) {
        this.name = name;
        this.mass = mass;
        this.charge = charge;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.mass + ", " + this.charge;
    }
}
