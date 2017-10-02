package fr.parisnanterre.poa.td1.ex3;

/**
 * Created by thsartre on 02/10/2017.
 */
public class SEGMI extends UFR {

    private Mathematiques mathematique;

    private Informatiques informatique;

    private Gestion gestion;

    public SEGMI(Mathematiques math,Informatiques info, Gestion ges){
        this.mathematique = math;
        this.informatique = info;
        this.gestion = ges;
    }

    public Mathematiques getMath() {
        return mathematique;
    }

    public Informatiques getInfo() {
        return informatique;
    }

    public Gestion getGes() {
        return gestion;
    }
}
