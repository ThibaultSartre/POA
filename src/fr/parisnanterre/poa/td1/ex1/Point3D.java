package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public boolean isOrigin() {

        if(super.isOrigin() && z == 0)
            return true;
        else
            return false;
    }

    public void translate(double x, double y, double z){
        super.translate(x,y);
        this.z = z;
    }

    public double distance(Point3D p){
        return Math.sqrt(Math.pow(p.getX() - this.getX(), 2.0)  + Math.pow(p.getY() - this.getY(), 2.0) + Math.pow(p.z - this.z, 2.0));
    }



}
