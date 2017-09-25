package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public class Cuboid extends Shape3D {

    private double length;
    private double width;
    private double height;

    public Cuboid(Point3D refPoint, double length, double width, double height) {
        super(refPoint);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume() {
        return (this.height * this.length * this.width);
    }

    @Override
    public double surface() {
        return (2 * (this.length * this.width + this.width * this.height + this.length * this.height));
    }
}
