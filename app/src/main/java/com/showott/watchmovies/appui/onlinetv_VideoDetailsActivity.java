package com.showott.watchmovies.appui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.NativeAdLayout;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;
import com.showott.watchmovies.appui.youtube.onlinetv_YoutubePlayerActivity;

public class onlinetv_VideoDetailsActivity extends AppCompatActivity {

    /* renamed from: t */
    public String f2713t;

    /* renamed from: u */
    public String f2714u;

    /* renamed from: v */
    public TextView f2715v;

    /* renamed from: w */
    public ImageView f2716w;

    /* renamed from: x */
    public int f2717x;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    /* renamed from: com.showott.watchmovies.appui.OTTVideoDetailsActivity$a */
    public class C0733a implements View.OnClickListener {
        public C0733a() {
        }

        public void onClick(View view) {
            onlinetv_VideoDetailsActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTVideoDetailsActivity$b */
    public class C0734b implements View.OnClickListener {
        public C0734b() {
        }

        public void onClick(View view) {
            if(convertedObject != null){
                ottshowtv_Adintermethod.getInstance(onlinetv_VideoDetailsActivity.this).ShowotherInter(onlinetv_VideoDetailsActivity.this, new ottshowtv_Adintermethod.oncloseintent() {
                    @Override
                    public void onclosead() {
                        Intent intent = new Intent(onlinetv_VideoDetailsActivity.this, onlinetv_YoutubePlayerActivity.class);
                        intent.putExtra("link", onlinetv_VideoDetailsActivity.this.f2713t);
                        startActivity(intent);
                    }
                });
            } else {
                Intent intent = new Intent(onlinetv_VideoDetailsActivity.this, onlinetv_YoutubePlayerActivity.class);
                intent.putExtra("link", onlinetv_VideoDetailsActivity.this.f2713t);
                startActivity(intent);
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_video_details_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_VideoDetailsActivity.this;
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
        f2713t = getIntent().getExtras().getString("link");
        f2714u = getIntent().getExtras().getString("desc");
        f2717x = getIntent().getIntExtra("img", 0);
        ImageView imageView = (ImageView) findViewById(R.id.img);
        this.f2716w = imageView;
        imageView.setImageResource(this.f2717x);
        f2715v = (TextView) findViewById(R.id.txtdesc);
        f2715v.setText(f2714u);
        mo3949v();
    }

    public void onResume() {
        super.onResume();
        mo3949v();
    }

    /* renamed from: v */
    public final void mo3949v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0733a());
        ((RelativeLayout) findViewById(R.id.watch)).setOnClickListener(new C0734b());
    }
}
