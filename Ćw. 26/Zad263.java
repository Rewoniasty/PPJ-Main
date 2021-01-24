public class Zad263 {
    public static void main(String[] args) {
        Rakieta r = new Rakieta("Prom", 0);
        r.zatankuj();
        try {
            r.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Rakieta{
    protected String nazwa;
    protected int wagaPaliwa;


    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    void zatankuj(){
        this.wagaPaliwa = (int)(Math.random()*2000);
    }

    void start() throws Exception{
        if (this.wagaPaliwa < 1000){
            throw new ArithmeticException("start anulowany - za mało paliwa");
        }
    }
}