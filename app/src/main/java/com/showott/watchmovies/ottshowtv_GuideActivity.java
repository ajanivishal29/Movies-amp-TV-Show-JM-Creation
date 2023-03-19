package com.showott.watchmovies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.facebook.ads.NativeAdLayout;

/* renamed from: console.tv.watchmovies.GuideActivity */
public class ottshowtv_GuideActivity extends AppCompatActivity {
    ImageView chooselanguage;
    public String[] data;
    Intent intent;
    ImageView ivNext;
    ImageView ivPrev;
    ImageView ivback;
    Button local_english;
    Button local_gujarati;
    Button local_hindi;
    int pos = 0;
    TextView tvData;
    TextView tvNoData;
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
        setContentView((int) R.layout.ottshow_activity_guide);
        this.ivback = (ImageView) findViewById(R.id.ivback);
        this.tvtitle = (TextView) findViewById(R.id.tvtitle);
        this.tvData = (TextView) findViewById(R.id.tvData);
        this.tvNoData = (TextView) findViewById(R.id.tvNoData);
        this.ivPrev = (ImageView) findViewById(R.id.ivPrev);
        this.ivNext = (ImageView) findViewById(R.id.ivNext);
        this.data = getResources().getStringArray(R.array.guide_array);
        this.chooselanguage = (ImageView) findViewById(R.id.chooselanguage);

        context = ottshowtv_GuideActivity.this;
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

        Intent intent2 = getIntent();
        this.intent = intent2;
        int intExtra = intent2.getIntExtra("pos", 0);
        this.pos = intExtra;
        this.tvData.setText(this.data[intExtra]);
        this.ivPrev.setVisibility(8);
        this.ivPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ottshowtv_GuideActivity.this.pos > 0) {
                    ottshowtv_GuideActivity guideActivity = ottshowtv_GuideActivity.this;
                    guideActivity.pos--;
                    ottshowtv_GuideActivity.this.tvData.setText(ottshowtv_GuideActivity.this.data[ottshowtv_GuideActivity.this.pos]);
                    if (ottshowtv_GuideActivity.this.pos == 0) {
                        ottshowtv_GuideActivity.this.ivNext.setVisibility(0);
                        ottshowtv_GuideActivity.this.ivPrev.setVisibility(4);
                        ottshowtv_GuideActivity.this.tvNoData.setVisibility(0);
                        return;
                    }
                    ottshowtv_GuideActivity.this.ivNext.setVisibility(0);
                    ottshowtv_GuideActivity.this.tvNoData.setVisibility(4);
                    return;
                }
                ottshowtv_GuideActivity.this.ivPrev.setVisibility(4);
                ottshowtv_GuideActivity.this.ivNext.setVisibility(0);
                ottshowtv_GuideActivity.this.tvNoData.setVisibility(0);
            }
        });
        this.ivNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ottshowtv_GuideActivity.this.pos < ottshowtv_GuideActivity.this.data.length - 1) {
                    ottshowtv_GuideActivity.this.pos++;
                    ottshowtv_GuideActivity.this.tvData.setText(ottshowtv_GuideActivity.this.data[ottshowtv_GuideActivity.this.pos]);
                    if (ottshowtv_GuideActivity.this.pos == ottshowtv_GuideActivity.this.data.length - 1) {
                        ottshowtv_GuideActivity.this.ivNext.setVisibility(4);
                        ottshowtv_GuideActivity.this.ivPrev.setVisibility(0);
                        ottshowtv_GuideActivity.this.tvNoData.setVisibility(0);
                        return;
                    }
                    ottshowtv_GuideActivity.this.ivPrev.setVisibility(0);
                    ottshowtv_GuideActivity.this.tvNoData.setVisibility(4);
                    return;
                }
                ottshowtv_GuideActivity.this.ivNext.setVisibility(4);
                ottshowtv_GuideActivity.this.ivPrev.setVisibility(0);
                ottshowtv_GuideActivity.this.tvNoData.setVisibility(0);
            }
        });
        this.ivback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ottshowtv_GuideActivity.this.onBackPressed();
            }
        });
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
