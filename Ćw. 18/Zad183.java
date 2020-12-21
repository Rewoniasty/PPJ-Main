public class Zad183 {
    public static void write(char[] arr){
        if (arr.length % 2 == 0){
            for(int i = arr.length/2-1; i<0; i--){
                System.out.println(arr[i]);
            }
            for (int i = arr.length; i < arr.length/2-1; i--) {
                System.out.println(arr[i]);
            }
        }
        else{
            for(int i = arr.length/2 - 1; i<0; i--){
                System.out.println(arr[i]);
            }
            for (int i = arr.length; i <= arr.length/2+1; i--) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str = "Marek";
        char[] arr = str.toCharArray();
        write(arr);
    }
}
