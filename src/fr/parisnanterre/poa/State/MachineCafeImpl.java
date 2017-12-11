package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class MachineCafeImpl implements MachineCafe {

    State s;

    public MachineCafeImpl(State s) {
        this.s = s;
    }

    @Override
    public void give(int n) {
        s.give(this,n);
    }

    @Override
    public void askCoffee() {
        s.askCoffee(this);
    }

    @Override
    public void askTea() {
        s.askTea(this);
    }

    @Override
    public void setState(State s){
        this.s = s;
    }
}
