package com.showott.watchmovies.splash_exit.Activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.NativeAdLayout;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;

/* renamed from: console.tv.watchmovies.splash_exit.Activity.BackActivity */
public class ottshowtv_BackActivity extends AppCompatActivity {
    private ImageView btn_no;
    private ImageView exitapp;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_back_activity);
        getWindow().setFlags(1024, 1024);

        context = ottshowtv_BackActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        convertedObject = ottshowtv_Utils.getResponse(this);

        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).ShowInterBack(this);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
        }

        ImageView imageView = (ImageView) findViewById(R.id.exitapp);
        this.exitapp = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ottshowtv_BackActivity.this.startActivity(new Intent(ottshowtv_BackActivity.this, ottshowtv_ThankYouActivity.class));
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.btn_no);
        this.btn_no = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (convertedObject != null) {
                    if (convertedObject.getLocaladspage().equalsIgnoreCase("on")) {
                        ottshowtv_BackActivity.this.startActivity(new Intent(ottshowtv_BackActivity.this, ottshowtv_FirstActivity.class));
                    } else {
                        ottshowtv_Adintermethod.getInstance(ottshowtv_BackActivity.this).adintercheck(convertedObject, context, convertedObject.getFbinter2(), new ottshowtv_Adintermethod.onAdIntent() {
                            @Override
                            public void onintentscreen() {
                                ottshowtv_BackActivity.this.startActivity(new Intent(ottshowtv_BackActivity.this, ottshowtv_FirstActivity.class));
                            }
                        });
                    }
                } else {
                    ottshowtv_BackActivity.this.startActivity(new Intent(ottshowtv_BackActivity.this, ottshowtv_FirstActivity.class));
                }
            }
        });

        findViewById(R.id.rate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (convertedObject != null) {
                    ottshowtv_Adintermethod.getInstance(ottshowtv_BackActivity.this).ShowotherInter(ottshowtv_BackActivity.this, new ottshowtv_Adintermethod.oncloseintent() {
                        @Override
                        public void onclosead() {
                            try {
                                ottshowtv_BackActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + ottshowtv_BackActivity.this.getPackageName())));
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(ottshowtv_BackActivity.this, " unable to find market app", 1).show();
                            }
                        }
                    });
                } else {
                    try {
                        ottshowtv_BackActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + ottshowtv_BackActivity.this.getPackageName())));
                    } catch (ActivityNotFoundException unused) {
                        Toast.makeText(ottshowtv_BackActivity.this, " unable to find market app", 1).show();
                    }
                }
            }
        });
    }
}
