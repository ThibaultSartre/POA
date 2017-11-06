package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Restaurant {
    private static Restaurant instance;

    public static Restaurant queue(){
        if(instance == null){
            instance = new Restaurant();
        }
        return instance;
    }

    public Burger.BurgerBuilder menu(EnumViande v){
        Burger.BurgerBuilder bb = new Burger.BurgerBuilder(v);
        bb.ajout_sauce(EnumSauce.BURGER);
        bb.ajout_fromage();
        bb.ajout_tomate();
        return bb;
    }
}
