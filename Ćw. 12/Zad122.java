public class Zad122{
    public static void main(String[] args) {
        int[] tab = {2,1,3,4,4,3,2,1};

        int para1 = 0;
        int para2 = 0;
        int index = 0;
        int index1 = 0;
        int index2 = 0;

        for(int i : tab){
            if (i > para1){
                para2 = para1;
                para1 = i;
                index1 = index;
            }
            else if (i > para2){
                para2 = i;
                index2 = index;
            }
            index++;
        }

        int sum = tab[index1] + tab[index2];
        for (int i = 0; i < tab.length; i++) {
            if (sum > tab[i]){
                continue;
            }
            else{
                System.out.print(false);
                System.exit(0);
            }
        }

        System.out.println(true);
    }
}