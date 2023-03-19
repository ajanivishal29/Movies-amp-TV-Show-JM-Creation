package com.showott.watchmovies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.NativeAdLayout;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.appui.onlinetv_MainHomeActivity;


/* renamed from: console.tv.watchmovies.MainActivity */
public class ottshowtv_MainActivity extends AppCompatActivity {
    ImageView iv_guide;
    ImageView iv_live;
    ImageView tv_shows;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_activity_main);
        getWindow().setStatusBarColor(getResources().getColor(R.color.main_color));

        context = ottshowtv_MainActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        convertedObject = ottshowtv_Utils.getResponse(this);

        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).ShowInter(this);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
        }

        ImageView imageView = (ImageView) findViewById(R.id.iv_live);
        this.iv_live = imageView;
        if (convertedObject != null) {
            if (convertedObject.getAlllivetv().equalsIgnoreCase("on")) {
                iv_live.setVisibility(View.VISIBLE);
                iv_live.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ottshowtv_MainActivity.this.startActivity(new Intent(ottshowtv_MainActivity.this, ottshowtv_LiveTvActivity.class));
                    }
                });
            } else {
                iv_live.setVisibility(View.GONE);
            }
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_guide);
        this.iv_guide = imageView2;
        if (convertedObject != null) {
            if (convertedObject.getFreetvguide().equalsIgnoreCase("on")) {
                iv_guide.setVisibility(View.VISIBLE);
                iv_guide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ottshowtv_MainActivity.this.startActivity(new Intent(ottshowtv_MainActivity.this, ottshowtv_AllTvLiveActivity.class));
                    }
                });
            } else {
                iv_guide.setVisibility(View.GONE);
            }
        }

        ImageView imageView3 = (ImageView) findViewById(R.id.tv_shows);
        this.tv_shows = imageView3;
        if (convertedObject != null) {
            if (convertedObject.getOttOnOff().equalsIgnoreCase("on")) {
                imageView3.setVisibility(View.VISIBLE);
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(ottshowtv_MainActivity.this, onlinetv_MainHomeActivity.class));
                    }
                });
            } else {
                imageView3.setVisibility(View.GONE);
            }
        }

    }

    public void onBackPressed() {
        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).ShowInterBack(this);
            finish();
        } else {
            finish();
        }
    }
}
