package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11684K;
import static com.showott.watchmovies.C4250a.f11685L;
import static com.showott.watchmovies.C4250a.f11686M;
import static com.showott.watchmovies.C4250a.f11687N;
import static com.showott.watchmovies.C4250a.f11688O;
import static com.showott.watchmovies.C4250a.f11689P;
import static com.showott.watchmovies.C4250a.f11690Q;
import static com.showott.watchmovies.C4250a.f11691R;
import static com.showott.watchmovies.C4250a.f11692S;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.NativeAdLayout;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;

import java.util.Objects;

public class onlinetv_Categorie3Activity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2616t = 0;

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

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$a */
    public class C0642a implements View.OnClickListener {
        public C0642a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11692S);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc9));
            intent.putExtra("img", R.drawable.onlinetv_g9);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$b */
    public class C0643b implements View.OnClickListener {
        public C0643b() {
        }

        public void onClick(View view) {
            onlinetv_Categorie3Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$c */
    public class C0644c implements View.OnClickListener {
        public C0644c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11684K);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc1));
            intent.putExtra("img", R.drawable.onlinetv_g1);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$d */
    public class C0645d implements View.OnClickListener {
        public C0645d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11685L);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc2));
            intent.putExtra("img", R.drawable.onlinetv_g2);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$e */
    public class C0646e implements View.OnClickListener {
        public C0646e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11686M);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc3));
            intent.putExtra("img", R.drawable.onlinetv_g3);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$f */
    public class C0647f implements View.OnClickListener {
        public C0647f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11687N);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc4));
            intent.putExtra("img", R.drawable.onlinetv_g4);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$g */
    public class C0648g implements View.OnClickListener {
        public C0648g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11688O);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc5));
            intent.putExtra("img", R.drawable.onlinetv_g5);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$h */
    public class C0649h implements View.OnClickListener {
        public C0649h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11689P);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc6));
            intent.putExtra("img", R.drawable.onlinetv_g6);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$i */
    public class C0650i implements View.OnClickListener {
        public C0650i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11690Q);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc7));
            intent.putExtra("img", R.drawable.onlinetv_g7);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie3Activity$j */
    public class C0651j implements View.OnClickListener {
        public C0651j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie3Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11691R);
            intent.putExtra("desc", onlinetv_Categorie3Activity.this.getResources().getString(R.string.g_desc8));
            intent.putExtra("img", R.drawable.onlinetv_g8);
            onlinetv_Categorie3Activity oTTCategorie3Activity = onlinetv_Categorie3Activity.this;
            int i = onlinetv_Categorie3Activity.f2616t;
            Objects.requireNonNull(oTTCategorie3Activity);
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
        setContentView((int) R.layout.ottshow_categorie_3_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_Categorie3Activity.this;
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

        mo3846v();
    }

    public void onResume() {
        super.onResume();
        mo3846v();
    }

    /* renamed from: v */
    public final void mo3846v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0643b());
        ((RelativeLayout) findViewById(R.id.ott_1)).setOnClickListener(new C0644c());
        ((RelativeLayout) findViewById(R.id.ott_2)).setOnClickListener(new C0645d());
        ((RelativeLayout) findViewById(R.id.ott_3)).setOnClickListener(new C0646e());
        ((RelativeLayout) findViewById(R.id.ott_4)).setOnClickListener(new C0647f());
        ((RelativeLayout) findViewById(R.id.ott_5)).setOnClickListener(new C0648g());
        ((RelativeLayout) findViewById(R.id.ott_6)).setOnClickListener(new C0649h());
        ((RelativeLayout) findViewById(R.id.ott_7)).setOnClickListener(new C0650i());
        ((RelativeLayout) findViewById(R.id.ott_8)).setOnClickListener(new C0651j());
        ((RelativeLayout) findViewById(R.id.ott_9)).setOnClickListener(new C0642a());
    }
}
