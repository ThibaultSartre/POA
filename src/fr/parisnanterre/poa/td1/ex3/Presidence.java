package fr.parisnanterre.poa.td1.ex3;

/**
 * Created by thsartre on 02/10/2017.
 */
public class Presidence extends UFR {

    private SecretariatGeneral secretariat;

    private Comptabilite comptabilite;

    public Presidence(SecretariatGeneral secretariat, Comptabilite comptabilite) {
        this.secretariat = secretariat;
        this.comptabilite = comptabilite;
    }

    public SecretariatGeneral getSecretariat() {
        return secretariat;
    }

    public Comptabilite getComptabilite() {
        return comptabilite;
    }
}
