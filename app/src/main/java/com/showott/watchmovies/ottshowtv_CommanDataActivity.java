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

/* renamed from: console.tv.watchmovies.CommanDataActivity */
public class ottshowtv_CommanDataActivity extends AppCompatActivity {
    Intent intent;
    ImageView ivback;
    int pos = 0;
    String title;
    TextView tvData;
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
        setContentView((int) R.layout.ottshow_activity_commantext);
        this.ivback = (ImageView) findViewById(R.id.ivback);
        this.tvtitle = (TextView) findViewById(R.id.tvtitle);
        this.tvData = (TextView) findViewById(R.id.tvData);

        context = ottshowtv_CommanDataActivity.this;
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
        this.pos = intent2.getIntExtra("type", 0);
        String stringExtra = this.intent.getStringExtra("title");
        this.title = stringExtra;
        this.tvtitle.setText(stringExtra);
        int i = this.pos;
        if (i == 0) {
            this.tvData.setText(getResources().getString(R.string.circled));
        } else if (i == 1) {
            this.tvData.setText(getResources().getString(R.string.tvfirmad));
        } else if (i == 2) {
            this.tvData.setText(getResources().getString(R.string.reporterd));
        } else if (i == 3) {
            this.tvData.setText(getResources().getString(R.string.escannerd));
        } else if (i == 4) {
            this.tvData.setText(getResources().getString(R.string.racerd));
        }
        this.ivback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ottshowtv_CommanDataActivity.this.onBackPressed();
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
