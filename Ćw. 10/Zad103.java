public class Zad103 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double weight = scan.nextDouble();
        int[] values = new int[] {1000, 500, 200, 100, 50, 25, 10, 5, 1};
        int[] times = new int[9];

        if(weight >= 2.5){
            System.out.println("Value out of range");
        }
        else{
            weight *= 1000;
            for (int i=0; i<values.length; i++){
                if (weight - values[i] < 0){
                    continue;
                }
                else{
                    times[i]++;
                    weight -= values[i];
                    if (weight >= values[i])
                        i--;
                }
            }
            for (int i=0; i<values.length; i++){
                if (times[i] == 0){
                    continue;
                }
                else{
                    System.out.println(times[i]+" * "+values[i]);
                }
            }
        }
        scan.close();
    }
}
