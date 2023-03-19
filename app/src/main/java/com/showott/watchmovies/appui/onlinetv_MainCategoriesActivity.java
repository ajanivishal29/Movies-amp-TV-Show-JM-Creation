package com.showott.watchmovies.appui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.NativeAdLayout;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;

import java.util.Objects;

public class onlinetv_MainCategoriesActivity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2660t = 0;

    public ottshowtv_DataItem convertedObject;
    public Activity context;

    TemplateView admobsmallnative;
    NativeAdLayout native_banner_ad_container;
    CardView q_native_banner;

    TemplateView admobmediumnative;
    NativeAdLayout native_ad_container;
    CardView q_native;

    TemplateView admobmediumnative1;
    NativeAdLayout native_ad_container1;
    CardView q_native1;

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$a */
    public class C0682a implements View.OnClickListener {
        public C0682a() {
        }

        public void onClick(View view) {
            onlinetv_MainCategoriesActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$b */
    public class C0683b implements View.OnClickListener {
        public C0683b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainCategoriesActivity.this, onlinetv_Categorie1Activity.class);
            onlinetv_MainCategoriesActivity oTTMainCategoriesActivity = onlinetv_MainCategoriesActivity.this;
            int i = onlinetv_MainCategoriesActivity.f2660t;
            Objects.requireNonNull(oTTMainCategoriesActivity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$c */
    public class C0684c implements View.OnClickListener {
        public C0684c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainCategoriesActivity.this, onlinetv_Categorie2Activity.class);
            onlinetv_MainCategoriesActivity oTTMainCategoriesActivity = onlinetv_MainCategoriesActivity.this;
            int i = onlinetv_MainCategoriesActivity.f2660t;
            Objects.requireNonNull(oTTMainCategoriesActivity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$d */
    public class C0685d implements View.OnClickListener {
        public C0685d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainCategoriesActivity.this, onlinetv_Categorie3Activity.class);
            onlinetv_MainCategoriesActivity oTTMainCategoriesActivity = onlinetv_MainCategoriesActivity.this;
            int i = onlinetv_MainCategoriesActivity.f2660t;
            Objects.requireNonNull(oTTMainCategoriesActivity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$e */
    public class C0686e implements View.OnClickListener {
        public C0686e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainCategoriesActivity.this, onlinetv_Categorie4Activity.class);
            onlinetv_MainCategoriesActivity oTTMainCategoriesActivity = onlinetv_MainCategoriesActivity.this;
            int i = onlinetv_MainCategoriesActivity.f2660t;
            Objects.requireNonNull(oTTMainCategoriesActivity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$f */
    public class C0687f implements View.OnClickListener {
        public C0687f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainCategoriesActivity.this, onlinetv_Categorie5Activity.class);
            onlinetv_MainCategoriesActivity oTTMainCategoriesActivity = onlinetv_MainCategoriesActivity.this;
            int i = onlinetv_MainCategoriesActivity.f2660t;
            Objects.requireNonNull(oTTMainCategoriesActivity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainCategoriesActivity$g */
    public class C0688g implements View.OnClickListener {
        public C0688g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainCategoriesActivity.this, onlinetv_Categorie6Activity.class);
            onlinetv_MainCategoriesActivity oTTMainCategoriesActivity = onlinetv_MainCategoriesActivity.this;
            int i = onlinetv_MainCategoriesActivity.f2660t;
            Objects.requireNonNull(oTTMainCategoriesActivity);
            startActivity(intent);
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
        setContentView((int) R.layout.ottshow_main_categories);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_MainCategoriesActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        admobmediumnative1 = findViewById(R.id.admobmediumnative1);
        native_ad_container1 = findViewById(R.id.native_ad_container1);
        q_native1 = findViewById(R.id.q_native1);

        convertedObject = ottshowtv_Utils.getResponse(this);

        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).ShowInter(this);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative1, native_ad_container1, q_native1);
            ottshowtv_Adintermethod.getInstance(this).checkNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
        }

        mo3890v();
    }

    public void onResume() {
        super.onResume();
        mo3890v();
    }

    /* renamed from: v */
    public final void mo3890v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0682a());
        ((LinearLayout) findViewById(R.id.txtLatest)).setOnClickListener(new C0683b());
        ((LinearLayout) findViewById(R.id.txtTVshow)).setOnClickListener(new C0684c());
        ((LinearLayout) findViewById(R.id.txtPopularMovie)).setOnClickListener(new C0685d());
        ((LinearLayout) findViewById(R.id.txtAction)).setOnClickListener(new C0686e());
        ((LinearLayout) findViewById(R.id.txtKids)).setOnClickListener(new C0687f());
        ((LinearLayout) findViewById(R.id.txtFriends)).setOnClickListener(new C0688g());
    }
}
