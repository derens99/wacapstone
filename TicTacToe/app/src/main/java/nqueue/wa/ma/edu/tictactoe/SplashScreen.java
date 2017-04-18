package nqueue.wa.ma.edu.tictactoe;

/**
 * Created by benpazienza on 4/13/17.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        WebView Wv;

        Wv = (WebView) findViewById(R.id.webView1);
        Wv.loadUrl("file:///android_res/drawable/nqueue.gif");

        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(10000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
