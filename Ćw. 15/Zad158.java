public class Zad158 {
    public static void main(String[] args) {
        int arr[][] = new int[25][25];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.round(Math.random()));
            }
        }
    }
}
