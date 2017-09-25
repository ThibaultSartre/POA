package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 11/09/2017.
 */
public class Rectangle extends Shape2D {

    private double lenght;
    private double width;

    public Rectangle(Point2D refPoint, double length, double width) {
        super(refPoint);
        this.lenght = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (this.lenght * 2 + this.width * 2);
    }

    @Override
    public double surface() {
        return (this.lenght * this.width);
    }
}
