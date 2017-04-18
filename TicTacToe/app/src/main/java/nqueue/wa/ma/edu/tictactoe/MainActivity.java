package nqueue.wa.ma.edu.tictactoe;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity{

    public Button single, two, option, about;

    public void init(){
        single = (Button)findViewById(R.id.sing);
        two = (Button)findViewById(R.id.twoplay);
        option = (Button)findViewById(R.id.opt);
        about = (Button)findViewById(R.id.about);
    }

    public void buttonOnClick(View v){
        if((Button) v == single){
            Intent next = new Intent(MainActivity.this, board.class);
            next.putExtra("game",new Game(new Player(Icon.X), new AIPlayer(AIPlayer.difficulty.EASY)));
            startActivity(next);
        }else if((Button) v == two){
            Intent next = new Intent(MainActivity.this, board.class);
            next.putExtra("game",new Game(new Player(Icon.X),new Player(Icon.O)));
            startActivity(next);
        }else if((Button) v == option){

        }
        else if((Button) v == about){
            Intent next = new Intent(MainActivity.this,about.class);
            startActivity(next);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Typeface title = Typeface.createFromAsset(getAssets(), "PWPerspective.ttf");
        Typeface buttons = Typeface.createFromAsset(getAssets(), "Cheveuxdange.ttf");
        TextView titleview = (TextView)findViewById(R.id.textviewtitle);
        TextView buttonview = (TextView)findViewById(R.id.sing);
        TextView button2view = (TextView)findViewById(R.id.twoplay);
        TextView button3view = (TextView)findViewById(R.id.opt);
        TextView button4view = (TextView)findViewById(R.id.about);
        titleview.setTypeface(title);
        buttonview.setTypeface(buttons);
        button2view.setTypeface(buttons);
        button3view.setTypeface(buttons);
        button4view.setTypeface(buttons);
    }
}
