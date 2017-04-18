package nqueue.wa.ma.edu.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class board extends AppCompatActivity{

    public Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    public Game game;



    public void init(){
        b1 = (Button)findViewById(R.id.one);
        b2 = (Button)findViewById(R.id.two);
        b3 = (Button)findViewById(R.id.three);
        b4 = (Button)findViewById(R.id.four);
        b5 = (Button)findViewById(R.id.five);
        b6 = (Button)findViewById(R.id.six);
        b7 = (Button)findViewById(R.id.seven);
        b8 = (Button)findViewById(R.id.eight);
        b9 = (Button)findViewById(R.id.nine);
    }


    public void buttonOnClick(View v){
        if((Button) v == b1){
            makeMove(b1,new int[]{0,0});
        }else if((Button) v == b2){
            makeMove(b2,new int[]{0,1});
        }else if((Button) v == b3){
            makeMove(b3,new int[]{0,2});
        }else if((Button) v == b4){
            makeMove(b4,new int[]{1,0});
        }else if((Button) v == b5){
            makeMove(b5,new int[]{1,1});
        }else if((Button) v == b6){
            makeMove(b6,new int[]{1,2});
        }else if((Button) v == b7){
            makeMove(b7,new int[]{2,0});
        }else if((Button) v == b8){
            makeMove(b8,new int[]{2,1});
        }else if((Button) v == b9){
            makeMove(b9,new int[]{2,2});
        }
        TextView moveview = (TextView)findViewById(R.id.move);
        moveview.setText(game.getCurrentPlayer().toString());
    }

    private void makeMove(Button b,int[] move){
        Icon p = game.getCurrentPlayer();
        b.setText(p.toString());
        b.setClickable(false);
        if( game.nextPlayerMove(move)){
            displayAlert("Player " + p.toString() + " has won!");
        }else{
            if(game.isFull()){
                displayAlert("Tie Game");
            }
        }

    }

    private void buttonreset(Button b){
        b.setText("");
        b.setClickable(true);
    }

    private void reset(){
        if (game.AIGame()){
            game = new Game(new Player(Icon.X), new AIPlayer(AIPlayer.difficulty.EASY));
        }else{
            game = new Game(new Player(Icon.X), new Player(Icon.O));
        }
        TextView moveview = (TextView)findViewById(R.id.move);
        moveview.setText(game.getCurrentPlayer().toString());
        buttonreset(b1);
        buttonreset(b2);
        buttonreset(b3);
        buttonreset(b4);
        buttonreset(b5);
        buttonreset(b6);
        buttonreset(b7);
        buttonreset(b8);
        buttonreset(b9);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        Intent intent = getIntent();
        game = (Game) intent.getSerializableExtra("game");

        init();
        Typeface title = Typeface.createFromAsset(getAssets(), "PWPerspective.ttf");
        Typeface buttons = Typeface.createFromAsset(getAssets(), "Cheveuxdange.ttf");
        TextView turnview = (TextView)findViewById(R.id.turn);
        TextView moveview = (TextView)findViewById(R.id.move);
        TextView buttonview = (TextView)findViewById(R.id.one);
        TextView button2view = (TextView)findViewById(R.id.two);
        TextView button3view = (TextView)findViewById(R.id.three);
        TextView button4view = (TextView)findViewById(R.id.four);
        TextView button5view = (TextView)findViewById(R.id.five);
        TextView button6view = (TextView)findViewById(R.id.six);
        TextView button7view = (TextView)findViewById(R.id.seven);
        TextView button8view = (TextView)findViewById(R.id.eight);
        TextView button9view = (TextView)findViewById(R.id.nine);

        turnview.setTypeface(title);
        moveview.setTypeface(title);

        buttonview.setTypeface(buttons);
        button2view.setTypeface(buttons);
        button3view.setTypeface(buttons);
        button4view.setTypeface(buttons);
        button5view.setTypeface(buttons);
        button6view.setTypeface(buttons);
        button7view.setTypeface(buttons);
        button8view.setTypeface(buttons);
        button9view.setTypeface(buttons);
    }

    private void displayAlert(String text){
        AlertDialog alertDialog = new AlertDialog.Builder(board.this).create();
        alertDialog.setMessage(text);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "New Game",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        reset();
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }


}
