package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by Deren on 4/14/2017.
 */
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class GameUnitTest {

    private Player player1 = new Player(Icon.X);
    private Player player2 = new Player(Icon.O);
    private Game game = new Game(player1, player2);

    @org.testng.annotations.Test
    public void testIfGameIsAI(){
        assertEquals(false, game.AIGame());
    }

    public void testFirstCurrentPlayer(){
        assertEquals(Icon.X, game.getCurrentPlayer());
    }

    public void checkInitialDiagnals(){
        assertEquals(false, game.checkDiagonals(player1));
        assertEquals(false, game.checkDiagonals(player2));
    }

    public void checkRows(){
        game.makeMove(new int[]{0,0}, player1);
        game.makeMove(new int[]{0,1}, player1);
        assertEquals(true, game.makeMove(new int[]{0,2}, player1));
    }

    public void checkColums(){
        game = new Game(player1, player2);
        game.makeMove(new int[]{0,0}, player1);
        game.makeMove(new int[]{1,0}, player1);
        assertEquals(true, game.makeMove(new int[]{2,0}, player1));
    }

    public void checkFirstDiagonal(){
        game = new Game(player1, player2);
        game.makeMove(new int[]{0,0}, player1);
        game.makeMove(new int[]{1,1}, player1);
        assertEquals(true, game.makeMove(new int[]{2,2}, player1));
    }

    public void checkSecondDiagonal(){
        game = new Game(player1, player2);
        game.makeMove(new int[]{0,2}, player1);
        game.makeMove(new int[]{1,1}, player1);
        assertEquals(true, game.makeMove(new int[]{2, 0}, player1));
    }

}
