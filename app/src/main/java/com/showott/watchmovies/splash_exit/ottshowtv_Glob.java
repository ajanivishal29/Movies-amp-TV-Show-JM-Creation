package com.showott.watchmovies.splash_exit;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: console.tv.watchmovies.splash_exit.Glob */
public class ottshowtv_Glob {
    public static String Applink = "https://play.google.com/store/apps/details?id=console.tv.livetvguide";
    public static String Privacylink = "https://privacypolicyfordeveloper.blogspot.com";
    public static String app_name = "Live TV Guide";
    public static int checkper;

    public static Boolean CheckNet(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isConnected());
    }
}
