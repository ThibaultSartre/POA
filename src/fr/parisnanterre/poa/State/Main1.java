package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class Main1 {
    public static void main(String[] args) {
        MachineCafe m = new MachineCafeImpl(new StateInsert());
        m.askCoffee();
        m.give(5);
        m.askCoffee();
        m.give(30);
        m.give(2);
        m.askCoffee();
        m.give(1);
        m.askTea();
    }
}
