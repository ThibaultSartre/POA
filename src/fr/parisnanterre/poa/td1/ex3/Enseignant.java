package fr.parisnanterre.poa.td1.ex3;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class Enseignant extends Personnel {

    protected Contrat contract;

    public double getSalaire(){
        return contract.getSalaire();
    }

    protected Enseignant(String nom, String prenom, String id, double salaire, Date dateRecrutement) {
        super(nom, prenom, id);
    }

}
