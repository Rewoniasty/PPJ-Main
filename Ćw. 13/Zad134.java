public class Zad134{
    public static void main(String[] args) {
        int[][] tab = {
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 1}
        };

        int[] tab1D = new int [12];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < tab[i].length; j++) {
                if (i == 0)
                    tab1D[j] = tab[i][j];
                if (i == 1)
                    tab1D[j+5] = tab[i][j];
                if (i == 2)
                    tab1D[j+9] = tab[i][j];
            }
        }

        for (int i = 0; i < tab1D.length; i++) {
            System.out.println(tab1D[i]);
        }


    }
}