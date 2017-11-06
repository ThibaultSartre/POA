package fr.parisnanterre.poa.TDBurger;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        Burger B = Restaurant.queue()
                             .menu(EnumMenu.MENU_BOEUF)
                             .ajout_fromage()
                             .ajout_oignon()
                             .cuisiner();
        System.out.println(B.toString());
    }
}
