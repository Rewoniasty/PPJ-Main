public class Zad135 {
    public static void main(String[] args) {
        int[] arr1 = new int [(int)(Math.random()*10)];
        int[] arr2 = new int [(int)(Math.random()*10)];
        int[] arr3 = new int [(int)(Math.random()*10)];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*i);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random()*i);
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int)(Math.random()*i);
        }
    }
}
