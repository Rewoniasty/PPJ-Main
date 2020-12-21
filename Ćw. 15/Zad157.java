public class Zad157 {
    public static boolean isPalindrome (char arr[]){
        char arr_rev[] = new char [arr.length];
        arr_rev = arr;
        for(int i = 0; i < arr_rev.length / 2; i++){
                char temp = arr_rev[i];
                arr_rev[i] = arr_rev[arr_rev.length - i - 1];
                arr_rev[arr_rev.length - i - 1] = temp;
        }
        for (int i = 0; i < arr_rev.length; i++) {
            if (arr[i] != arr_rev[i])
                return false;
        }
        return true;
    }
}
