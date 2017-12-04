package fr.parisnanterre.poa.Visiteur;

/**
 * Created by thsartre on 04/12/2017.
 */
public class Visiteur3 implements VisiteurAvecValeur {

    private int nb;

    @Override
    public Object value() {
        return nb;
    }

    @Override
    public void visit(Univers e) {
        for(Piece p : e.pieces){
            p.accept(this);
        }
    }

    @Override
    public void visit(Vetement e) {
        nb += 1;
    }

    @Override
    public void visit(Piece e) {
        for(Truc t : e.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Lit e) {
        nb += 1;
    }

    @Override
    public void visit(Lamp e) {
        nb += 1;
    }

    @Override
    public void visit(GardeRobe e) {
        for(Vetement v : e.vetements){
            v.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres e) {
        nb += e.getNbLivres();
    }

    @Override
    public void visit(Bureau e) {
        for(Truc t : e.trucs){
            t.accept(this);
        }
    }
}
