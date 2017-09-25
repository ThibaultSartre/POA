package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ((4 * Math.PI * Math.pow(this.radius , 3.0))/ 3);
    }

    @Override
    public double surface() {
        return (4 * Math.PI * Math.pow(this.radius , 2.0));
    }
}
