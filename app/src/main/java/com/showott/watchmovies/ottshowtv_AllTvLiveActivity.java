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

/* renamed from: console.tv.watchmovies.AllTvLiveActivity */
public class ottshowtv_AllTvLiveActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView pp_btn_1;
    ImageView pp_btn_2;
    ImageView pp_btn_3;
    ImageView pp_btn_4;
    ImageView tv_btn_1;
    ImageView tv_btn_2;
    ImageView tv_btn_3;
    ImageView tv_btn_4;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_activity_all_tv_live);
        bindview();

        context = ottshowtv_AllTvLiveActivity.this;
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
        ImageView imageView = (ImageView) findViewById(R.id.tv_btn_1);
        this.tv_btn_1 = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView2 = (ImageView) findViewById(R.id.tv_btn_2);
        this.tv_btn_2 = imageView2;
        imageView2.setOnClickListener(this);
        ImageView imageView3 = (ImageView) findViewById(R.id.tv_btn_3);
        this.tv_btn_3 = imageView3;
        imageView3.setOnClickListener(this);
        ImageView imageView4 = (ImageView) findViewById(R.id.tv_btn_4);
        this.tv_btn_4 = imageView4;
        imageView4.setOnClickListener(this);
        ImageView imageView5 = (ImageView) findViewById(R.id.pp_btn_1);
        this.pp_btn_1 = imageView5;
        imageView5.setOnClickListener(this);
        ImageView imageView6 = (ImageView) findViewById(R.id.pp_btn_2);
        this.pp_btn_2 = imageView6;
        imageView6.setOnClickListener(this);
        ImageView imageView7 = (ImageView) findViewById(R.id.pp_btn_3);
        this.pp_btn_3 = imageView7;
        imageView7.setOnClickListener(this);
        ImageView imageView8 = (ImageView) findViewById(R.id.pp_btn_4);
        this.pp_btn_4 = imageView8;
        imageView8.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, ottshowtv_TvChannelsActivity.class);
        int id = view.getId();
        switch (id) {
            case R.id.pp_btn_1 /*2131362265*/:
                callNext(9, "", intent);
                return;
            case R.id.pp_btn_2 /*2131362266*/:
                callNext(10, "", intent);
                return;
            case R.id.pp_btn_3 /*2131362267*/:
                callNext(11, "", intent);
                return;
            case R.id.pp_btn_4 /*2131362268*/:
                callNext(12, "", intent);
                return;
            default:
                switch (id) {
                    case R.id.tv_btn_1 /*2131362424*/:
                        callNext(5, "", intent);
                        return;
                    case R.id.tv_btn_2 /*2131362425*/:
                        callNext(6, "", intent);
                        return;
                    case R.id.tv_btn_3 /*2131362426*/:
                        callNext(7, "", intent);
                        return;
                    case R.id.tv_btn_4 /*2131362427*/:
                        callNext(8, "", intent);
                        return;
                    default:
                        return;
                }
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
