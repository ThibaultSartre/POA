package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Restaurant {
    private static Restaurant instance;

    private Restaurant() {
    }

    public static Restaurant queue(){
        if(instance == null){
            instance = new Restaurant();
        }
        return instance;
    }

    public Burger.BurgerBuilder order_perso(EnumViande v){
        return new Burger.BurgerBuilder(v);
    }

    public Burger.BurgerBuilder order_menu(EnumMenu m){
        Burger.BurgerBuilder bb = null;
        switch (m){
            case MENU_BOEUF :
                bb = new Burger.BurgerBuilder(EnumViande.BOEUF);
                bb.ajout_sauce(EnumSauce.BURGER);
                bb.ajout_fromage();
                bb.ajout_oignon();
                bb.ajout_tomate();
                break;
            case MENU_POISSON:
                bb = new Burger.BurgerBuilder(EnumViande.POISSON);
                bb.ajout_sauce(EnumSauce.BURGER);
                bb.ajout_tomate();
                break;
            case MENU_POULET:
                bb = new Burger.BurgerBuilder(EnumViande.POULET);
                bb.ajout_sauce(EnumSauce.BARBECUE);
                bb.ajout_fromage();
                bb.ajout_tomate();
                break;
        }
        return bb;
    }
}
