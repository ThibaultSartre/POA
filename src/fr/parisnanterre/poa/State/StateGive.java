package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class StateGive implements State {
    @Override
    public void give(MachineCafe m, int n) {
        System.out.println("Vous ne pouvez plus donner d'argent");
    }

    @Override
    public void askCoffee(MachineCafe m) {
        System.out.println("Voila votre cafe");
        m.setState(new StateInsert());
    }

    @Override
    public void askTea(MachineCafe m) {
        System.out.println("Voila votre the");
        m.setState(new StateInsert());
    }
}
