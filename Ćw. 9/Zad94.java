public class Zad94 {
    public static void main(String[] args) {       
        int i = 1;
    
        do{
            System.out.println(i);
            System.out.println("Pętla do while zadziałała");
        } while(i<1);
    
        while (i<1){
            System.out.println(i);
            System.out.println("Ta wiadomość nie wyświetli się ponieważ pętla while nie zostanie wykonana");
        }
    }
}
