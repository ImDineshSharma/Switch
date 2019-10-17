package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // variables for layout widgets
    private Button btn1;
    private TextView activity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Service kicks off here
        Intent serviceIntent = new Intent(this, DineshsIntentService.class);
        startService(serviceIntent);

        //new service kicks off here
        Intent myServiceIntent = new Intent(this, MyService.class);
        startService(myServiceIntent);

        //references
        btn1 = (Button) findViewById(R.id.btn1);
        activity1 = (TextView)findViewById(R.id.activity1);

        // implements click listener
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
    // this method gets called when the button is pressed
    public void openActivity2(){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);

    }
}
