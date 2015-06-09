package com.jdasin.www.myappportfolio.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.jdasin.www.myappportfolio.app.utils.ToastMessageClickListener;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyButton =  (Button)this.findViewById(R.id.button_spotify_streamer);
        spotifyButton.setOnClickListener(new ToastMessageClickListener(R.string.spotify_streamer_toast));

        Button scoresAppButton =  (Button)this.findViewById(R.id.button_scores_app);
        scoresAppButton.setOnClickListener(new ToastMessageClickListener(R.string.scores_app_toast));

        Button libraryAppButton =  (Button)this.findViewById(R.id.button_library_app);
        libraryAppButton.setOnClickListener(new ToastMessageClickListener(R.string.library_app_toast));

        Button buildItBiggerAppButton =  (Button)this.findViewById(R.id.button_build_it_bigger);
        buildItBiggerAppButton.setOnClickListener(new ToastMessageClickListener(R.string.build_it_bigger_toast));

        Button daReaderAppButton =  (Button)this.findViewById(R.id.button_da_reader);
        daReaderAppButton.setOnClickListener(new ToastMessageClickListener(R.string.da_reader_toast));

        Button capstoneAppButton =  (Button)this.findViewById(R.id.button_capstone);
        capstoneAppButton.setOnClickListener(new ToastMessageClickListener(R.string.capstone_toast));
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
