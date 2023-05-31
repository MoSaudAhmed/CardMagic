package com.mgdapps.cardmagic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_catagories, btn_music_on, btn_music_off, btn_removeadds, btn_exit;

    MediaPlayer mediaPlayer;
    Thread mediathread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        btn_music_on.setVisibility(View.INVISIBLE);

        if (CheckConnection()==true)
        {

        }
        else {
            Toast.makeText(getApplicationContext(),"No Internet Connection",Toast.LENGTH_LONG).show();

        }

        mediathread = new Thread(new Runnable() {
            @Override
            public void run() {
                mediaPlayer = mediaPlayer.create(getApplicationContext(), R.raw.chilling);
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mediaPlayer.setLooping(true);
                mediaPlayer.setVolume(1, 1);
                mediaPlayer.start();


            }
        });
        mediathread.start();

        BroadcastReceiver phonereceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String state = extras.getString(TelephonyManager.EXTRA_STATE);

                    if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                        mediaPlayer.pause();
                    }
                    if (state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                        mediaPlayer.pause();
                    }
                    if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                        mediaPlayer = mediaPlayer.create(getApplicationContext(), R.raw.chilling);
                        mediaPlayer.start();
                    }
                }
            }
        };

    }


    private boolean CheckConnection()
    {
        ConnectivityManager connectivityManager= (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);

       return connectivityManager.getActiveNetworkInfo()!=null || connectivityManager.getActiveNetworkInfo().isConnected();
    }

    public void initialize() {
        btn_catagories = (Button) findViewById(R.id.btn_catagory);
        btn_music_on = (Button) findViewById(R.id.btn_music_on);
        btn_music_off = (Button) findViewById(R.id.btn_music_off);
        btn_removeadds = (Button) findViewById(R.id.btn_remove_adds);
        btn_exit = (Button) findViewById(R.id.btn_exit);
    }

    public void exitclicked(View view) {

        mediaPlayer.stop();

        if (Build.VERSION.SDK_INT >= 21) {
            finishAndRemoveTask();
        } else {
            finish();
        }
    }

    public void removeaddclicked(View view) {


    }


    public void catagoryclicked(View view) {

        startActivity(new Intent(this, Catagories.class));
    }


    public void music() {
        mediathread.start();


    }

    public void musicONclick(View view) {
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
            btn_music_off.setVisibility(View.VISIBLE);
            btn_music_on.setVisibility(View.INVISIBLE);
        }
    }

    public void musicOFFclick(View view) {

        if (mediaPlayer.isPlaying()) {

            mediaPlayer.pause();
            btn_music_on.setVisibility(View.VISIBLE);
            btn_music_off.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mediaPlayer.start();
        btn_music_off.setVisibility(View.VISIBLE);
        btn_music_on.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();

    }

}
