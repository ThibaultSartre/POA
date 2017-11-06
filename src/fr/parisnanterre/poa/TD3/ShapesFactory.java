package fr.parisnanterre.poa.TD3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thsartre on 06/11/2017.
 */
public final class ShapesFactory {
    private static ShapesFactory instance;
    private static Map<String, Shapes> register = new HashMap<String, Shapes>();
    public static void registerShape(String nom, Shapes s){
        register.put(nom, s);
    }

    public Shapes createShape(String name){
        return register.get(name).createShape();
    }

    public static ShapesFactory getInstance(){
        if(instance == null){
            instance = new ShapesFactory();
        }
        return instance;
    }
}