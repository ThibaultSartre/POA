package fr.parisnanterre.poa.Visiteur;

/**
 * Created by thsartre on 04/12/2017.
 */
public class Visitor1 implements Visitor {
    @Override
    public void visit(Univers e) {
        System.out.println("Je suis un univers");
        for(Piece p : e.pieces){
            p.accept(this);
        }
    }

    @Override
    public void visit(Vetement e) {
        System.out.println("Je suis un vetement");
    }

    @Override
    public void visit(Piece e) {
        System.out.println("Je suis une pièce");
        for(Truc t : e.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Lit e) {
        System.out.println("Je suis un lit");
    }

    @Override
    public void visit(Lamp e) {
        System.out.println("Je suis une lampe");
    }

    @Override
    public void visit(GardeRobe e) {
        System.out.println("Je suis une garde robe");
        for(Vetement v : e.vetements){
            v.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres e) {
        System.out.println("Je suis une collection de " + e.getNbLivres() + " livre(s)");
    }

    @Override
    public void visit(Bureau e) {
        System.out.println("Je suis un bureau");
        for(Truc t : e.trucs){
            t.accept(this);
        }
    }
}
