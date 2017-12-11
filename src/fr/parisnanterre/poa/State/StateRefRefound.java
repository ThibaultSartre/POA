package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class StateRefRefound implements StateRef {
    @Override
    public void give(MachineCadeRef m, int c) {
        System.out.println("Pas possible3");
    }

    @Override
    public void askCoffee(MachineCadeRef m) {
        System.out.println("Pas possible3");
    }

    @Override
    public void asktea(MachineCadeRef m) {
        System.out.println("Pas possible3");
    }

    @Override
    public int getRefound(MachineCadeRef m) {
        int ref = m.getCash();
        m.setCash(0);
        m.setState(new StateRefInsert());
        return ref;
    }
}
