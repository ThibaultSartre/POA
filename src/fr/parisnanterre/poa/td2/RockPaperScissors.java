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

    public Result play(Player p1, Player p2){
        RPSEnum mvtJ1;
        RPSEnum mvtJ2;
        while((mvtJ1 = p1.getNextMove()) != null && (mvtJ2 = p2.getNextMove()) != null){
            switch(play(mvtJ1,mvtJ2)){
                case WIN :
                    p1.setScore();
                    break;
                case TIE :
                    p1.setScore();
                    p2.setScore();
                    break;
                case LOST :
                    p2.setScore();
                    break;
                default :
                    break;
            }
        }
        if(p1.getScore() > p2.getScore()) {
            return Result.WIN;
        }
        else if(p1.getScore() < p2.getScore()){
            return Result.LOST;
        }
        else{
            return Result.TIE;
        }
    }
}
