package fr.parisnanterre.poa.td1.ex3;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public class Professeur extends EnseignantPermanent {
    public Professeur(String nom, String prenom, String id, double salaire, Date dateRecrutement, String domaineRecherche) {
        super(nom, prenom, id, salaire, dateRecrutement, domaineRecherche);
    }
}
