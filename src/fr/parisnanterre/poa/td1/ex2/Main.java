package fr.parisnanterre.poa.td1.ex2;

/**
 * Created by thsartre on 25/09/2017.
 */
public class Main {
    public static void main(String[] args) {
        EnseignantPermanent test = new EnseignantPermanent("Thibault", "Sartre", "32", 50, null, "Langage C") {
        };
        System.out.println(test.toString());
    }
}
