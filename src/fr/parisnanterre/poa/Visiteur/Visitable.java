package fr.parisnanterre.poa.Visiteur;

/**
 * Created by thsartre on 04/12/2017.
 */
public interface Visitable {
    void accept(Visitor v);
}
