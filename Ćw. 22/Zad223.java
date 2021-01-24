import java.util.LinkedList;

public class Zad223 {
    public static void main(String[] args) {
        int no_baloons = 0; 
        while (Donkey.isFlying() == false) {
            Baloon Baloon = new Baloon();
            Donkey.addBaloon(Baloon);
            no_baloons++;
        }
        System.out.println(no_baloons);
   }
}

class Baloon {

   double size;
   double load;

   public Baloon() {
        this.size = 5 + Math.random() * 4;
        this.load = getLoad();
   }

   public double getLoad() {
       return 7 * this.size / 6;
   }
}

class Donkey {
   public static double mass = 70000;
   public static LinkedList<Baloon> baloons = new LinkedList<Baloon>();

   public static void addBaloon(Baloon Baloon) {
       baloons.add(Baloon);
   }

   static boolean isFlying() {
       double baloons_mass = 0;
       for (Baloon baloon : baloons) {
           baloons_mass += baloon.getLoad();
       }
       if (baloons_mass > Donkey.mass)
            return true;
        else
            return false;
    }
}


