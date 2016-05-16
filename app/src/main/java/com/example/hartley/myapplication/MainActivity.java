package com.example.hartley.myapplication;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * public void sendMessage1(View v) {
     * <p/>
     * Context context = getApplicationContext();
     * CharSequence text = "This will display my Popular Movies app!";
     * int duration = Toast.LENGTH_SHORT;
     * <p/>
     * Toast toast = Toast.makeText(context, text, duration);
     * toast.show();
     * }
     * public void sendMessage2(View v) {
     * <p/>
     * Context context = getApplicationContext();
     * CharSequence text = "This will display my Stock Hawk app!";
     * int duration = Toast.LENGTH_SHORT;
     * <p/>
     * Toast toast = Toast.makeText(context, text, duration);
     * toast.show();
     * }
     * public void sendMessage3(View v) {
     * <p/>
     * Context context = getApplicationContext();
     * CharSequence text = "This will display my Build it Bigger app!";
     * int duration = Toast.LENGTH_SHORT;
     * <p/>
     * Toast toast = Toast.makeText(context, text, duration);
     * toast.show();
     * }
     * public void sendMessage4(View v) {
     * <p/>
     * Context context = getApplicationContext();
     * CharSequence text = "This will display my Make Your App Material app!";
     * int duration = Toast.LENGTH_SHORT;
     * <p/>
     * Toast toast = Toast.makeText(context, text, duration);
     * toast.show();
     * }
     * public void sendMessage5(View v) {
     * <p/>
     * Context context = getApplicationContext();
     * CharSequence text = "This will display my Go Ubiquitous app!";
     * int duration = Toast.LENGTH_SHORT;
     * <p/>
     * Toast toast = Toast.makeText(context, text, duration);
     * toast.show();
     * }
     * public void sendMessage6(View v) {
     * <p/>
     * Context context = getApplicationContext();
     * CharSequence text = "This will display my Capstone app!";
     * int duration = Toast.LENGTH_SHORT;
     * <p/>
     * Toast toast = Toast.makeText(context, text, duration);
     * toast.show();
     * }
     */
    public void sendMessage(View v) {

        Button button = (Button) v;
        String buttonText = (String) button.getText();

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.open_app)
                + " "
                + buttonText
                + "!";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.hartley.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.hartley.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
