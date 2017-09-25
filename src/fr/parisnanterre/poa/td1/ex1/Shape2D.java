package fr.parisnanterre.poa.td1.ex1;

/**
 * Created by thsartre on 11/09/2017.
 */
public abstract class Shape2D extends Shape implements Translatable2D {
    private Point2D refPoint;

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }

    public abstract double perimeter();
}
