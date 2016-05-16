package com.example.hartley.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage1(View v) {

       Context context = getApplicationContext();
        CharSequence text = "This will display my Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage2(View v) {

        Context context = getApplicationContext();
        CharSequence text = "This will display my Stock Hawk app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage3(View v) {

        Context context = getApplicationContext();
        CharSequence text = "This will display my Build it Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage4(View v) {

        Context context = getApplicationContext();
        CharSequence text = "This will display my Make Your App Material app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage5(View v) {

        Context context = getApplicationContext();
        CharSequence text = "This will display my Go Ubiquitous app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void sendMessage6(View v) {

        Context context = getApplicationContext();
        CharSequence text = "This will display my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
