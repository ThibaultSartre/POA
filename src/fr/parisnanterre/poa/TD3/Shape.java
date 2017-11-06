package fr.parisnanterre.poa.TD3;

import fr.parisnanterre.poa.td1.ex1.Point2D;
import fr.parisnanterre.poa.td1.ex1.Shape2D;
import fr.parisnanterre.poa.td1.ex1.Shape3D;
import fr.parisnanterre.poa.td1.ex1.Point3D;

/**
 * Created by thsartre on 06/11/2017.
 */
public interface Shape {
        Shape2D createShape2D(Point2D refPoint, double lenght, double width);
        Shape3D createShape3D(Point3D refPoint, double lenght, double width, double height);
        void move(int dX, int dY);
}

