package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class MachineCadeRefImpl implements MachineCadeRef {

    int cash;

    StateRef s;

    public MachineCadeRefImpl(StateRef s) {
        this.s = s;
        this.cash = 0;
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
        s.asktea(this);
    }

    @Override
    public int getRefound() {
        return s.getRefound(this);
    }

    @Override
    public void setState(StateRef s) {
        this.s = s;
    }

    @Override
    public void setCash(int c) {
        this.cash = c;
    }

    @Override
    public int getCash() {
        return cash;
    }
}
