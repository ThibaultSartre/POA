package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Viande extends Ingredient {

    public Viande(EnumViande v) {
        if(v == EnumViande.BOEUF)
        {
            this.nom = "Boeuf";
            this.prix = 10;
            this.calorie = 11;
            this.poids = 12;
        }
        if(v == EnumViande.POULET)
        {
            this.nom = "Poulet";
            this.prix = 10;
            this.calorie = 11;
            this.poids = 12;
        }
        if(v == EnumViande.POISSON)
        {
            this.nom = "Poisson";
            this.prix = 10;
            this.calorie = 11;
            this.poids = 12;
        }

    }

}
