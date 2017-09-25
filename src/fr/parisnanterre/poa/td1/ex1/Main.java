package fr.parisnanterre.poa.td1.ex1;
/**
 * Created by thsartre on 12/09/2017.
 */
public class Main {
    public static void main(String[] args) {
        /*Point3D point = new Point3D(1,2,3);
        Point3D point2 = new Point3D(2,2,3);
        System.out.println(point.distance(point2));
        Point2D p1 = new Point2D(1,3);
        Point2D p2 = new Point2D(3,1);
        System.out.println(p1.distance(p2));
        Point3D point3 = new Point3D(0,0,0);
        Sphere sph = new Sphere(point3, 1);
        System.out.println(sph.volume());*/
        Point2D p3 = new Point2D(0,0);
        Rectangle rec = new Rectangle(p3,3,2);
        System.out.println(rec.perimeter());
    }
}
