package nqueue.wa.ma.edu.tictactoe;

import java.io.Serializable;

/**
 * Created by AzizTaha on 4/12/2017.
 */

public class Player implements Serializable {

    private Icon icon;      //Either X, O, or EMPTY

    /*Default constructor
    *@param char s -- Either X or O, to be determined when player is created */
    public Player(Icon i){
        icon = i;
    }

    /*Get the move of this player
    * @return move -- Either X or O character */
    public Icon getIcon(){
        return icon;
    }

    /*Get the move of the ai player
   * @return move -- Either X or O character */
    public Icon getOpponentIcon(){
        Icon x;
        if(icon == Icon.X)
            return Icon.O;
        else
            return Icon.X;
    }

    public int determinePosition(){
        return 0;
    }
}
