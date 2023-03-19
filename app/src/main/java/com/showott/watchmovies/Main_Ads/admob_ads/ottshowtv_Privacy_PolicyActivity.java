package com.showott.watchmovies.Main_Ads.admob_ads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.ottshowtv_SkipActivity;
import com.showott.watchmovies.R;
import com.showott.watchmovies.splash_exit.Activity.ottshowtv_FirstActivity;
import com.facebook.ads.NativeAdLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

public class ottshowtv_Privacy_PolicyActivity extends AppCompatActivity {
    TextView Continue;
    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    private Dialog adprogress;

    public AppOpenAd appOpenAd = null;
    FullScreenContentCallback fullScreenContentCallback;
    private AppOpenAd.AppOpenAdLoadCallback loadCallback;

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;


    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    private AdRequest getAdRequest() {
        return new AdRequest.Builder().build();
    }

    public boolean isAdAvailable() {
        return this.appOpenAd != null;
    }

    public void fetchAd() {
        if (!isAdAvailable()) {
            fullScreenContentCallback = new FullScreenContentCallback() {
                public void onAdDismissedFullScreenContent() {
                    adprogress.dismiss();
                }

                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e("LOG_TAG", adError.getMessage());
                    adprogress.dismiss();

                }

                public void onAdShowedFullScreenContent() {
                    Log.e("TAG", "onAdDismissedFullScreenContent:====> showott ");
                }
            };
            getAdsLoad();
        }
    }

    private void getAdsLoad() {
        this.loadCallback = new AppOpenAd.AppOpenAdLoadCallback() {
            public void onAdLoaded(final AppOpenAd appOpenAd) {
                super.onAdLoaded(appOpenAd);
                appOpenAd.show(ottshowtv_Privacy_PolicyActivity.this);
                appOpenAd.setFullScreenContentCallback(ottshowtv_Privacy_PolicyActivity.this.fullScreenContentCallback);
                AppOpenAd unused = ottshowtv_Privacy_PolicyActivity.this.appOpenAd = appOpenAd;

            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);

                adprogress.dismiss();
                Log.e("TAG", "onAdFailedToLoad: Privacy Policy ===>" + loadAdError.getMessage());
            }
        };
        AppOpenAd.load((Context) this, convertedObject.getAppopenadId(), getAdRequest(), 1, this.loadCallback);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_activity_privacypolicy);

        Continue = findViewById(R.id.continue_btn);

        context = ottshowtv_Privacy_PolicyActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        Continue.setEnabled(false);

        convertedObject = ottshowtv_Utils.getResponse(this);

        if (convertedObject != null) {
            if (convertedObject.getAppopenInter_On_Off().equalsIgnoreCase("on")) {
                fetchAd();
            }
            ottshowtv_Adintermethod.getInstance(this).checkstaticNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkstaticNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
            ottshowtv_Adintermethod.getInstance(this).admob_nativebanner_load(this, convertedObject.getAdmobNativeid());
            ottshowtv_Adintermethod.getInstance(this).admob_native_load(this, convertedObject.getAdmobNativeid());
        }


        findViewById(R.id.privacybtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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

        findViewById(R.id.check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean chek = ((CheckBox) view).isChecked();

                if (chek) {
                    Continue.setEnabled(true);
                    Continue.setBackground(getResources().getDrawable(R.drawable.onlinetv_first_button_color1));
                    Continue.setText("Accepted");
                    Continue.setTextColor(getResources().getColor(R.color.white));
                } else {
                    Continue.setEnabled(false);
                    Continue.setBackground(getResources().getDrawable(R.drawable.onlinetv_first_button_color));
                    Continue.setText("Accepted");
                    Continue.setTextColor(getResources().getColor(R.color.dallwhite));
                }
            }
        });
        this.Continue.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (convertedObject != null) {
                    if (convertedObject.getLocaladspage().equalsIgnoreCase("on")) {
                        ottshowtv_Adintermethod.getInstance(ottshowtv_Privacy_PolicyActivity.this).adintercheck(convertedObject, context, convertedObject.getFbinter2(), new ottshowtv_Adintermethod.onAdIntent() {
                            @Override
                            public void onintentscreen() {
                                startActivity(new Intent(ottshowtv_Privacy_PolicyActivity.this, ottshowtv_SkipActivity.class));
                            }
                        });
                    } else {
                        ottshowtv_Adintermethod.getInstance(ottshowtv_Privacy_PolicyActivity.this).adintercheck(convertedObject, context, convertedObject.getFbinter2(), new ottshowtv_Adintermethod.onAdIntent() {
                            @Override
                            public void onintentscreen() {
                                startActivity(new Intent(ottshowtv_Privacy_PolicyActivity.this, ottshowtv_FirstActivity.class));
                            }
                        });
                    }

                } else {
                    startActivity(new Intent(ottshowtv_Privacy_PolicyActivity.this, ottshowtv_FirstActivity.class));
                }
            }
        });

    }

    public void onBackPressed() {
        finishAffinity();
    }
}
