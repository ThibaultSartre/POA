package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate (double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("X: "+ this.x + " Y: " + this.y);
    }

    public boolean isOrigin(){
        if(x == 0 && y == 0)
            return true;
        else
            return false;
    }

    public double distance(Point2D p){
        return Math.sqrt(Math.pow(p.x - this.x, 2.0)  + Math.pow(p.y - this.y, 2.0));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
