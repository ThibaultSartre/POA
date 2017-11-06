package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public abstract class Ingredient {

    protected String nom;

    protected double prix;

    protected double poids;

    protected int calorie;



    public double getPrix() {
        return prix;
    }

    public double getPoids() {
        return poids;
    }

    public double getCalorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return  "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", poids=" + poids +
                ", calorie=" + calorie;
    }
}
