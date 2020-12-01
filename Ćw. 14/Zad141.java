public class Zad141{
    public static void main(String[] args) {
        int dates[] = new int [365];
        int data = 365;
        int counter = 0;

        while(true){
            int rand = (int)(Math.random()*data);
            dates[rand]++;
            counter++;
            if (dates[rand] >1)
                break;
        }

        System.out.println(counter);
    }
}