package nf.co.phycho.touristguidebeta;

import android.content.Intent;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {
    Thread thread;
    Runnable r;
    String logTag = "nf.co.phycho.touristguidebeta";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{newActivity();}catch (Exception e){e.printStackTrace();}

    }

    public void newActivity(){
        Log.v("at newActivity",logTag);
        android.os.Handler handler = new android.os.Handler();
        Log.v("handler created", logTag);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Log.v("at run", logTag);
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    Log.v("intent created", logTag);
                    startActivity(i);
                    Log.v("activity started", logTag);

                }
            }, 300);
    }


}

