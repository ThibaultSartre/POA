package fr.parisnanterre.poa.TD3;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Square /*extends Rectangle implements Shape*/ extends Shapes {
    static{
        ShapesFactory.registerShape("Square", new Square());
    }

    @Override
    Shapes createShape() {
        return null;
    }
    /*@Override
    public Shape2D createShape2D(Point2D refPoint, double lenght, double width){
        return new Square(refPoint, lenght, width);
    }
    @Override
    public Shape3D createShape3D(Point3D refPoint, double lenght, double width, double height) {
        return new Cuboid(refPoint, lenght, width, height);
    }*/


    /*private Square(Point2D refPoint, double lenght, double width) {
        super(refPoint, lenght, width);
    }*/
}