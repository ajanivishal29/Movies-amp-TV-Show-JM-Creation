package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11674A;
import static com.showott.watchmovies.C4250a.f11718s;
import static com.showott.watchmovies.C4250a.f11719t;
import static com.showott.watchmovies.C4250a.f11720u;
import static com.showott.watchmovies.C4250a.f11721v;
import static com.showott.watchmovies.C4250a.f11722w;
import static com.showott.watchmovies.C4250a.f11723x;
import static com.showott.watchmovies.C4250a.f11724y;
import static com.showott.watchmovies.C4250a.f11725z;

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

public class onlinetv_Categorie1Activity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2595t = 0;

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

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$a */
    public class C0623a implements View.OnClickListener {
        public C0623a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11674A);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc9));
            intent.putExtra("img", R.drawable.onlinetv_d9);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$b */
    public class C0624b implements View.OnClickListener {
        public C0624b() {
        }

        public void onClick(View view) {
            onlinetv_Categorie1Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$c */
    public class C0625c implements View.OnClickListener {
        public C0625c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11718s);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc1));
            intent.putExtra("img", R.drawable.onlinetv_d1);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$d */
    public class C0626d implements View.OnClickListener {
        public C0626d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11719t);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc2));
            intent.putExtra("img", R.drawable.onlinetv_d2);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$e */
    public class C0627e implements View.OnClickListener {
        public C0627e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11720u);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc3));
            intent.putExtra("img", R.drawable.onlinetv_d3);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$f */
    public class C0628f implements View.OnClickListener {
        public C0628f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11721v);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc4));
            intent.putExtra("img", R.drawable.onlinetv_d4);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$g */
    public class C0629g implements View.OnClickListener {
        public C0629g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11722w);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc5));
            intent.putExtra("img", R.drawable.onlinetv_d5);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$h */
    public class C0630h implements View.OnClickListener {
        public C0630h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11723x);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc6));
            intent.putExtra("img", R.drawable.onlinetv_d6);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$i */
    public class C0631i implements View.OnClickListener {
        public C0631i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11724y);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc7));
            intent.putExtra("img", R.drawable.onlinetv_d7);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie1Activity$j */
    public class C0632j implements View.OnClickListener {
        public C0632j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie1Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11725z);
            intent.putExtra("desc", onlinetv_Categorie1Activity.this.getResources().getString(R.string.d_desc8));
            intent.putExtra("img", R.drawable.onlinetv_d8);
            onlinetv_Categorie1Activity oTTCategorie1Activity = onlinetv_Categorie1Activity.this;
            int i = onlinetv_Categorie1Activity.f2595t;
            Objects.requireNonNull(oTTCategorie1Activity);
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
        setContentView((int) R.layout.ottshow_categorie_1_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_Categorie1Activity.this;
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

        mo3825v();
    }

    public void onResume() {
        super.onResume();
        mo3825v();
    }

    /* renamed from: v */
    public final void mo3825v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0624b());
        ((RelativeLayout) findViewById(R.id.ott_1)).setOnClickListener(new C0625c());
        ((RelativeLayout) findViewById(R.id.ott_2)).setOnClickListener(new C0626d());
        ((RelativeLayout) findViewById(R.id.ott_3)).setOnClickListener(new C0627e());
        ((RelativeLayout) findViewById(R.id.ott_4)).setOnClickListener(new C0628f());
        ((RelativeLayout) findViewById(R.id.ott_5)).setOnClickListener(new C0629g());
        ((RelativeLayout) findViewById(R.id.ott_6)).setOnClickListener(new C0630h());
        ((RelativeLayout) findViewById(R.id.ott_7)).setOnClickListener(new C0631i());
        ((RelativeLayout) findViewById(R.id.ott_8)).setOnClickListener(new C0632j());
        ((RelativeLayout) findViewById(R.id.ott_9)).setOnClickListener(new C0623a());
    }
}
