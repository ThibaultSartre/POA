package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public interface MachineCafe {

    void give(int n);

    void askCoffee();

    void askTea();

    void setState(State s);
}
