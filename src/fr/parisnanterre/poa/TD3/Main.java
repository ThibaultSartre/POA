package fr.parisnanterre.poa.TD3;



/**
 * Created by thsartre on 06/11/2017.
 */
public class Main {
    static {
        try {
            //Class.forName("shapes.Circle");
            Class.forName("fr.parisnanterre.poa.TD3.Square");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ShapesFactory sf = ShapesFactory.getInstance();
        sf.createShape("Square");
    }

    /*
        SHAPE FACTORY
        - Shape create(...) -> param pour deviner la classe = String ou Enum
        -------------------------------------------------------------------------
        - Shape2D createS2D(...)
        - Shape3D createS3D(...)
        -------------------------------------------------------------------------
        - Square createSquare(...) -> ne pas utiliser, car il faut downcast
        - Shape createSquare(...) -> ne pas utiliser, car il faut downcast
        -------------------------------------------------------------------------
        - Shape2D createSquare(...)
        - Shape3D createSquare(...)
     */
}