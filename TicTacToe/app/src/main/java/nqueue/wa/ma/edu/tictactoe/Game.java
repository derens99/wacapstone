package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by drewh on 4/12/2017.
 */

public class Game {

    private icons[][] board;      //To be changed to Icons once class is created
    private Player player1;     //Player 1 will always be HumanPlayer
    private Player player2;     //Player 2 will either be HumanPlayer or AIPlayer
    private boolean player1turn;

    public enum icons{
        EMPTY, X, O;
    }

    //Default constructor
    public Game(){
        board = new icons[3][3];
        player1 = new Player();
        player2 = new Player();
        player1turn = true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]= icons.EMPTY;
            }
        }
    }

    public boolean makeMove(int[] move){
        if(player1turn){
            board[move[0]][move[1]]=icons.X;
            if(isWinner(player1)){

            }
        }
        else{
            board[move[0]][move[1]]=icons.O;
            if(isWinner(player2)){

            }
        }
        player1turn=!player1turn;
        return false;
    }

    public icons[][] getBoard(){
        return board;
    }

    public boolean isWinner(Player p){
        if(checkRows(p)||checkColumns(p)||checkDiagonals(p))
            return true;
        return false;
    }

    public boolean checkRows(Player p){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //if()
            }
        }
        return false;
    }

    public boolean checkColumns(Player p){
        return false;
    }

    public boolean checkDiagonals(Player p){
        return false;
    }

}
