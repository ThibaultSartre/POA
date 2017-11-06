package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Burger B = Restaurant.queue()
                             .order_menu(EnumMenu.MENU_BOEUF)
                             .ajout_fromage()
                             .ajout_oignon()
                             .cuisiner();
        System.out.println(B.toString());
        Burger B2 = Restaurant.queue()
                .order_perso(EnumViande.BOEUF)
                .ajout_fromage()
                .ajout_oignon()
                .ajout_sauce(EnumSauce.BURGER)
                .cuisiner();
        System.out.println(B2.toString());
    }
}
