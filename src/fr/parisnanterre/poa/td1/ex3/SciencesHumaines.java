package fr.parisnanterre.poa.td1.ex3;

/**
 * Created by thsartre on 02/10/2017.
 */
public class SciencesHumaines extends UFR {

    private Langues langues;

    private Philosophie philosophie;

    public SciencesHumaines(Langues langues, Philosophie philosophie) {
        this.langues = langues;
        this.philosophie = philosophie;
    }

    public Langues getLangues() {
        return langues;
    }

    public Philosophie getPhilosophie() {
        return philosophie;
    }
}
