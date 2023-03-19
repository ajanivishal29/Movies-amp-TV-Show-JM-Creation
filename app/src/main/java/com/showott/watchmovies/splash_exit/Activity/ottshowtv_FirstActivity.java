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
import com.showott.watchmovies.ottshowtv_MainActivity;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;
import com.showott.watchmovies.splash_exit.ottshowtv_Glob;

/* renamed from: console.tv.watchmovies.splash_exit.Activity.FirstActivity */
public class ottshowtv_FirstActivity extends AppCompatActivity {

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
        setContentView((int) R.layout.ottshow_activity_first);

        context = ottshowtv_FirstActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        convertedObject = ottshowtv_Utils.getResponse(this);

        if (convertedObject != null) {
            if (convertedObject.getLocaladspage().equalsIgnoreCase("on")) {
                ottshowtv_Adintermethod.getInstance(this).ShowInter(this);
            }
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
        }

        ImageView imageView = (ImageView) findViewById(R.id.start1);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ottshowtv_FirstActivity.this.startActivity(new Intent(ottshowtv_FirstActivity.this, ottshowtv_MainActivity.class));
            }
        });
        findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (convertedObject != null) {
                    ottshowtv_Adintermethod.getInstance(ottshowtv_FirstActivity.this).ShowotherInter(ottshowtv_FirstActivity.this, new ottshowtv_Adintermethod.oncloseintent() {
                        @Override
                        public void onclosead() {
                            try {
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.SUBJECT", "Live TV Guide");
                                intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\n" + ottshowtv_Glob.Applink);
                                ottshowtv_FirstActivity.this.startActivity(Intent.createChooser(intent, "choose one"));
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.SUBJECT", "Live TV Guide");
                        intent.putExtra("android.intent.extra.TEXT", "\nLet me recommend you this application\n\n" + ottshowtv_Glob.Applink);
                        ottshowtv_FirstActivity.this.startActivity(Intent.createChooser(intent, "choose one"));
                    } catch (Exception unused) {
                    }
                }
            }
        });
        findViewById(R.id.rate).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (convertedObject != null) {
                    ottshowtv_Adintermethod.getInstance(ottshowtv_FirstActivity.this).ShowotherInter(ottshowtv_FirstActivity.this, new ottshowtv_Adintermethod.oncloseintent() {
                        @Override
                        public void onclosead() {
                            try {
                                ottshowtv_FirstActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + ottshowtv_FirstActivity.this.getPackageName())));
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(ottshowtv_FirstActivity.this, " unable to find market app", 1).show();
                            }
                        }
                    });
                } else {
                    try {
                        ottshowtv_FirstActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + ottshowtv_FirstActivity.this.getPackageName())));
                    } catch (ActivityNotFoundException unused) {
                        Toast.makeText(ottshowtv_FirstActivity.this, " unable to find market app", 1).show();
                    }
                }
            }
        });
        findViewById(R.id.privacy).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (convertedObject != null) {
                    ottshowtv_Adintermethod.getInstance(ottshowtv_FirstActivity.this).ShowotherInter(ottshowtv_FirstActivity.this, new ottshowtv_Adintermethod.oncloseintent() {
                        @Override
                        public void onclosead() {
                            try {
                                Intent intent1 = new Intent("android.intent.action.VIEW");
                                intent1.setData(Uri.parse(convertedObject.getPrivacyPolicy()));
                                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                getApplicationContext().startActivity(intent1);
                            } catch (Exception e) {
                                Toast.makeText(getApplicationContext(), "please connect internet connection", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                } else {
                    try {
                        Intent intent1 = new Intent("android.intent.action.VIEW");
                        intent1.setData(Uri.parse(convertedObject.getPrivacyPolicy()));
                        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        getApplicationContext().startActivity(intent1);
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "please connect internet connection", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    public void onBackPressed() {
        startActivity(new Intent(this, ottshowtv_BackActivity.class));
    }
}
