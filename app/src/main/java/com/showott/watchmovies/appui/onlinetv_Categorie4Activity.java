package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11675B;
import static com.showott.watchmovies.C4250a.f11676C;
import static com.showott.watchmovies.C4250a.f11677D;
import static com.showott.watchmovies.C4250a.f11678E;
import static com.showott.watchmovies.C4250a.f11679F;
import static com.showott.watchmovies.C4250a.f11680G;
import static com.showott.watchmovies.C4250a.f11681H;
import static com.showott.watchmovies.C4250a.f11682I;
import static com.showott.watchmovies.C4250a.f11683J;

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
import com.showott.watchmovies.Main_Ads.admob_ads.TemplateView;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.R;

import java.util.Objects;

public class onlinetv_Categorie4Activity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2627t = 0;

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

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$a */
    public class C0652a implements View.OnClickListener {
        public C0652a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11683J);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc9));
            intent.putExtra("img", R.drawable.onlinetv_f9);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$b */
    public class C0653b implements View.OnClickListener {
        public C0653b() {
        }

        public void onClick(View view) {
            onlinetv_Categorie4Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$c */
    public class C0654c implements View.OnClickListener {
        public C0654c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11675B);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc1));
            intent.putExtra("img", R.drawable.onlinetv_f1);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$d */
    public class C0655d implements View.OnClickListener {
        public C0655d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11676C);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc2));
            intent.putExtra("img", R.drawable.onlinetv_f2);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$e */
    public class C0656e implements View.OnClickListener {
        public C0656e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11677D);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc3));
            intent.putExtra("img", R.drawable.onlinetv_f3);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$f */
    public class C0657f implements View.OnClickListener {
        public C0657f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11678E);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc4));
            intent.putExtra("img", R.drawable.onlinetv_f4);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$g */
    public class C0658g implements View.OnClickListener {
        public C0658g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11679F);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc5));
            intent.putExtra("img", R.drawable.onlinetv_f5);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$h */
    public class C0659h implements View.OnClickListener {
        public C0659h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11680G);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc6));
            intent.putExtra("img", R.drawable.onlinetv_f6);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$i */
    public class C0660i implements View.OnClickListener {
        public C0660i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11681H);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc7));
            intent.putExtra("img", R.drawable.onlinetv_f7);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie4Activity$j */
    public class C0661j implements View.OnClickListener {
        public C0661j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie4Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11682I);
            intent.putExtra("desc", onlinetv_Categorie4Activity.this.getResources().getString(R.string.f_desc8));
            intent.putExtra("img", R.drawable.onlinetv_f8);
            onlinetv_Categorie4Activity oTTCategorie4Activity = onlinetv_Categorie4Activity.this;
            int i = onlinetv_Categorie4Activity.f2627t;
            Objects.requireNonNull(oTTCategorie4Activity);
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
        setContentView((int) R.layout.ottshow_categorie_4_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_Categorie4Activity.this;
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

        mo3857v();
    }

    public void onResume() {
        super.onResume();
        mo3857v();
    }

    /* renamed from: v */
    public final void mo3857v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0653b());
        ((RelativeLayout) findViewById(R.id.ott_1)).setOnClickListener(new C0654c());
        ((RelativeLayout) findViewById(R.id.ott_2)).setOnClickListener(new C0655d());
        ((RelativeLayout) findViewById(R.id.ott_3)).setOnClickListener(new C0656e());
        ((RelativeLayout) findViewById(R.id.ott_4)).setOnClickListener(new C0657f());
        ((RelativeLayout) findViewById(R.id.ott_5)).setOnClickListener(new C0658g());
        ((RelativeLayout) findViewById(R.id.ott_6)).setOnClickListener(new C0659h());
        ((RelativeLayout) findViewById(R.id.ott_7)).setOnClickListener(new C0660i());
        ((RelativeLayout) findViewById(R.id.ott_8)).setOnClickListener(new C0661j());
        ((RelativeLayout) findViewById(R.id.ott_9)).setOnClickListener(new C0652a());
    }
}
