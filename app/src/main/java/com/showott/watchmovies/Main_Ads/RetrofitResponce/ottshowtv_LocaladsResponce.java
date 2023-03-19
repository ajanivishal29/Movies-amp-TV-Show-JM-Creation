package com.showott.watchmovies.Main_Ads.RetrofitResponce;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ottshowtv_LocaladsResponce {

	@SerializedName("data")
	private List<ottshowtv_DataItem> data;

	@SerializedName("success")
	private int success;

	public void setData(List<ottshowtv_DataItem> data){
		this.data = data;
	}

	public List<ottshowtv_DataItem> getData(){
		return data;
	}

	public void setSuccess(int success){
		this.success = success;
	}

	public int getSuccess(){
		return success;
	}
}