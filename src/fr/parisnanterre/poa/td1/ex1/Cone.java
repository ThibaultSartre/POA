package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone(Point3D refPoint, double height, double radius) {
        super(refPoint);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ((Math.PI * Math.pow(this.radius , 2.0) * this.height)/ 3);
    }

    @Override
    public double surface() {
        double S = Math.sqrt(Math.pow(this.radius , 2.0) + Math.pow(this.height , 2.0));
        return (Math.PI * this.radius * S + Math.PI * Math.pow(this.radius , 2.0));
    }
}
