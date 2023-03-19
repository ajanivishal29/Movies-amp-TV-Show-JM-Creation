package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11709j;
import static com.showott.watchmovies.C4250a.f11710k;
import static com.showott.watchmovies.C4250a.f11711l;
import static com.showott.watchmovies.C4250a.f11712m;
import static com.showott.watchmovies.C4250a.f11713n;
import static com.showott.watchmovies.C4250a.f11714o;
import static com.showott.watchmovies.C4250a.f11715p;
import static com.showott.watchmovies.C4250a.f11716q;
import static com.showott.watchmovies.C4250a.f11717r;

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

public class onlinetv_Categorie5Activity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2638t = 0;

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

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$a */
    public class C0662a implements View.OnClickListener {
        public C0662a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11717r);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc9));
            intent.putExtra("img", R.drawable.onlinetv_b9);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$b */
    public class C0663b implements View.OnClickListener {
        public C0663b() {
        }

        public void onClick(View view) {
            onlinetv_Categorie5Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$c */
    public class C0664c implements View.OnClickListener {
        public C0664c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11709j);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc1));
            intent.putExtra("img", R.drawable.onlinetv_b1);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$d */
    public class C0665d implements View.OnClickListener {
        public C0665d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11710k);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc2));
            intent.putExtra("img", R.drawable.onlinetv_b2);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$e */
    public class C0666e implements View.OnClickListener {
        public C0666e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11711l);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc3));
            intent.putExtra("img", R.drawable.onlinetv_b3);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$f */
    public class C0667f implements View.OnClickListener {
        public C0667f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11712m);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc4));
            intent.putExtra("img", R.drawable.onlinetv_b4);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$g */
    public class C0668g implements View.OnClickListener {
        public C0668g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11713n);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc5));
            intent.putExtra("img", R.drawable.onlinetv_b5);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$h */
    public class C0669h implements View.OnClickListener {
        public C0669h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11714o);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc6));
            intent.putExtra("img", R.drawable.onlinetv_b6);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$i */
    public class C0670i implements View.OnClickListener {
        public C0670i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11715p);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc7));
            intent.putExtra("img", R.drawable.onlinetv_b7);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie5Activity$j */
    public class C0671j implements View.OnClickListener {
        public C0671j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie5Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11716q);
            intent.putExtra("desc", onlinetv_Categorie5Activity.this.getResources().getString(R.string.b_desc8));
            intent.putExtra("img", R.drawable.onlinetv_b8);
            onlinetv_Categorie5Activity oTTCategorie5Activity = onlinetv_Categorie5Activity.this;
            int i = onlinetv_Categorie5Activity.f2638t;
            Objects.requireNonNull(oTTCategorie5Activity);
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
        setContentView((int) R.layout.ottshow_categorie_5_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_Categorie5Activity.this;
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

        mo3868v();
    }

    public void onResume() {
        super.onResume();
        mo3868v();
    }

    /* renamed from: v */
    public final void mo3868v() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0663b());
        ((RelativeLayout) findViewById(R.id.ott_1)).setOnClickListener(new C0664c());
        ((RelativeLayout) findViewById(R.id.ott_2)).setOnClickListener(new C0665d());
        ((RelativeLayout) findViewById(R.id.ott_3)).setOnClickListener(new C0666e());
        ((RelativeLayout) findViewById(R.id.ott_4)).setOnClickListener(new C0667f());
        ((RelativeLayout) findViewById(R.id.ott_5)).setOnClickListener(new C0668g());
        ((RelativeLayout) findViewById(R.id.ott_6)).setOnClickListener(new C0669h());
        ((RelativeLayout) findViewById(R.id.ott_7)).setOnClickListener(new C0670i());
        ((RelativeLayout) findViewById(R.id.ott_8)).setOnClickListener(new C0671j());
        ((RelativeLayout) findViewById(R.id.ott_9)).setOnClickListener(new C0662a());
    }
}
