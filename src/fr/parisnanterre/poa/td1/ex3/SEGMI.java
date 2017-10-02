package fr.parisnanterre.poa.td1.ex3;

/**
 * Created by thsartre on 02/10/2017.
 */
public class SEGMI extends UFR {

    private Mathematiques math;

    private Informatiques info;

    private Gestion ges;

    public SEGMI(Mathematiques math,Informatiques info, Gestion ges){
        this.math = math;
        this.info = info;
        this.ges = ges;
    }

    public Mathematiques getMath() {
        return math;
    }

    public Informatiques getInfo() {
        return info;
    }

    public Gestion getGes() {
        return ges;
    }
}
