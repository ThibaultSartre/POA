package fr.parisnanterre.poa.td1.ex3;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public class Vacataire extends EnseignantTemporaire {
    public Vacataire(String nom, String prenom, String id, double salaire, Date dateRecrutement, Date dateFinContrat) {
        super(nom, prenom, id, salaire, dateRecrutement, dateFinContrat);
    }
}
