package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public interface StateRef {

    void give(MachineCadeRef m, int c);

    void askCoffee(MachineCadeRef m);

    void asktea(MachineCadeRef m);

    int getRefound(MachineCadeRef m);
}
