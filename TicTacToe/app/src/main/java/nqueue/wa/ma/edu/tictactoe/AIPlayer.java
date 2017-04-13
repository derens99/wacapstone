package nqueue.wa.ma.edu.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zackhillman on 4/12/17.
 */

public class AIPlayer extends Player{

    private Game game;
    private Icon[][] board;

    public enum difficulty{
        EASY, MEDIUM, HARD
    }

    private difficulty diff;

    //Pass in difficulty
    public AIPlayer(difficulty d){
        super(Icon.O);
        diff = d;
    }

    public int[] getNextMove(Game g){
        game = g;
        board = g.getBoard();
        return move();
    }

    public List<int[]> getListOfMoves(){

        List<int[]> moves = new ArrayList<int[]>();
        Icon[][] board = game.getBoard();
        for(int i = 0; i < 3;i++){
            for(int j = 0; j<3;j++) {
                if (board[i][j] == Icon.EMPTY) {
                    moves.add(new int[]{i, j});
                }
            }

        }
        return moves;
    }



    /** Get next best move for computer. Return int[2] of {row, col} */
    private int[] move() {
        int[] result = minimax(2, false); // depth, max turn
        return new int[] {result[1], result[2]};   // row, col
    }

    /** Recursive minimax at level of depth for either maximizing or minimizing player.
     Return int[3] of {score, row, col}  */
    private int[] minimax(int depth, boolean player) {
        // Generate possible next moves in a List of int[2] of {row, col}.
        List<int[]> nextMoves = getListOfMoves();

        // mySeed is maximizing; while oppSeed is minimizing
        int bestScore = (player) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int currentScore;
        int bestRow = -1;
        int bestCol = -1;

        if (nextMoves.isEmpty() || depth == 0) {
            // Gameover or depth reached, evaluate score
            bestScore = evaluate();
        } else {
            for (int[] move : nextMoves) {
                // Try this move for the current "player"
                if(player)
                    board[move[0]][move[1]] = Icon.X;
                else
                    board[move[0]][move[1]] = Icon.O;
                if (player) {  // mySeed (computer) is maximizing player
                    currentScore = minimax(depth - 1, true)[0];
                    if (currentScore > bestScore) {
                        bestScore = currentScore;
                        bestRow = move[0];
                        bestCol = move[1];
                    }
                } else {  // oppSeed is minimizing player
                    currentScore = minimax(depth - 1, false)[0];
                    if (currentScore < bestScore) {
                        bestScore = currentScore;
                        bestRow = move[0];
                        bestCol = move[1];
                    }
                }
                // Undo move
                board[move[0]][move[1]] = Icon.EMPTY;
            }
        }
        return new int[] {bestScore, bestRow, bestCol};
    }




    /** The heuristic evaluation function for the current board
     @Return +100, +10, +1 for EACH 3-, 2-, 1-in-a-line for computer.
     -100, -10, -1 for EACH 3-, 2-, 1-in-a-line for opponent.
     0 otherwise   */
    private int evaluate() {
        int score = 0;
        // Evaluate score for each of the 8 lines (3 rows, 3 columns, 2 diagonals)
        score += evaluateLine(0, 0, 0, 1, 0, 2);  // row 0
        score += evaluateLine(1, 0, 1, 1, 1, 2);  // row 1
        score += evaluateLine(2, 0, 2, 1, 2, 2);  // row 2
        score += evaluateLine(0, 0, 1, 0, 2, 0);  // col 0
        score += evaluateLine(0, 1, 1, 1, 2, 1);  // col 1
        score += evaluateLine(0, 2, 1, 2, 2, 2);  // col 2
        score += evaluateLine(0, 0, 1, 1, 2, 2);  // diagonal
        score += evaluateLine(0, 2, 1, 1, 2, 0);  // alternate diagonal
        return score;
    }

    /** The heuristic evaluation function for the given line of 3 cells
     @Return +100, +10, +1 for 3-, 2-, 1-in-a-line for computer.
     -100, -10, -1 for 3-, 2-, 1-in-a-line for opponent.
     0 otherwise */
    private int evaluateLine(int row1, int col1, int row2, int col2, int row3, int col3) {
        int score = 0;

        // First cell
        if (board[row1][col1] == Icon.O) {
            score = 1;
        } else if (board[row1][col1] == Icon.X) {
            score = -1;
        }

        // Second cell
        if (board[row2][col2] == Icon.O) {
            if (score == 1) {   // cell1 is mySeed
                score = 10;
            } else if (score == -1) {  // cell1 is oppSeed
                return 0;
            } else {  // cell1 is empty
                score = 1;
            }
        } else if (board[row2][col2] == Icon.X) {
            if (score == -1) { // cell1 is oppSeed
                score = -10;
            } else if (score == 1) { // cell1 is mySeed
                return 0;
            } else {  // cell1 is empty
                score = -1;
            }
        }

        // Third cell
        if (board[row3][col3] == Icon.O) {
            if (score > 0) {  // cell1 and/or cell2 is mySeed
                score *= 10;
            } else if (score < 0) {  // cell1 and/or cell2 is oppSeed
                return 0;
            } else {  // cell1 and cell2 are empty
                score = 1;
            }
        } else if (board[row3][col3] == Icon.X) {
            if (score < 0) {  // cell1 and/or cell2 is oppSeed
                score *= 10;
            } else if (score > 1) {  // cell1 and/or cell2 is mySeed
                return 0;
            } else {  // cell1 and cell2 are empty
                score = -1;
            }
        }
        return score;
    }




}


