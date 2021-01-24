class Punkt2D{
    protected int x, y;

    public Punkt2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double length(Punkt2D p){
        return Math.sqrt(Math.pow(Math.abs(this.x-p.x), 2) + Math.pow(Math.abs(this.y-p.y), 2));
    }
}

class Punkt3D extends Punkt2D{
    protected int z;

    public Punkt3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}