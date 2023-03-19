package com.showott.watchmovies;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.facebook.ads.NativeAdLayout;

/* renamed from: console.tv.watchmovies.TvChannelsActivity */
public class ottshowtv_TvChannelsActivity extends AppCompatActivity {
    ImageView btnDownladApp;
    String downloadAppUrl;
    Intent intent1;
    ImageView ivback;
    int pos = 0;
    TextView tvData;
    TextView tvLink;
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
        setContentView((int) R.layout.ottshow_activity_tvchannels);
        this.ivback = (ImageView) findViewById(R.id.ivback);
        this.tvtitle = (TextView) findViewById(R.id.tvtitle);
        this.btnDownladApp = (ImageView) findViewById(R.id.btnDownladApp);
        this.tvData = (TextView) findViewById(R.id.tvData);
        this.tvLink = (TextView) findViewById(R.id.tvLink);

        context = ottshowtv_TvChannelsActivity.this;
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

        Intent intent = getIntent();
        this.intent1 = intent;
        int intExtra = intent.getIntExtra("type", 5);
        this.pos = intExtra;
        switch (intExtra) {
            case 5:
                this.tvtitle.setText("Hotstar");
                this.tvData.setText(getResources().getString(R.string.hotstar));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=in.startv.hotstar";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=in.startv.hotstar");
                break;
            case 6:
                this.tvtitle.setText("Sony LIV");
                this.tvData.setText(getResources().getString(R.string.sonylive));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=com.sonyliv";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=com.sonyliv");
                break;
            case 7:
                this.tvtitle.setText("Voot");
                this.tvData.setText(getResources().getString(R.string.voot));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=com.tv.v18.viola";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=com.tv.v18.viola");
                break;
            case 8:
                this.tvtitle.setText("ZEE5");
                this.tvData.setText(getResources().getString(R.string.zeetv));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=com.graymatrix.did";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=com.graymatrix.did");
                break;
            case 9:
                this.tvtitle.setText("Aaj Tak");
                this.tvData.setText(getResources().getString(R.string.aajtak));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=in.AajTak.headlines";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=in.AajTak.headlines");
                break;
            case 10:
                this.tvtitle.setText("IndiaTV");
                this.tvData.setText(getResources().getString(R.string.indiatv));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=com.indiatv.livetv";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=com.indiatv.livetv");
                break;
            case 11:
                this.tvtitle.setText("ABP Live News");
                this.tvData.setText(getResources().getString(R.string.Abpnews));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=com.winit.starnews.hin";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=com.winit.starnews.hin");
                break;
            case 12:
                this.tvtitle.setText("DD News");
                this.tvData.setText(getResources().getString(R.string.DDNews));
                this.downloadAppUrl = "https://play.google.com/store/apps/details?id=com.DDNews";
                this.tvLink.setText("https://play.google.com/store/apps/details?id=com.DDNews");
                break;
        }
        this.ivback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ottshowtv_TvChannelsActivity.this.onBackPressed();
            }
        });
        this.btnDownladApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (convertedObject != null) {
                    ottshowtv_Adintermethod.getInstance(ottshowtv_TvChannelsActivity.this).ShowotherInter(ottshowtv_TvChannelsActivity.this, new ottshowtv_Adintermethod.oncloseintent() {
                        @Override
                        public void onclosead() {
                            ottshowtv_TvChannelsActivity tvChannelsActivity = ottshowtv_TvChannelsActivity.this;
                            tvChannelsActivity.DownladApp(tvChannelsActivity.downloadAppUrl);
                        }
                    });
                } else {
                    ottshowtv_TvChannelsActivity tvChannelsActivity = ottshowtv_TvChannelsActivity.this;
                    tvChannelsActivity.DownladApp(tvChannelsActivity.downloadAppUrl);
                }
            }
        });
    }

    public void DownladApp(String str) {
        try {
            if (Build.VERSION.SDK_INT < 11) {
                ((ClipboardManager) getSystemService("clipboard")).setText("" + str);
            } else {
                ((android.content.ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Link Copy", "" + str));
            }
            Toast.makeText(this, "Copy Link Success", 0).show();
        } catch (Exception e) {
            e.printStackTrace();
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
