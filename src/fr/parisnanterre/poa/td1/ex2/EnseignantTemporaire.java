package fr.parisnanterre.poa.td1.ex2;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class EnseignantTemporaire extends Enseignant {

    public EnseignantTemporaire(String nom, String prenom, String id, double salaire, Date dateRecrutement, Date dateFinContrat) {
        super(nom, prenom, id, salaire, dateRecrutement);
        this.contract = new CDD(dateRecrutement,salaire,dateFinContrat);
    }
}
