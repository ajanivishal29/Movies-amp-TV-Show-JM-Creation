package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11693T;
import static com.showott.watchmovies.C4250a.f11694U;
import static com.showott.watchmovies.C4250a.f11695V;
import static com.showott.watchmovies.C4250a.f11696W;
import static com.showott.watchmovies.C4250a.f11697X;
import static com.showott.watchmovies.C4250a.f11698Y;
import static com.showott.watchmovies.C4250a.f11699Z;

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

public class onlinetv_Categorie2Activity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2606t = 0;

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

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$a */
    public class C0633a implements View.OnClickListener {
        public C0633a() {
        }

        public void onClick(View view) {
            onlinetv_Categorie2Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$b */
    public class C0634b implements View.OnClickListener {
        public C0634b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11693T);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc1));
            intent.putExtra("img", R.drawable.onlinetv_h1);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$c */
    public class C0635c implements View.OnClickListener {
        public C0635c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11694U);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc2));
            intent.putExtra("img", R.drawable.onlinetv_h2);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$d */
    public class C0636d implements View.OnClickListener {
        public C0636d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11695V);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc3));
            intent.putExtra("img", R.drawable.onlinetv_h3);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$e */
    public class C0637e implements View.OnClickListener {
        public C0637e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11696W);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc4));
            intent.putExtra("img", R.drawable.onlinetv_h4);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$f */
    public class C0638f implements View.OnClickListener {
        public C0638f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11697X);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc5));
            intent.putExtra("img", R.drawable.onlinetv_h5);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$g */
    public class C0639g implements View.OnClickListener {
        public C0639g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11698Y);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc6));
            intent.putExtra("img", R.drawable.onlinetv_h6);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$h */
    public class C0640h implements View.OnClickListener {
        public C0640h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11699Z);
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc7));
            intent.putExtra("img", R.drawable.onlinetv_h7);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie2Activity$i */
    public class C0641i implements View.OnClickListener {
        public C0641i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie2Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", convertedObject.getPopularTvshow8());
            intent.putExtra("desc", onlinetv_Categorie2Activity.this.getResources().getString(R.string.h_desc8));
            intent.putExtra("img", R.drawable.onlinetv_h8);
            onlinetv_Categorie2Activity oTTCategorie2Activity = onlinetv_Categorie2Activity.this;
            int i = onlinetv_Categorie2Activity.f2606t;
            Objects.requireNonNull(oTTCategorie2Activity);
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
        setContentView((int) R.layout.ottshow_categorie_2_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_Categorie2Activity.this;
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

        mo3836v();
    }

    public void onResume() {
        super.onResume();
        mo3836v();
    }

    /* renamed from: v */
    public final void mo3836v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0633a());
        ((RelativeLayout) findViewById(R.id.ott_1)).setOnClickListener(new C0634b());
        ((RelativeLayout) findViewById(R.id.ott_2)).setOnClickListener(new C0635c());
        ((RelativeLayout) findViewById(R.id.ott_3)).setOnClickListener(new C0636d());
        ((RelativeLayout) findViewById(R.id.ott_4)).setOnClickListener(new C0637e());
        ((RelativeLayout) findViewById(R.id.ott_5)).setOnClickListener(new C0638f());
        ((RelativeLayout) findViewById(R.id.ott_6)).setOnClickListener(new C0639g());
        ((RelativeLayout) findViewById(R.id.ott_7)).setOnClickListener(new C0640h());
        ((RelativeLayout) findViewById(R.id.ott_8)).setOnClickListener(new C0641i());
    }
}
