package fr.parisnanterre.poa.td1.ex2;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class Contrat {

    private double salaire;

    private Date debut;

    public double getSalaire() {

        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDebut() {
        return debut;
    }


    public Contrat(Date debut, double salaire) {
        this.salaire = salaire;
        this.debut = debut;
    }
}
