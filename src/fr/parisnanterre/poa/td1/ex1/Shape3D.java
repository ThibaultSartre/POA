package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public abstract class Shape3D extends Shape implements Translatable3D {
    private Point3D refPoint;

    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    public Point3D getRefPoint() {
        return refPoint;
    }

    public abstract double volume();
}
