package fr.parisnanterre.poa.td1.ex3;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public class Biatoss extends Personnel {

    protected Contrat contract;

    public Double getSalaire(){
        return contract.getSalaire();
    }

    public Biatoss(String nom, String prenom, String id, double salaire, Date dateRecrutement, Date dateFinContrat) {
        super(nom, prenom, id);

        this.contract = new CDD(dateRecrutement,salaire,dateFinContrat);
    }
}
