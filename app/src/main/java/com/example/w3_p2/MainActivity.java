package com.example.w3_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LogName", "On Create Activity Started");

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.EditText);
        textview = (TextView) findViewById(R.id.TextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("Hello");
                textview.setText("Hello");
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.i("LogName", "On Start Activity Started");
    }

    protected void onResume(){
        super.onResume();
        Log.i("LogName", "On Resume Activity Started");
    }

    protected void onPause(){
        super.onPause();
        Log.i("LogName", "On Pause Activity Started");
    }

    protected void onStop(){
        super.onStop();
        Log.i("LogName", "On Stop Activity Started");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("LogName", "On Destroy Activity Started");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i("LogName", "On Restart Activity Started");
    }
}