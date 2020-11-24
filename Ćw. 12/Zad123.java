public class Zad123 {
    public static void main(String[] args) {
        int[] arr = {153,333,370,515,407,80};

        for (int i = 0; i < arr.length; i++) {

            String temp = Integer.toString(arr[i]);
            int[] arr_int = new int[temp.length()];

            for (int j = 0; j < temp.length(); j++){
                arr_int[j] = temp.charAt(j) - '0';
            }

            int armstrong = 0;

            for (int j = 0; j < arr_int.length; j++){
                armstrong += Math.pow(arr_int[j], arr_int.length);
            }

            if (armstrong == arr[i])
                System.out.println(true);
            else
                System.out.println(false);
        }
    }
}
