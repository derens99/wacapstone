package nqueue.wa.ma.edu.tictactoe;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class board extends AppCompatActivity {

    public Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

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
            
        }else if((Button) v == b2){

        }else if((Button) v == b3){

        }else if((Button) v == b4){

        }else if((Button) v == b5){

        }else if((Button) v == b6){

        }else if((Button) v == b7){

        }else if((Button) v == b8){

        }else if((Button) v == b9){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);
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
}
