package fr.parisnanterre.poa.td1.ex3;

import java.util.ArrayList;

/**
 * Created by thsartre on 25/09/2017.
 */
public abstract class Departement {
    protected ArrayList<Personnel> listPersonnel;

    public Departement() {
        this.listPersonnel = new ArrayList<Personnel>();
    }

    public void ajouterPersonnel(Personnel personnel){
        listPersonnel.add(personnel);
    }

    ArrayList<Personnel> getListPersonnel() {
        return listPersonnel;
    }
}
