package fr.parisnanterre.poa.td2;

/**
 * Created by thsartre on 02/10/2017.
 */
public class RockPaperScissors {
    public Result play(RPSEnum p1, RPSEnum p2){
        if(p1.getName() == "paper" && p2.getName() == "rock")
            return Result.WIN;
        return Result.LOST;
    }
}
