package com.showott.watchmovies.appui.youtube;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;

public class onlinetv_YoutubePlayerActivity extends AppCompatActivity {

    /* renamed from: t */
    public YouTubePlayerView f2720t;

    /* renamed from: u */
    public String f2721u;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    public void onBackPressed() {
        if (convertedObject != null) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            ottshowtv_Adintermethod.getInstance(this).ShowInterBack(this);
            finish();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_youtube_activity);

        context = onlinetv_YoutubePlayerActivity.this;
        convertedObject = ottshowtv_Utils.getResponse(this);

        getWindow().setFlags(1024, 1024);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.f2721u = getIntent().getExtras().getString("link");
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.videoPlayer);
        this.f2720t = youTubePlayerView;

        getLifecycle().addObserver(this.f2720t);

        this.f2720t.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                super.onReady(youTubePlayer);
                if (convertedObject != null) {
                    if (convertedObject.getAllVideos().equalsIgnoreCase("on")) {
                        if (f2721u != null) {
                            youTubePlayer.loadVideo(f2721u, 0);
                        }
                    }
                }
            }

            @Override
            public void onStateChange(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerState state) {
                super.onStateChange(youTubePlayer, state);
                Log.e("TAG----", state.toString());

            }

            @Override
            public void onError(@NonNull YouTubePlayer youTubePlayer, @NonNull PlayerConstants.PlayerError error) {
                super.onError(youTubePlayer, error);
                Log.e("TAG", error.toString());
            }
        });

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            this.f2720t.enterFullScreen();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            this.f2720t.exitFullScreen();
        }
    }


    public void onDestroy() {
        super.onDestroy();
        this.f2720t.release();
    }
}
