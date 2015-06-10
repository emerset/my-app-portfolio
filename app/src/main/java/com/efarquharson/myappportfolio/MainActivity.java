package com.efarquharson.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        // declare toast message Strings
        String spotifyMessage = "This button will launch the Spotify Streamer App";
        String scoresMessage = "This button will launch the Scores App";
        String libraryMessage = "This button will launch the Library App";
        String buildMessage = "This button will launch the Build It Bigger App";
        String baconMessage = "This button will launch the Bacon Reader App";
        String capstoneMessage = "This button will launch the Capstone App";

        // set toast visibility time
        int duration = Toast.LENGTH_SHORT;

        // set toast objects
        final Toast spotifyToast = Toast.makeText(context, spotifyMessage, duration);
        final Toast scoresToast = Toast.makeText(context, scoresMessage, duration);
        final Toast libraryToast = Toast.makeText(context, libraryMessage, duration);
        final Toast buildToast = Toast.makeText(context, buildMessage, duration);
        final Toast baconToast = Toast.makeText(context, baconMessage, duration);
        final Toast capstoneToast = Toast.makeText(context, capstoneMessage, duration);

        // declare buttons
        final Button spotifyButton;
        final Button scoresButton;
        final Button libraryButton;
        final Button buildButton;
        final Button baconButton;
        final Button capstoneButton;

        // assign views
        spotifyButton = (Button) findViewById(R.id.spotify_button);
        scoresButton = (Button) findViewById(R.id.scores_button);
        libraryButton = (Button) findViewById(R.id.library_button);
        buildButton = (Button) findViewById(R.id.build_button);
        baconButton = (Button) findViewById(R.id.bacon_button);
        capstoneButton = (Button) findViewById(R.id.capstone_button);

        // set listeners
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                spotifyToast.show();
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                scoresToast.show();            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                libraryToast.show();            }
        });

        buildButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                buildToast.show();            }
        });

        baconButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                baconToast.show();            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                capstoneToast.show();            }
        });

        //////////////////////////////////////////


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
