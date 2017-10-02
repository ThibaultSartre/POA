package fr.parisnanterre.poa.td2;

/**
 * Created by thsartre on 02/10/2017.
 */
public enum Result {
    WIN("win"),LOST("lost"),TIE("tie");

    private String result;

    private Result(String result){
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
