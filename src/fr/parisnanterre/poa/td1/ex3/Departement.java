package fr.parisnanterre.poa.td1.ex3;

import fr.parisnanterre.poa.td1.ex2.Personnel;

import java.util.ArrayList;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class Departement {
    ArrayList<Personnel> listPersonnel;
    String libelle;

    public Departement(String libelle) {
        this.listPersonnel = new ArrayList<Personnel>();
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "libelle='" + libelle + '\'' +
                '}';
    }
}
