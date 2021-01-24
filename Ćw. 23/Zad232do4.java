public class Zad232do4 {
    public static void main(String[] args) {
        
    }
}

class BallIn{
    double radius;

    public BallIn(Cylinder c){
        this.radius = Math.min(c.getRadius(), c.getHeight())/2;
    }

    public BallIn(Square s){
        this.radius = s.getSide()/2;
    }
}

class BallOut{
    double radius;

    public BallOut(Cylinder c){
        this.radius = Math.sqrt(Math.pow(c.getHeight(), 2) + Math.pow(c.getRadius()*2, 2))/2;
    }

    public BallOut(Square s){
        this.radius = s.getSide()*Math.sqrt(2);
    }
}

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return this.radius;
    }

    public int getHeight(){
        return this.height;
    }

    public void show(){
        System.out.println(Math.pow(radius, 2)*Math.PI);
        System.out.println(Math.pow(radius, 2)*Math.PI*height);
    }
}

class Square{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }

    public void show(){
        System.out.println(Math.pow(side, 2));
        System.out.println(Math.pow(side, 3));
    }
}
