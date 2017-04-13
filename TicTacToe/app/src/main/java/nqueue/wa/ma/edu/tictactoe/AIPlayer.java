package nqueue.wa.ma.edu.tictactoe;

import java.util.List;

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

    public List<int[]> getListOfMoves(){
        List<int[]> moves = new List<int[]>();
        int[][] board = g.getBoard();
        for(i = 0; i < 3;i++){
            for(j = 0; j<3;j++) {
                if (board[i][k] == null) {
                    moves.add(new int[]{i, j});
                }
            }

        }
        return moves;
    }

}
