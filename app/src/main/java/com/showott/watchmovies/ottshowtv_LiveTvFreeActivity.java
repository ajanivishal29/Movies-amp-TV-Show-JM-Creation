package com.showott.watchmovies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.facebook.ads.NativeAdLayout;

/* renamed from: console.tv.watchmovies.LiveTvFreeActivity */
public class ottshowtv_LiveTvFreeActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView guide1;
    ImageView guide2;
    ImageView guide3;
    ImageView guide4;
    ImageView guide5;
    ImageView guide6;
    ImageView ivback;
    TextView tvtitle;

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
        setContentView((int) R.layout.ottshow_activity_livetvfree);
        this.ivback = (ImageView) findViewById(R.id.ivback);
        this.tvtitle = (TextView) findViewById(R.id.tvtitle);
        this.guide1 = (ImageView) findViewById(R.id.guide1);
        this.guide2 = (ImageView) findViewById(R.id.guide2);
        this.guide3 = (ImageView) findViewById(R.id.guide3);
        this.guide4 = (ImageView) findViewById(R.id.guide4);
        this.guide5 = (ImageView) findViewById(R.id.guide5);
        this.guide6 = (ImageView) findViewById(R.id.guide6);

        context = ottshowtv_LiveTvFreeActivity.this;
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

        this.guide1.setOnClickListener(this);
        this.guide2.setOnClickListener(this);
        this.guide3.setOnClickListener(this);
        this.guide4.setOnClickListener(this);
        this.guide5.setOnClickListener(this);
        this.guide6.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, ottshowtv_GuideActivity.class);
        switch (view.getId()) {
            case R.id.guide1 /*2131362080*/:
                intent.putExtra("pos", 0);
                break;
            case R.id.guide2 /*2131362081*/:
                intent.putExtra("pos", 1);
                break;
            case R.id.guide3 /*2131362082*/:
                intent.putExtra("pos", 2);
                break;
            case R.id.guide4 /*2131362083*/:
                intent.putExtra("pos", 3);
                break;
            case R.id.guide5 /*2131362084*/:
                intent.putExtra("pos", 4);
                break;
            case R.id.guide6 /*2131362085*/:
                intent.putExtra("pos", 5);
                break;
        }
        startActivity(intent);
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
