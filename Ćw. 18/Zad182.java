public class Zad182 {
    static boolean palindrom(char[] tab){
        return palindrom (tab, 0, tab.length-1);
    }

    static boolean palindrom(char[] tab, int p, int k){
        if (p>=k)
            return true;
        else if (tab[p] == tab[k])
            return palindrom(tab, p+1, k-1);
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "kajak";
        char[] pal = str.toCharArray();
        boolean check = palindrom(pal);
        System.out.println(check);
    }
}
