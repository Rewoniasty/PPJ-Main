public class Zad76 {
    public static void main(String[] args){
        int wrt = -14;
        if ((wrt > -15 && wrt < -10) ^ (wrt < -13))
            System.out.println("należy tylko do jednego");
        else
            System.out.println("należy do żadnego albo dwóch");
    }

}
