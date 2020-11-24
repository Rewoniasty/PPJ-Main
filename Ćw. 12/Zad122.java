public class Zad122 {
    public static void main(String[] args) {
        int[] tab = {2,1,3,4,4,3,2,1};

        for (int i=0; i<tab.length/2; i++){
            if (tab[i] == tab[tab.length-1-i])
                System.out.println(true);
            else
                System.out.println(false);
        }
    }  
}
