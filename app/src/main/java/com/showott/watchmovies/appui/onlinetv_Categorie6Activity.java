package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11700a;
import static com.showott.watchmovies.C4250a.f11701b;
import static com.showott.watchmovies.C4250a.f11702c;
import static com.showott.watchmovies.C4250a.f11703d;
import static com.showott.watchmovies.C4250a.f11704e;
import static com.showott.watchmovies.C4250a.f11705f;
import static com.showott.watchmovies.C4250a.f11706g;
import static com.showott.watchmovies.C4250a.f11707h;
import static com.showott.watchmovies.C4250a.f11708i;

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

public class onlinetv_Categorie6Activity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2649t = 0;

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

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$a */
    public class C0672a implements View.OnClickListener {
        public C0672a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11708i);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc9));
            intent.putExtra("img", R.drawable.onlinetv_a9);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$b */
    public class C0673b implements View.OnClickListener {
        public C0673b() {
        }

        public void onClick(View view) {
            onlinetv_Categorie6Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$c */
    public class C0674c implements View.OnClickListener {
        public C0674c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11700a);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc1));
            intent.putExtra("img", R.drawable.onlinetv_a1);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$d */
    public class C0675d implements View.OnClickListener {
        public C0675d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11701b);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc2));
            intent.putExtra("img", R.drawable.onlinetv_a2);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$e */
    public class C0676e implements View.OnClickListener {
        public C0676e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11702c);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc3));
            intent.putExtra("img", R.drawable.onlinetv_a3);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$f */
    public class C0677f implements View.OnClickListener {
        public C0677f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11703d);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc4));
            intent.putExtra("img", R.drawable.onlinetv_a4);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$g */
    public class C0678g implements View.OnClickListener {
        public C0678g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11704e);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc5));
            intent.putExtra("img", R.drawable.onlinetv_a5);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$h */
    public class C0679h implements View.OnClickListener {
        public C0679h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11705f);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc6));
            intent.putExtra("img", R.drawable.onlinetv_a6);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$i */
    public class C0680i implements View.OnClickListener {
        public C0680i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11706g);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc7));
            intent.putExtra("img", R.drawable.onlinetv_a7);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTCategorie6Activity$j */
    public class C0681j implements View.OnClickListener {
        public C0681j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_Categorie6Activity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11707h);
            intent.putExtra("desc", onlinetv_Categorie6Activity.this.getResources().getString(R.string.a_desc8));
            intent.putExtra("img", R.drawable.onlinetv_a8);
            onlinetv_Categorie6Activity oTTCategorie6Activity = onlinetv_Categorie6Activity.this;
            int i = onlinetv_Categorie6Activity.f2649t;
            Objects.requireNonNull(oTTCategorie6Activity);
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
        setContentView((int) R.layout.ottshow_categorie_6_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_Categorie6Activity.this;
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

        mo3879v();
    }

    public void onResume() {
        super.onResume();
        mo3879v();
    }

    /* renamed from: v */
    public final void mo3879v() {

        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0673b());
        ((RelativeLayout) findViewById(R.id.ott_1)).setOnClickListener(new C0674c());
        ((RelativeLayout) findViewById(R.id.ott_2)).setOnClickListener(new C0675d());
        ((RelativeLayout) findViewById(R.id.ott_3)).setOnClickListener(new C0676e());
        ((RelativeLayout) findViewById(R.id.ott_4)).setOnClickListener(new C0677f());
        ((RelativeLayout) findViewById(R.id.ott_5)).setOnClickListener(new C0678g());
        ((RelativeLayout) findViewById(R.id.ott_6)).setOnClickListener(new C0679h());
        ((RelativeLayout) findViewById(R.id.ott_7)).setOnClickListener(new C0680i());
        ((RelativeLayout) findViewById(R.id.ott_8)).setOnClickListener(new C0681j());
        ((RelativeLayout) findViewById(R.id.ott_9)).setOnClickListener(new C0672a());
    }
}
