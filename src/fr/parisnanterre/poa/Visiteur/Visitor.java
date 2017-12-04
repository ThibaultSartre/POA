package fr.parisnanterre.poa.Visiteur;

/**
 * Created by thsartre on 04/12/2017.
 */
public interface Visitor {
    void visit(Univers e);
    void visit(Vetement e);
    void visit(Piece e);
    void visit(Lit e);
    void visit(Lamp e);
    void visit(GardeRobe e);
    void visit(CollectionDeLivres e);
    void visit(Bureau e);
}
