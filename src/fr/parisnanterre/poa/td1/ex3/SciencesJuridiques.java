package fr.parisnanterre.poa.td1.ex3;

/**
 * Created by thsartre on 02/10/2017.
 */
public class SciencesJuridiques extends UFR {

    private Droit droit;

    public SciencesJuridiques(Droit droit) {
        this.droit = droit;
    }

    public Droit getDroit() {
        return droit;
    }
}
