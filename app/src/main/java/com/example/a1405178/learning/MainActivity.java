package com.example.a1405178.learning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView t1,t2;
    ImageButton im1;
    Button b1,b2;

    String msg = "Android:";
    /** Called when activity is first created.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"the onCreate() event.");
        t1 = (TextView)findViewById(R.id.Text1);
        t2 = (TextView)findViewById(R.id.textView2);
        im1 = (ImageButton)findViewById(R.id.imageButton);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(getBaseContext(),MyService.class));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getBaseContext(),MyService.class));
            }
        });
    }
    /*(public void startService(View view){
        startService(new Intent(getBaseContext(),MyService.class));
    }
    public void stopService(View view){
        stopService(new Intent(getBaseContext(),MyService.class));
   }
*/
}
