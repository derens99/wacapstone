package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by drewh on 4/16/2017.
 */

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

public class options extends AppCompatActivity{

    public TextView text;

    public void init(){
        text = (TextView)findViewById(R.id.one);
        text = new TextView(this);
        text.setText("Each player will take turns placing\nan X or O on the board.");
    }
}
