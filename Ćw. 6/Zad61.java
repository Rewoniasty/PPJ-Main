public class Zad61{
    public static void main(String[] args){
        boolean czyPada = true, czySwieciSlonce = true;
        System.out.println(((czyPada && czySwieciSlonce) == true)?"jest tecza":
                            ((czyPada || czySwieciSlonce) == false)?"jest pochmurnie":
                            ((!czyPada && czySwieciSlonce) == true)?"jest pogodnie":"jest szaruga"
                            );


        double a=10.0, b=3.0, reszta; 
        int podloga;
        podloga = (int)(a/b);
        reszta = a%b;
        System.out.println(podloga + " reszty " + reszta);


        byte cyfr = 0;
        cyfr = (byte)((int)(Math.random()*2) << 0);
        cyfr = (byte)(cyfr + (byte)((int)(Math.random()*2) << 1));
        cyfr = (byte)(cyfr + (byte)((int)(Math.random()*2) << 2));
        cyfr = (byte)(cyfr + (byte)((int)(Math.random()*2) << 3));
        cyfr = (byte)(cyfr + (byte)((int)(Math.random()*2) << 4));
        System.out.println(cyfr);
    }
}