package com.showott.watchmovies.Main_Ads;

import static com.showott.watchmovies.Main_Ads.ottshowtv_Splace_Activity.apiInterface;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.multidex.MultiDex;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_LocaladsResponce;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ottshowtv_App extends Application {
    private int success;
    public static ottshowtv_Touch_AppOpenManager valeAppOpenManager;

    public static ArrayList<ottshowtv_DataItem> arrAdDataStart = new ArrayList<>();

    private static ottshowtv_App instance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize((Context) this, (OnInitializationCompleteListener) new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        valeAppOpenManager = new ottshowtv_Touch_AppOpenManager(this);

        if (AudienceNetworkAds.isInitialized(this)) {
            return;
        }
        AudienceNetworkAds.initialize(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    static {
        System.loadLibrary("native-lib");
    }

    public static native String getLocalAdsData();

    public void FatchStartApps() {
        arrAdDataStart.clear();
        Call<ottshowtv_LocaladsResponce> call1 = apiInterface.localads(getPackageName(), getLocalAdsData());

        call1.enqueue(new Callback<ottshowtv_LocaladsResponce>() {
            @Override
            public void onResponse(Call<ottshowtv_LocaladsResponce> call, Response<ottshowtv_LocaladsResponce> response) {

                if (response.isSuccessful() && response.body() != null) {

                    if (response.body().getData() != null && response.body().getData().size() > 0) {
                        arrAdDataStart.addAll(response.body().getData());
                    }
                }

            }

            @Override
            public void onFailure(Call<ottshowtv_LocaladsResponce> call, Throwable t) {
                call.cancel();
            }
        });
    }

}
