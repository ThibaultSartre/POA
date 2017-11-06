package fr.parisnanterre.poa.TD3;

/**
 * Created by thsartre on 06/11/2017.
 */
public class Singleton {
    private Singleton(){};

    private static final class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}