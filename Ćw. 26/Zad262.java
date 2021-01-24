public class Zad262 {
    public static void main(String[] args) {
        DetektorDymu det = new DetektorDymu(true);
        try{
            det.sprawdz();
        } catch(Alarm a){
            System.out.println(a);
        }
    }
}

class Alarm extends Exception{
    public Alarm(String komunikat){
        super(komunikat);
    }
}

class DetektorDymu{
    boolean dym;

    public DetektorDymu(boolean dym){
        this.dym = dym;
    }

    void sprawdz() throws Alarm{
        if (dym){
            throw new Alarm("ALARM!!!");
        }
    }
}