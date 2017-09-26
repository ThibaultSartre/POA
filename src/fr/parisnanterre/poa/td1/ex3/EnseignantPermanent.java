package fr.parisnanterre.poa.td1.ex3;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class EnseignantPermanent extends Enseignant {

    private String domaineRecherche;

    public void setDomaineRecherche(String domaineRecherche) {
        this.domaineRecherche = domaineRecherche;
    }

    public String getDomaineRecherche() {

        return domaineRecherche;
    }

    @Override
    public String toString() {
        return  "EnseignantPermanent{" +
                "prenom='" + this.getPrenom() + '\'' +
                ", nom='" + this.getNom() + '\'' +
                ", domaineRecherche='" + domaineRecherche + '\'' +
                '}';
    }

    public double augmentation(double augmentation){
        contract.setSalaire(contract.getSalaire() + augmentation);
        return contract.getSalaire();
    }



    public EnseignantPermanent(String nom, String prenom, String id, double salaire, Date dateRecrutement, String domaineRecherche) {
        super(nom, prenom, id, salaire, dateRecrutement);
        this.domaineRecherche = domaineRecherche;
        this.contract = new CDI(dateRecrutement,salaire);
    }

}
