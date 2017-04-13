package nqueue.wa.ma.edu.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zackhillman on 4/12/17.
 */

public class AIPlayer {

    private Game game;

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

    public List<int[]> getListOfMoves(){

        List<int[]> moves = new ArrayList<int[]>();
        char[][] board = game.getBoard();
        for(int i = 0; i < 3;i++){
            for(int j = 0; j<3;j++) {
                if (board[i][j] == ' ') {
                    moves.add(new int[]{i, j});
                }
            }

        }
        return moves;
    }

}
