package com.mgdapps.cardmagic;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Videoview extends AppCompatActivity {

    String videolinks[] = {"rtsp://r4---sn-a5mekned.googlevideo.com/Cj0LENy73wIaNAlGLb_HfWEo-BMYDSANFC2niTVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/0BF870C73628D6462F2520ED3A2074C76F730128.784BCB9B9D95AF38E49369F1458156B083A02A1A/yt6/1/video.3gp",
            "rtsp://r6---sn-a5mlrn76.googlevideo.com/Cj0LENy73wIaNAngWnDiUIBL4hMYDSANFC3yiTVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/968833B97AF74859CA9DBFE7DBD57AA6202C38C8.0A1D5CE474B1D96AFA8B3D6183EDE5DBE2A8F0D8/yt6/1/video.3gp",
            "rtsp://r6---sn-a5meknel.googlevideo.com/Cj0LENy73wIaNAnhXhohSX7HuxMYDSANFC03ijVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/919A651265582DF214328DC148F2280B93E20C1A.5A78AF19EAC73E061FCD9746738953C01073CECB/yt6/1/video.3gp",
            "rtsp://r16---sn-a5m7lnel.googlevideo.com/Cj0LENy73wIaNAkGX8ON_pcWGBMYDSANFC1vijVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/4F0FA3976C4A16BE5A50B1BF8D059321AF54FB58.CF1077AE6EB581395AEE25544D374AB5D2DB0B91/yt6/1/video.3gp",
            "rtsp://r3---sn-a5meknl7.googlevideo.com/Cj0LENy73wIaNAkjpuYM-ctS_xMYDSANFC2mijVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/A5178E238878791D974A5D3B31569B90DCC749D5.A6D3B953AF15D4F7B0B02B5D8F827809B325ED69/yt6/1/video.3gp",
            "rtsp://r12---sn-a5m7ln7r.googlevideo.com/Cj0LENy73wIaNAnlZuEIClquSxMYDSANFC3ZijVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/C79C13759D84DA7CB31E42639D48AEC17CB5297F.52B068FCA6CFFD2E2BCA093A3EEF4489B872264A/yt6/1/video.3gp",
            "rtsp://r8---sn-a5m7zne7.googlevideo.com/Cj0LENy73wIaNAnIm9picMBnlhMYDSANFC0EizVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/7464F326E6BDC2DAEAF69E47FA4A25DC9B5D442D.03D03AC6C2974103A7DB538E3803893C022F3E38/yt6/1/video.3gp",
            "rtsp://r5---sn-a5mlrn76.googlevideo.com/Cj0LENy73wIaNAnDRFxNbRfj6hMYDSANFC00izVYMOCoAUIASARgwOaM2eGYu5NYigELMEotY0JYNFZJMGMM/4EC29E7F69E7E9AC19C37E55EBA7ABB62A8FF28E.9E6291D2DD19757B777E92217ECB3362CCB53701/yt6/1/video.3gp"};


    int position;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview);

        adView = (AdView) findViewById(R.id.banner_ads);



        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        position = getIntent().getIntExtra("position", 0);

        VideoView videoview = (VideoView) findViewById(R.id.video_videoview);
        videoview.setVideoURI(Uri.parse(videolinks[position]));
        videoview.requestFocus();
        videoview.start();

        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
            }
        });

    }

    @Override
    protected void onPause() {

        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    protected void onResume() {

        if (adView != null) {
            adView.resume();
        }
        super.onResume();
    }

    @Override
    protected void onDestroy() {

        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
}
