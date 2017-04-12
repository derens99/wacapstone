package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by zackhillman on 4/12/17.
 */

public class AIPlayer {

    public enum difficulty{
        EASY, MEDIUM, HARD
    }

    private difficulty diff;

    //Pass in difficulty
    public AIPlayer(difficulty d){
        diff = d;
    }

    public int getNextMove(Game g){
        return 0;
    }

}
