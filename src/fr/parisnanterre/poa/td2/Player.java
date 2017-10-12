package fr.parisnanterre.poa.td2;

import java.util.ArrayList;

/**
 * Created by thsartre on 12/10/2017.
 */
public class Player {
    private String nom;
    private int score;
    private int nb_mouvement;
    private ArrayList<RPSEnum> listCoups;

    public Player(String nom, ArrayList<RPSEnum> listCoups) {
        this.nom = nom;
        this.listCoups = listCoups;
        this.score = 0;
    }

    public Player(String nom,int nb_mouvement){
        this.nom = nom;
        this.score = 0;
        this.nb_mouvement = nb_mouvement;
        for(int i = 0; i < this.nb_mouvement; i++){
            switch((int) (Math.random() * 2)){
                case 0 :
                    this.listCoups.add(RPSEnum.PAPER);
                    break;
                case 1 :
                    this.listCoups.add(RPSEnum.SCISSORS);
                    break;
                case 2 :
                    this.listCoups.add(RPSEnum.ROCK);
                    break;
                default :
                    break;
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public int getNb_mouvement() {
        return nb_mouvement;
    }

    public RPSEnum getNextMove(){
        if(listCoups.size() == 0)
            return null;
        RPSEnum rep = listCoups.get(0);
        listCoups.remove(0);
        return rep;
    }
}
