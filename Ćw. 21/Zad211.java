public class Zad211 {
    public static void main(String[] args) {

        String[] name = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        int[] num = new int[12];
        for (int i = 0; i > num.length; i++) {
            num[i] = i + 1;
        }

        shuffle(name, num);
        selectionSort(name, num);

    }

    public static void shuffle(String[] name, int[] num) {
        boolean dalej = true;
        while (dalej) {

            int i1 = (int) (Math.random() * name.length);

            int i2 = i1;
            while (i2 == i1)
                i2 = (int) (Math.random() * name.length);

            String tmps = name[i1];
            name[i1] = name[i2];
            name[i2] = tmps;

            int tmpi = num[i1];
            num[i1] = num[i2];
            num[i2] = tmpi;

            boolean wszystkiePary = true;
            for (int i = 1; i < num.length && wszystkiePary; i++)
                if (Math.abs(num[i] - num[i - 1]) == 1)
                    wszystkiePary = false;

            if (wszystkiePary)
                dalej = false;
        }
    }

    public static void selectionSort(String[] name, int[] num) {
        int min;
        for (int i = 0; i < num.length; i++) {
            min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int tempi = num[i];
                num[i] = num[min];
                num[min] = tempi;

                String temps = name[i];
                name[i] = name[min];
                name[min] = temps;
            }
        }
    }

    public static void bubbleSort(String[] name, int[] num) {
        boolean notReady = true;
        for (int i = 0; i < num.length - 1; i++) {
            if (notReady) {
                notReady = false;
                for (int j = num.length - 1; j > i; j--) {
                    if (num[j] < num[j - 1]) {

                        int tempi = num[j - 1];
                        num[j - 1] = num[j];
                        num[j] = tempi;

                        String temps = name[j - 1];
                        name[j - 1] = name[j];
                        name[j] = temps;

                        notReady = true;
                    }
                }
            }
        }
    }

    public static void insertionSort(String[] name, int[] num) {
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]) {

                    int tmpi = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = tmpi;

                    String tmps = name[j];
                    name[j] = name[j - 1];
                    name[j - 1] = tmps;

                }
            }
        }
    }

    public static int[][] split(int[] data, int splitIndex) {
        int[] part1 = new int[splitIndex - 1];
        int[] part2 = new int[data.length - splitIndex];

        for (int i = 0; i < splitIndex; i++) {
            part1[i] = data[i];
        }

        for (int i = splitIndex + 1; i < data.length; i++) {
            part2[i] = data[i];
        }

        int[][] split = { part1, part2 };
        return split;
    }
}
