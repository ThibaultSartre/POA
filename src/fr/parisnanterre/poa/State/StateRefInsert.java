package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class StateRefInsert implements StateRef {
    @Override
    public void give(MachineCadeRef m, int c) {
        int cash = m.getCash() + c;
        m.setCash(cash);
        if(cash >= 10){
            m.setState(new StateRefGive());
        }
    }

    @Override
    public void askCoffee(MachineCadeRef m) {
        System.out.println("Pas possible1");
    }

    @Override
    public void asktea(MachineCadeRef m) {
        System.out.println("Pas possible1");
    }

    @Override
    public int getRefound(MachineCadeRef m) {
        int ref = m.getCash();
        m.setCash(0);
        return ref;
    }
}
