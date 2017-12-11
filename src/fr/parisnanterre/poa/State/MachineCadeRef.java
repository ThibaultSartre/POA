package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public interface MachineCadeRef {

    void give(int n);

    void askCoffee();

    void askTea();

    int getRefound();

    void setState(StateRef s);

    void setCash(int c);

    int getCash();

}
