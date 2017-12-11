package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public interface State {

    void give(MachineCafe m , int n);

    void askCoffee(MachineCafe m);

    void askTea(MachineCafe m);
}
