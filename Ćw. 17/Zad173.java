public class Zad173 {
    static boolean isArmstrongNumber (int num){
        int num_start = num;
        int remainder, armstrong_check = 0;

        while (num_start != 0){
            remainder = num_start % 10;
            armstrong_check += Math.pow(remainder, 3);
            num_start /= 10; 
        }

        if (num == armstrong_check)
            return true;
        else
            return false;
    }
}
