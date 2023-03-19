package com.showott.watchmovies.Main_Ads;

import static com.showott.watchmovies.Main_Ads.ottshowtv_App.arrAdDataStart;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;
import com.showott.watchmovies.splash_exit.Activity.ottshowtv_BackActivity;
import com.showott.watchmovies.splash_exit.Activity.ottshowtv_FirstActivity;
import com.facebook.ads.NativeAdLayout;

public class ottshowtv_SkipActivity extends AppCompatActivity {

    ImageView Skipbtn;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    RelativeLayout Liner_Localad;
    private AdViewAdapter_Start adViewAdapter;
    RecyclerView ad_recycle_view;

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ottshow_activity_skip);

        Skipbtn = findViewById(R.id.skipbtn);

        Liner_Localad = (RelativeLayout) findViewById(R.id.localad);
        Liner_Localad.setVisibility(View.GONE);

        context = ottshowtv_SkipActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        convertedObject = ottshowtv_Utils.getResponse(this);


        showStartApps();

        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
        }

        Skipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ottshowtv_SkipActivity.this, ottshowtv_FirstActivity.class));
            }
        });

    }

    private void showStartApps() {

        boolean isAdVisible = false;

        if (convertedObject.getLocaladspage().equalsIgnoreCase("on")) {
            Liner_Localad.setVisibility(View.VISIBLE);
        }

        if (arrAdDataStart != null && arrAdDataStart.size() > 0) {
            isAdVisible = true;
        } else {
            isAdVisible = false;
        }

        if (isAdVisible) {

            ad_recycle_view = (RecyclerView) findViewById(R.id.ad_recycle_view);
            ad_recycle_view.setHasFixedSize(true);
            ad_recycle_view.setLayoutFrozen(true);
            GridLayoutManager llm = new GridLayoutManager(ottshowtv_SkipActivity.this, 3);
            llm.setOrientation(GridLayoutManager.VERTICAL);
            ad_recycle_view.setLayoutManager(llm);
            adViewAdapter = new AdViewAdapter_Start(context);
            ad_recycle_view.setAdapter(adViewAdapter);

            ottshowtv_ItemClickSupport.addTo(ad_recycle_view).setOnItemClickListener(new ottshowtv_ItemClickSupport.OnItemClickListener() {
                @Override
                public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                    gotoAppStore(arrAdDataStart.get(position).getAppName(),
                            arrAdDataStart.get(position).getPackagename());
                }
            });

        }
    }

    private void gotoAppStore(final String appname, final String packagename) {
        // TODO Auto-generated method stub
        // new UpdateCounter().execute(packagename);
        try {
            context.startActivity(new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id="
                            + packagename)));
        } catch (ActivityNotFoundException anfe) {
            context.startActivity(new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id="
                            + packagename)));
        }
    }

    public class AdViewAdapter_Start extends RecyclerView.Adapter<ottshowtv_AdViewHolderView> {
        Context context;

        public AdViewAdapter_Start(Context context) {
            this.context = context;
        }

        @Override
        public ottshowtv_AdViewHolderView onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.ottshow_adview_listitem, parent, false);
            ottshowtv_AdViewHolderView viewHolder = new ottshowtv_AdViewHolderView(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(final ottshowtv_AdViewHolderView holder, int position) {
            try {
                Glide.with(context).load(arrAdDataStart.get(position).getAppIcon())
                        .into(holder.appicon);
                holder.appname.setText(arrAdDataStart.get(position).getAppName());
                holder.appname.setTextSize(11);
                holder.appname.setSelected(true);
            } catch (Exception e) {
            }
        }

        @Override
        public int getItemCount() {

            return arrAdDataStart.size();
        }
    }

    @Override
    public void onBackPressed() {
        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).ShowInterBack(this);
            startActivity(new Intent(ottshowtv_SkipActivity.this, ottshowtv_BackActivity.class));
        } else {
            startActivity(new Intent(ottshowtv_SkipActivity.this, ottshowtv_BackActivity.class));
        }
    }
}
