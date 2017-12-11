package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class StateRefGive implements StateRef {
    @Override
    public void give(MachineCadeRef m, int c) {
        System.out.println("Vous ne pouvez plus inserer d'argent");
    }

    @Override
    public void askCoffee(MachineCadeRef m) {
        System.out.println("Vouci votre cafe");
        m.setCash(m.getCash() - 10);
        m.setState(new StateRefRefound());
    }

    @Override
    public void asktea(MachineCadeRef m) {
        System.out.println("Voici votre the");
        m.setCash(m.getCash() - 10);
        m.setState(new StateRefRefound());
    }

    @Override
    public int getRefound(MachineCadeRef m) {
        int ref = m.getCash();
        m.setCash(0);
        return ref;
    }
}
