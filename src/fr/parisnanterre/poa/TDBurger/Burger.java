package fr.parisnanterre.poa.TDBurger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Burger {
    private List<Ingredient> listIngredient;

    Burger(BurgerBuilder bb){
        this.listIngredient = bb.listIngredient;
    }

    public static class BurgerBuilder{
        private List<Ingredient> listIngredient;

        BurgerBuilder(EnumViande v){
            listIngredient = new ArrayList<Ingredient>();
            listIngredient.add(new Viande(v));
        }

        BurgerBuilder ajout_tomate(){
            listIngredient.add(new Tomate());
            return this;
        }

        BurgerBuilder ajout_oignon(){
            listIngredient.add(new Oignon());
            return this;
        }

        BurgerBuilder ajout_fromage(){
            listIngredient.add(new Fromage());
            return this;
        }

        BurgerBuilder ajout_sauce(EnumSauce s){
            listIngredient.add(new Sauce(s));
            return this;
        }

        Burger cuisiner(){
            return new Burger(this);
        }
    }

    @Override
    public String toString() {
        String rtn = "";
        for(Ingredient i : listIngredient){
            rtn += i.toString() + "\n";
        }
        return rtn;
    }
}
