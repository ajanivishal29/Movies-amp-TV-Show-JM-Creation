package com.showott.watchmovies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.facebook.ads.NativeAdLayout;

/* renamed from: console.tv.watchmovies.LiveTvActivity */
public class ottshowtv_LiveTvActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView guide_btn_1;
    ImageView guide_btn_2;
    ImageView guide_btn_3;
    ImageView guide_btn_4;
    ImageView guide_btn_5;
    ImageView guide_btn_6;

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
        setContentView((int) R.layout.ottshow_activity_live_tv);
        bindview();

        context = ottshowtv_LiveTvActivity.this;
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

    }

    private void bindview() {
        ImageView imageView = (ImageView) findViewById(R.id.guide_btn_1);
        this.guide_btn_1 = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView2 = (ImageView) findViewById(R.id.guide_btn_2);
        this.guide_btn_2 = imageView2;
        imageView2.setOnClickListener(this);
        ImageView imageView3 = (ImageView) findViewById(R.id.guide_btn_3);
        this.guide_btn_3 = imageView3;
        imageView3.setOnClickListener(this);
        ImageView imageView4 = (ImageView) findViewById(R.id.guide_btn_4);
        this.guide_btn_4 = imageView4;
        imageView4.setOnClickListener(this);
        ImageView imageView5 = (ImageView) findViewById(R.id.guide_btn_5);
        this.guide_btn_5 = imageView5;
        imageView5.setOnClickListener(this);
        ImageView imageView6 = (ImageView) findViewById(R.id.guide_btn_6);
        this.guide_btn_6 = imageView6;
        imageView6.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, ottshowtv_CommanDataActivity.class);
        switch (view.getId()) {
            case R.id.guide_btn_1 /*2131362086*/:
                startActivity(new Intent(this, ottshowtv_LiveTvFreeActivity.class));
                return;
            case R.id.guide_btn_2 /*2131362087*/:
                callNext(0, "Circle", intent);
                return;
            case R.id.guide_btn_3 /*2131362088*/:
                callNext(1, "Tu Firma", intent);
                return;
            case R.id.guide_btn_4 /*2131362089*/:
                callNext(2, "Reporter", intent);
                return;
            case R.id.guide_btn_5 /*2131362090*/:
                callNext(3, "Escaner QE", intent);
                return;
            case R.id.guide_btn_6 /*2131362091*/:
                callNext(4, "Racer", intent);
                return;
            default:
                return;
        }
    }

    public void callNext(int i, String str, Intent intent) {
        intent.putExtra("type", i);
        intent.putExtra("title", str);
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
