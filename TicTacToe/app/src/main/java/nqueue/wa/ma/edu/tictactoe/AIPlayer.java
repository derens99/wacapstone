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
<<<<<<< HEAD
        List<int[]> moves = new List<int[]>();
        int[][] board = g.getBoard();
        for(i = 0; i < 3;i++){
            for(j = 0; j<3;j++) {
                if (board[i][k] == null) {
=======
        List<int[]> moves = new ArrayList<int[]>();
        int[][] board = game.getBoard();
        for(int i = 0; i < 3){
            for(int j = 0; j<3;j++) {
                if (board[i][j] == null) {
>>>>>>> 3f45449bb112a721452e78375260a6544b7d0e4e
                    moves.add(new int[]{i, j});
                }
            }

        }
        return moves;
    }

}
