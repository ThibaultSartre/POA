package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class StateInsert implements State {

    int c;

    public StateInsert() {
        this.c = 0;
    }

    @Override
    public void give(MachineCafe m, int n) {
        if((c + n) < 10){
           c += n;
        }else{
            c = 0;
            m.setState(new StateGive());
        }
    }

    @Override
    public void askCoffee(MachineCafe m) {
        System.out.println("Pas possible");
    }

    @Override
    public void askTea(MachineCafe m) {
        System.out.println("Pas possible");
    }
}
