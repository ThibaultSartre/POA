package fr.parisnanterre.poa.td1.ex2;

import java.util.Date;

/**
 * Created by thsartre on 25/09/2017.
 */
public class CDD extends Contrat {

    private Date dateFin;

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateFin() {

        return dateFin;
    }

    public CDD(Date debut, double salaire , Date dateFin) {
        super(debut, salaire);
        this.dateFin = dateFin;
    }
}
