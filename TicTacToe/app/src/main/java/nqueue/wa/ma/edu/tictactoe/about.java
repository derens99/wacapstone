package nqueue.wa.ma.edu.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by AzizTaha on 4/18/2017.
 */

public class about  extends AppCompatActivity {

    public Button back;

    public void init(){
        back = (Button)findViewById(R.id.back);
    }

    public void buttonClicked(View v){
        if((Button) v == back){
            Intent next = new Intent(about.this,MainActivity.class);
            startActivity(next);
        }
    }

}
