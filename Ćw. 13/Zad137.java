public class Zad137 {

    // Function print matrix in spiral form
    static void spiralPrint(int end_row, int end_col, int a[][])
    {
        int i, start_col = 0, start_row = 0;
 
        while (start_col < end_row && start_row < end_col) {
            // Print the first row from the remaining rows
            for (i = start_row; i < end_col; ++i) {
                System.out.print(a[start_col][i] + " ");
            }
            start_col++;
 
            // Print the last column from the remaining
            // columns
            for (i = start_col; i < end_row; ++i) {
                System.out.print(a[i][end_col - 1] + " ");
            }
            end_col--;
 
            // Print the last row from the remaining rows */
            if (start_col < end_row) {
                for (i = end_col - 1; i >= start_row; --i) {
                    System.out.print(a[end_row - 1][i] + " ");
                }
                end_row--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (start_row < end_col) {
                for (i = end_row - 1; i >= start_col; --i) {
                    System.out.print(a[i][start_row] + " ");
                }
                start_row++;
            }
        }
    }
 
    // Driver Code
    public static void main(String[] args){
        int R = 2;
        int C = 3;
        int tab[][] = {
            { 1, 2, 3, 4},
            { 5, 6, 7, 8},
            { 9,10,11,12},
            {13,14,15,16}
        };
        
        // Function Call
          spiralPrint(R, C, tab);
    }
}
