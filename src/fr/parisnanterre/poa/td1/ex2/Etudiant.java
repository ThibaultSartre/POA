package fr.parisnanterre.poa.td1.ex2;

/**
 * Created by thsartre on 25/09/2017.
 */
public class Etudiant extends Personnel {

    private double bourse;

    public double getBourse() {
        return bourse;
    }

    public Etudiant(String nom, String prenom, String id, double bourse) {
        super(nom, prenom, id);
        this.bourse = bourse;
    }

}
