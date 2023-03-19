package com.showott.watchmovies.Main_Ads.retrofit;

import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_AdListResponsenew;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_LocaladsResponce;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by anupamchugh on 09/01/17.
 */

public interface RetrofitInterface {


    @POST()
    @FormUrlEncoded
    Call<ottshowtv_AdListResponsenew> getadsdetail(@Field("packagename") String packagename, @Url String url);

    @POST()
    @FormUrlEncoded
    Call<Object> updatecounter(@Field("packagename") String packagename, @Url String url);

    @POST()
    @FormUrlEncoded
    Call<ottshowtv_LocaladsResponce> localads(@Field("packagename") String packagename, @Url String url);
}
