import java.util.Arrays;

public interface Zad174 {
    public static int [][] calculateSquares (int screenWidth, int screenHeight, int side){
        int num_x = (int)(screenWidth / side);
        int num_y = (int)(screenHeight / side);

        int[][] arr = new int [num_x*num_y][2];

        for (int i = 0; i < num_y; i++){
            for (int j = 0; j < num_x; j++) {
                arr[i*num_x+j][0] = i*side;
                arr[i*num_x+j][1] = j*side;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(calculateSquares(67, 27, 5)));
    }
}
