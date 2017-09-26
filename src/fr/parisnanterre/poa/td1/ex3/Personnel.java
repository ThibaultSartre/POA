package fr.parisnanterre.poa.td1.ex3;

import fr.parisnanterre.poa.td1.ex3.Departement;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class Personnel {
    private String nom;
    private String prenom;
    private String id;
    private Departement departement;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    public Departement getDepartement() {
        return departement;
    }

    public Personnel(String nom, String prenom, String id) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.departement = null;
    }

    public void ajouterDepartement (Departement departement){
        this.departement = departement;
        this.departement.ajouterPersonnel(this);
    }
}
