package fr.parisnanterre.poa.td1.ex3;

import java.util.ArrayList;

/**
 * Created by thsartre on 25/09/2017.
 */
public class Main {
    public static void main(String[] args) {
        Gestion dep = new Gestion();
        Professeur test = new Professeur("Thibault", "Sartre", "32", 50, null, "Langage C");
        test.ajouterDepartement(dep);
        SEGMI seg = new SEGMI(null,null,dep);
        Gestion gestion = seg.getGestion();
        System.out.println(gestion.getListPersonnel().get(0));
    }
}
