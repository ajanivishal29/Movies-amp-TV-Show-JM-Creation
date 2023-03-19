package com.showott.watchmovies.Main_Ads.admob_ads;

import android.content.Context;
import android.content.SharedPreferences;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.google.gson.Gson;

public class ottshowtv_Utils {

    public static String PREFS_NAME = "shared_prefrence";

    public static void saveStringtoPrefrence(Context context, String key, String value) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getStringtoPrefrence(Context context, String key) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedpreferences.getString(key, "");
    }

    public static void savebooleanoPrefrence(Context context, String key, boolean value) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public static boolean getbooleanoPrefrence(Context context, String key) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return sharedpreferences.getBoolean(key, false);
    }


    public static ottshowtv_DataItem getResponse(Context context) {
        SharedPreferences sharedpreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String s = sharedpreferences.getString(Constant.AdResponse, "");
        ottshowtv_DataItem dataItem = new Gson().fromJson(s, ottshowtv_DataItem.class);
        return dataItem;
    }

}
