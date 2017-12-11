package fr.parisnanterre.poa.State;

/**
 * Created by thsartre on 11/12/2017.
 */
public class Main2 {

    public static void main(String[] args) {
        MachineCadeRef m = new MachineCadeRefImpl(new StateRefInsert());
        m.askCoffee();
        m.give(5);
        m.askCoffee();
        m.give(10);
        m.askTea();
        m.give(20);
        System.out.println(m.getRefound());
        System.out.println(m.getRefound());
        m.askCoffee();

    }
}
