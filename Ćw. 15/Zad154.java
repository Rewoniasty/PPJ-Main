public class Zad154 {
    public static void count (char[] arr){
        int ascii_index[] = new int [128];
        for (int i = 0; i < arr.length; i++) {
            int temp = (int)(arr[i]);
            ascii_index[temp]++;
        }
        for (int i = 0; i < ascii_index.length; i++) {
            if (ascii_index[i] == 0){
                continue;
            }
            else{
                System.out.print((char)(i));
                System.out.print(" : ");
                System.out.print(ascii_index[i]);
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        char[] zdanie = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a', '.'};
        count(zdanie);
    }
}
