package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by drewh on 4/12/2017.
 */

public class Game {

    private icons[][] board;      //To be changed to Icons once class is created
    private Player player1;     //Player 1 will always be HumanPlayer
    private Player player2;     //Player 2 will either be HumanPlayer or AIPlayer
    private boolean player1turn;

    public enum icons(){
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
                board[i][j]= EMPTY;
            }
        }
    }

    public boolean makeMove(Move move){
        if(player1turn){
            board[move.getX(),move.getY()]=X;
            if(isWinner(player1)){

            }
        }
        else{
            board[move.getX(),move.getY()]=O;
            if(isWinner(player2)){

            }
        }
        player1turn!=player1turn;
    }

    public Player[][] getBoard(){
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
                if()
            }
        }
    }

}
