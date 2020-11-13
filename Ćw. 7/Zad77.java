public class Zad77 {
    public static void main(String[] args){
        int wrt = -4;
        boolean nal = (wrt>-15 && wrt<=-10 || wrt>-5 && wrt<0 || wrt>5 && wrt<10) && (wrt<=-13 || wrt>-8 && wrt<=-3) && (wrt>=-4);
        if (nal)
            System.out.println("należy");
        else
            System.out.println("nie należy");
		// if(wrt>-15 && wrt<=-10 || wrt>-5 && wrt<0 || wrt>5 && wrt<10)
        //     if (wrt<=-13 || wrt>-8 && wrt<=-3)
        //         if(wrt>=-4)
        //             System.out.println("Zmienna wrt = " + wrt + " nalezy do czesci wspolnej tych zbiorow");
        //         else 
        //             System.out.println("Zmienna wrt = " + wrt + " nie nalezy do czesci wspolnej tych zbiorow");
        //     else
        //         System.out.println("Zmienna wrt = " + wrt + " nie nalezy do czesci wspolnej tych zbiorow");
        // else
        //     System.out.println("Zmienna wrt = " + wrt + " nie nalezy do czesci wspolnej tych zbiorow");
    }
}
