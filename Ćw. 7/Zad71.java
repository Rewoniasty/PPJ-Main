public class Zad71{
    public static void main(String[] args){
        boolean czyPada = true, czySwieciSlonce = false;
        if (czyPada && czySwieciSlonce)
            System.out.println("tęcza");
        else if (!czyPada && czySwieciSlonce)
            System.out.println("słonecznie");
        else if (czyPada && !czySwieciSlonce)
            System.out.println("plucha");
        else
            System.out.println("pochmurno");
    }
}