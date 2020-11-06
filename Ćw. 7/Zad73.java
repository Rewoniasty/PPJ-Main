public class Zad73 {
    public static void main(String[] args){
        boolean czyPada, czySwieciSlonce;
        byte b;

        if (Math.random() < 0.5)
            czyPada = true;
        else
            czyPada = false;

        if (Math.random() < 0.5)
            czySwieciSlonce = true;
        else
            czySwieciSlonce = false;
        
        b = (byte)( (czyPada?1:0) + ((czySwieciSlonce?1:0) << 1) );        
        System.out.println(b);

        switch (b){
            case 3:
                czyPada = true;
                czySwieciSlonce = true;
                break;
            case 2:
                czyPada = false;
                czySwieciSlonce = true;
                break;
            case 1:
                czyPada = true;
                czySwieciSlonce = false;
                break;
            case 0:
                czyPada = false;
                czySwieciSlonce = false;
                break;
        }
        
        System.out.println(czyPada + " " + czySwieciSlonce);

    }

}
