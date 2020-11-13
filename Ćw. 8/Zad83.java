import java.util.Scanner;

public class Zad83 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double data = scan.nextInt();
        String fromUnit = scan.next();
        String toUnit = scan.next();
        switch(fromUnit){
            case "g":
                switch(toUnit){
                    case "oz":
                        System.out.println(data*0.035274);
                        break;
                    case "lb":
                        System.out.println(data*0.00220462);
                        break;
                    case "st":
                        System.out.println(data*0.000157473);
                        break;
                }
            case "dag":
                switch(toUnit){
                    case "oz":
                        System.out.println(data*10*0.035274);
                        break;
                    case "lb":
                        System.out.println(data*10*0.00220462);
                        break;
                    case "st":
                        System.out.println(data*10*0.000157473);
                        break;
                }
            case "kg":
                switch(toUnit){
                    case "oz":
                        System.out.println(data*1000*0.035274);
                        break;
                    case "lb":
                        System.out.println(data*1000*0.00220462);
                        break;
                    case "st":
                        System.out.println(data*1000*0.000157473);
                        break;
                }
        }
    }
}
