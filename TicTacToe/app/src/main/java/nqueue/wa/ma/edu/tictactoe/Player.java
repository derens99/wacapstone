package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by AzizTaha on 4/12/2017.
 */

public class Player {

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

    public int determinePosition(){
        return 0;
    }

}
