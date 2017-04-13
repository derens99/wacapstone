package nqueue.wa.ma.edu.tictactoe;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface title = Typeface.createFromAsset(getAssets(), "PWPerspective.ttf");
        Typeface buttons = Typeface.createFromAsset(getAssets(), "Cheveuxdange.ttf");
        TextView titleview = (TextView)findViewById(R.id.textviewtitle);
        TextView buttonview = (TextView)findViewById(R.id.button);
        TextView button2view = (TextView)findViewById(R.id.button2);
        TextView button3view = (TextView)findViewById(R.id.button3);
        titleview.setTypeface(title);
        buttonview.setTypeface(buttons);
        button2view.setTypeface(buttons);
        button3view.setTypeface(buttons);
    }
}
