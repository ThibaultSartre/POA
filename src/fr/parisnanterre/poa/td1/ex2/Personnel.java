package fr.parisnanterre.poa.td1.ex2;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class Personnel {
    private String nom;
    private String prenom;
    private String id;

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

    public Personnel(String nom, String prenom, String numSecu) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = numSecu;
    }
}
