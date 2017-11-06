package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Sauce extends Ingredient {

    public Sauce(EnumSauce s) {
        if(s == EnumSauce.BARBECUE)
        {
            this.nom = "Sauce Barbecue";
            this.prix = 10;
            this.calorie = 11;
            this.poids = 12;
        }
        if(s == EnumSauce.BURGER)
        {
            this.nom = "Sauce Burger";
            this.prix = 10;
            this.calorie = 11;
            this.poids = 12;
        }

    }

}
