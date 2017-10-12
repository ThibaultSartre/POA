package fr.parisnanterre.poa.td2;

/**
 * Created by thsartre on 02/10/2017.
 */
public enum RPSEnum {
    ROCK("rock"),PAPER("paper"),SCISSORS("scissors");

    private String name;

    RPSEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
