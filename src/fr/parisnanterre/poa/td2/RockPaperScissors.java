package fr.parisnanterre.poa.td2;

/**
 * Created by thsartre on 02/10/2017.
 */
public class RockPaperScissors {
    public Result play(RPSEnum p1, RPSEnum p2) {
        if ((p1.getName() == "paper" && p2.getName() == "rock") ||
                (p1.getName() == "rock" && p2.getName() == "scissors") ||
                (p1.getName() == "scissors" && p2.getName() == "paper"))
            return Result.WIN;

        if ((p1.getName() == "paper" && p2.getName() == "paper") ||
                (p1.getName() == "rock" && p2.getName() == "rock") ||
                (p1.getName() == "scissors" && p2.getName() == "scissors"))
            return Result.TIE;
        if ((p1.getName() == "paper" && p2.getName() == "scissors") ||
                (p1.getName() == "scissors" && p2.getName() == "rock") ||
                (p1.getName() == "rock" && p2.getName() == "paper"))
            return Result.LOST;
        return null;
    }
}
