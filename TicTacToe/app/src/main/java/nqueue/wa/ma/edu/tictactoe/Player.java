package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by AzizTaha on 4/12/2017.
 */

public class Player {

    private char symbol;      //Either X or O

    /*Default constructor
    *@param char s -- Either X or O, to be determined when player is created */
    public Player(char s){
        symbol = s;
    }

    /*Get the move of this player
    * @return move -- Either X or O character */
    public char getSymbol(){
        return symbol;
    }

    /*Get the move of the player's opponent
      @return move -- Either x or o character depending on who is the opponent
     */
    public char getOpponentSymbol(){
        if(symbol == 'X')
            return 'O';
        else
            return 'X';
    }

}
