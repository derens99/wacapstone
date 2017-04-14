package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by drewh on 4/12/2017.
 */

public class Game {

    private Icon[][] board;         //Board array of symbols, all empty characters to start
    private Player playerX;         //Player 1 will always be HumanPlayer
    private Player playerO;         //Player 2 will either be HumanPlayer or AIPlayer
    private Icon currentPlayer;    //True if it is playerX's turn, false if otherwise

    /*Default constructor
    * @param Player pX -- Human player with move set to X
    * @param Player pO -- Either human or AI with move set to O */
    public Game(Player pX,Player pO){
        board = new Icon[3][];
        playerX = pX;
        playerO = pO;
        currentPlayer = Icon.X; //X goes first
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]= Icon.EMPTY;
                System.out.println(board.toString());
            }
        }
    }

    /*Takes next player's turn
    * @param int[] move -- 2 integer array of row and column respectively
    * @return boolean -- Determine if player won with move */
    public boolean nextPlayerMove(int[] move){
        Player p;
        if(currentPlayer == Icon.X) {
            p = playerX;
        }else {
            p = playerO;
        }
        boolean won = makeMove(move, p);
        currentPlayer = (currentPlayer==Icon.X) ? Icon.O : Icon.X;
        return won;
    }

    /*Make the move for Player p in the position indicated my int[] move
    * @param int[] move -- 2 integer array of row and column respectively
    * @param Player p -- Player who is taking their turn */
    public boolean makeMove(int[] move,Player p){
        if(board[move[0]][move[1]]!=Icon.EMPTY)
            throw new IllegalStateException("Cannot place symbol here.");
        if(p.equals(playerX)){
            board[move[0]][move[1]]=playerX.getIcon();
            if(isWinner(playerX)){
                return true;
            }
        }
        else{
            board[move[0]][move[1]]=playerO.getIcon();
            if(isWinner(playerO)){
                return true;
            }
        }
        return false;
    }

    /*Get the game board with positions of symbols
    * @return board -- Array of symbol characters */
    public Icon[][] getBoard(){
        return board;
    }

    /*Determine if Player p has three of their symbol in a row anywhere in board
    * @param Player p -- Player to determine if they have won or not
    * @return boolean -- True if Player p has won, false if otherwise */
    public boolean isWinner(Player p){
        if(checkRows(p)||checkColumns(p)||checkDiagonals(p))
            return true;
        return false;
    }

    /*Check for three in a row of Player p's symbol by rows
    * @param Player p -- Player to determine if they have won or not
    * @return boolean -- True if Player p has won, false if otherwise */
    public boolean checkRows(Player p){
        boolean win = true;
        for(int i=0;i<3;i++){
            win=true;
            for(int j=0;j<3;j++){
                if(board[i][j]!=p.getIcon())
                    win=false;
            }
            if(win)
                return true;
        }
        return false;
    }

    /*Check for three in a row of Player p's symbol by columns
    * @param Player p -- Player to determine if they have won or not
    * @return boolean -- True if Player p has won, false if otherwise */
    public boolean checkColumns(Player p){
        boolean win = true;
        for(int i=0;i<3;i++){
            win=true;
            for(int j=0;j<3;j++){
                if(board[j][i]!=p.getIcon())
                    win=false;
            }
            if(win)
                return true;
        }
        return false;
    }

    /*Check for three in a row of Player p's symbol by diagonals
    * @param Player p -- Player to determine if they have won or not
    * @return boolean -- True if Player p has won, false if otherwise */
    public boolean checkDiagonals(Player p){
        boolean win = true;
        for(int i=0;i<3;i++){
            if(board[2-i][i]!=p.getIcon())
                win = false;
        }
        if(win)
            return true;
        win=true;
        for(int i=0;i<3;i++){
            if(board[i][2-i]!=p.getIcon())
                win = false;
        }
        if(win)
            return true;
        return false;
    }

    public boolean AIGame(){
        return playerO instanceof AIPlayer;
    }

    public Icon getCurrentPlayer(){
        return currentPlayer;
    }

}
