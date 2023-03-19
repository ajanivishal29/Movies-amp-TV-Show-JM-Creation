package com.showott.watchmovies.appui;

import static com.showott.watchmovies.C4250a.f11675B;
import static com.showott.watchmovies.C4250a.f11676C;
import static com.showott.watchmovies.C4250a.f11677D;
import static com.showott.watchmovies.C4250a.f11678E;
import static com.showott.watchmovies.C4250a.f11679F;
import static com.showott.watchmovies.C4250a.f11680G;
import static com.showott.watchmovies.C4250a.f11684K;
import static com.showott.watchmovies.C4250a.f11685L;
import static com.showott.watchmovies.C4250a.f11686M;
import static com.showott.watchmovies.C4250a.f11687N;
import static com.showott.watchmovies.C4250a.f11688O;
import static com.showott.watchmovies.C4250a.f11689P;
import static com.showott.watchmovies.C4250a.f11693T;
import static com.showott.watchmovies.C4250a.f11694U;
import static com.showott.watchmovies.C4250a.f11695V;
import static com.showott.watchmovies.C4250a.f11696W;
import static com.showott.watchmovies.C4250a.f11697X;
import static com.showott.watchmovies.C4250a.f11698Y;
import static com.showott.watchmovies.C4250a.f11700a;
import static com.showott.watchmovies.C4250a.f11701b;
import static com.showott.watchmovies.C4250a.f11702c;
import static com.showott.watchmovies.C4250a.f11703d;
import static com.showott.watchmovies.C4250a.f11704e;
import static com.showott.watchmovies.C4250a.f11705f;
import static com.showott.watchmovies.C4250a.f11709j;
import static com.showott.watchmovies.C4250a.f11710k;
import static com.showott.watchmovies.C4250a.f11711l;
import static com.showott.watchmovies.C4250a.f11712m;
import static com.showott.watchmovies.C4250a.f11713n;
import static com.showott.watchmovies.C4250a.f11714o;
import static com.showott.watchmovies.C4250a.f11718s;
import static com.showott.watchmovies.C4250a.f11719t;
import static com.showott.watchmovies.C4250a.f11720u;
import static com.showott.watchmovies.C4250a.f11721v;
import static com.showott.watchmovies.C4250a.f11722w;
import static com.showott.watchmovies.C4250a.f11723x;

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

public class onlinetv_MainHomeActivity extends AppCompatActivity {

    /* renamed from: t */
    public static final /* synthetic */ int f2668t = 0;

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

    TemplateView admobmediumnative2;
    NativeAdLayout native_ad_container2;
    CardView q_native2;

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$a */
    public class C0689a implements View.OnClickListener {
        public C0689a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11719t);
            intent.putExtra("desc", getString(R.string.d_desc2));
            intent.putExtra("img", R.drawable.onlinetv_d2);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$a0 */
    public class C0690a0 implements View.OnClickListener {
        public C0690a0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11710k);
            intent.putExtra("desc", getString(R.string.b_desc2));
            intent.putExtra("img", R.drawable.onlinetv_b2);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$b */
    public class C0691b implements View.OnClickListener {
        public C0691b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11720u);
            intent.putExtra("desc", getString(R.string.d_desc3));
            intent.putExtra("img", R.drawable.onlinetv_d3);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$b0 */
    public class C0692b0 implements View.OnClickListener {
        public C0692b0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11711l);
            intent.putExtra("desc", getString(R.string.b_desc3));
            intent.putExtra("img", R.drawable.onlinetv_b3);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$c */
    public class C0693c implements View.OnClickListener {
        public C0693c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11721v);
            intent.putExtra("desc", getString(R.string.d_desc4));
            intent.putExtra("img", R.drawable.onlinetv_d4);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$c0 */
    public class C0694c0 implements View.OnClickListener {
        public C0694c0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11712m);
            intent.putExtra("desc", getString(R.string.b_desc4));
            intent.putExtra("img", R.drawable.onlinetv_b4);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$d */
    public class C0695d implements View.OnClickListener {
        public C0695d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11722w);
            intent.putExtra("desc", getString(R.string.d_desc5));
            intent.putExtra("img", R.drawable.onlinetv_d5);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$d0 */
    public class C0696d0 implements View.OnClickListener {
        public C0696d0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11713n);
            intent.putExtra("desc", getString(R.string.b_desc5));
            intent.putExtra("img", R.drawable.onlinetv_b5);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$e */
    public class C0697e implements View.OnClickListener {
        public C0697e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11723x);
            intent.putExtra("desc", getString(R.string.d_desc6));
            intent.putExtra("img", R.drawable.onlinetv_d6);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$e0 */
    public class C0698e0 implements View.OnClickListener {
        public C0698e0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11714o);
            intent.putExtra("desc", getString(R.string.b_desc6));
            intent.putExtra("img", R.drawable.onlinetv_b6);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$f */
    public class C0699f implements View.OnClickListener {
        public C0699f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11693T);
            intent.putExtra("desc", getString(R.string.h_desc1));
            intent.putExtra("img", R.drawable.onlinetv_h1);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$f0 */
    public class C0700f0 implements View.OnClickListener {
        public C0700f0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11700a);
            intent.putExtra("desc", getString(R.string.a_desc1));
            intent.putExtra("img", R.drawable.onlinetv_a1);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$g */
    public class C0701g implements View.OnClickListener {
        public C0701g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11694U);
            intent.putExtra("desc", getString(R.string.h_desc2));
            intent.putExtra("img", R.drawable.onlinetv_h2);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$g0 */
    public class C0702g0 implements View.OnClickListener {
        public C0702g0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_Categorie1Activity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$h */
    public class C0703h implements View.OnClickListener {
        public C0703h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11695V);
            intent.putExtra("desc", getString(R.string.h_desc3));
            intent.putExtra("img", R.drawable.onlinetv_h3);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$h0 */
    public class C0704h0 implements View.OnClickListener {
        public C0704h0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11701b);
            intent.putExtra("desc", getString(R.string.a_desc2));
            intent.putExtra("img", R.drawable.onlinetv_a2);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$i */
    public class C0705i implements View.OnClickListener {
        public C0705i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11696W);
            intent.putExtra("desc", getString(R.string.h_desc4));
            intent.putExtra("img", R.drawable.onlinetv_h4);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$i0 */
    public class C0706i0 implements View.OnClickListener {
        public C0706i0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11702c);
            intent.putExtra("desc", getString(R.string.a_desc3));
            intent.putExtra("img", R.drawable.onlinetv_a3);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$j */
    public class C0707j implements View.OnClickListener {
        public C0707j() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11697X);
            intent.putExtra("desc", getString(R.string.h_desc5));
            intent.putExtra("img", R.drawable.onlinetv_h5);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$j0 */
    public class C0708j0 implements View.OnClickListener {
        public C0708j0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11703d);
            intent.putExtra("desc", getString(R.string.a_desc4));
            intent.putExtra("img", R.drawable.onlinetv_a4);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$k */
    public class C0709k implements View.OnClickListener {
        public C0709k() {
        }

        public void onClick(View view) {
            onlinetv_MainHomeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$k0 */
    public class C0710k0 implements View.OnClickListener {
        public C0710k0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11704e);
            intent.putExtra("desc", getString(R.string.a_desc5));
            intent.putExtra("img", R.drawable.onlinetv_a5);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$l */
    public class C0711l implements View.OnClickListener {
        public C0711l() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11698Y);
            intent.putExtra("desc", getString(R.string.h_desc6));
            intent.putExtra("img", R.drawable.onlinetv_h6);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$l0 */
    public class C0712l0 implements View.OnClickListener {
        public C0712l0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11705f);
            intent.putExtra("desc", getString(R.string.a_desc6));
            intent.putExtra("img", R.drawable.onlinetv_a6);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$m */
    public class C0713m implements View.OnClickListener {
        public C0713m() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11684K);
            intent.putExtra("desc", getString(R.string.g_desc1));
            intent.putExtra("img", R.drawable.onlinetv_g1);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$m0 */
    public class C0714m0 implements View.OnClickListener {
        public C0714m0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_Categorie2Activity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$n */
    public class C0715n implements View.OnClickListener {
        public C0715n() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11685L);
            intent.putExtra("desc", getString(R.string.g_desc2));
            intent.putExtra("img", R.drawable.onlinetv_g2);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$n0 */
    public class C0716n0 implements View.OnClickListener {
        public C0716n0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_Categorie3Activity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$o */
    public class C0717o implements View.OnClickListener {
        public C0717o() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11686M);
            intent.putExtra("desc", getString(R.string.g_desc3));
            intent.putExtra("img", R.drawable.onlinetv_g3);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$o0 */
    public class C0718o0 implements View.OnClickListener {
        public C0718o0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_Categorie4Activity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$p */
    public class C0719p implements View.OnClickListener {
        public C0719p() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11687N);
            intent.putExtra("desc", getString(R.string.g_desc4));
            intent.putExtra("img", R.drawable.onlinetv_g4);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$p0 */
    public class C0720p0 implements View.OnClickListener {
        public C0720p0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_Categorie5Activity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$q */
    public class C0721q implements View.OnClickListener {
        public C0721q() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11688O);
            intent.putExtra("desc", getString(R.string.g_desc5));
            intent.putExtra("img", R.drawable.onlinetv_g5);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$q0 */
    public class C0722q0 implements View.OnClickListener {
        public C0722q0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_Categorie6Activity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$r */
    public class C0723r implements View.OnClickListener {
        public C0723r() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11689P);
            intent.putExtra("desc", getString(R.string.g_desc6));
            intent.putExtra("img", R.drawable.onlinetv_g6);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$r0 */
    public class C0724r0 implements View.OnClickListener {
        public C0724r0() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11718s);
            intent.putExtra("desc", getString(R.string.d_desc1));
            intent.putExtra("img", R.drawable.onlinetv_d1);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$s */
    public class C0725s implements View.OnClickListener {
        public C0725s() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11675B);
            intent.putExtra("desc", getString(R.string.f_desc1));
            intent.putExtra("img", R.drawable.onlinetv_f1);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$t */
    public class C0726t implements View.OnClickListener {
        public C0726t() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11676C);
            intent.putExtra("desc", getString(R.string.f_desc2));
            intent.putExtra("img", R.drawable.onlinetv_f2);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$u */
    public class C0727u implements View.OnClickListener {
        public C0727u() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11677D);
            intent.putExtra("desc", getString(R.string.f_desc3));
            intent.putExtra("img", R.drawable.onlinetv_f3);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$v */
    public class C0728v implements View.OnClickListener {
        public C0728v() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_MainCategoriesActivity.class);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$w */
    public class C0729w implements View.OnClickListener {
        public C0729w() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11678E);
            intent.putExtra("desc", getString(R.string.f_desc4));
            intent.putExtra("img", R.drawable.onlinetv_f4);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$x */
    public class C0730x implements View.OnClickListener {
        public C0730x() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11679F);
            intent.putExtra("desc", getString(R.string.f_desc5));
            intent.putExtra("img", R.drawable.onlinetv_f5);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$y */
    public class C0731y implements View.OnClickListener {
        public C0731y() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11680G);
            intent.putExtra("desc", getString(R.string.f_desc6));
            intent.putExtra("img", R.drawable.onlinetv_f6);
            startActivity(intent);
        }
    }

    /* renamed from: com.showott.watchmovies.appui.OTTMainHomeActivity$z */
    public class C0732z implements View.OnClickListener {
        public C0732z() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(onlinetv_MainHomeActivity.this, onlinetv_VideoDetailsActivity.class);
            intent.putExtra("link", f11709j);
            intent.putExtra("desc", getString(R.string.b_desc1));
            intent.putExtra("img", R.drawable.onlinetv_b1);
            startActivity(intent);
        }
    }

    /* renamed from: A */
    public final void mo3898A() {
        ((RelativeLayout) findViewById(R.id.ott_f_1)).setOnClickListener(new C0700f0());
        ((RelativeLayout) findViewById(R.id.ott_f_2)).setOnClickListener(new C0704h0());
        ((RelativeLayout) findViewById(R.id.ott_f_3)).setOnClickListener(new C0706i0());
        ((RelativeLayout) findViewById(R.id.ott_f_4)).setOnClickListener(new C0708j0());
        ((RelativeLayout) findViewById(R.id.ott_f_5)).setOnClickListener(new C0710k0());
        ((RelativeLayout) findViewById(R.id.ott_f_6)).setOnClickListener(new C0712l0());
    }

    /* renamed from: B */
    public final void mo3899B() {
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new C0709k());
        ((RelativeLayout) findViewById(R.id.categorie)).setOnClickListener(new C0728v());
        ((RelativeLayout) findViewById(R.id.more1)).setOnClickListener(new C0702g0());
        ((RelativeLayout) findViewById(R.id.more2)).setOnClickListener(new C0714m0());
        ((RelativeLayout) findViewById(R.id.more3)).setOnClickListener(new C0716n0());
        ((RelativeLayout) findViewById(R.id.more4)).setOnClickListener(new C0718o0());
        ((RelativeLayout) findViewById(R.id.more5)).setOnClickListener(new C0720p0());
        ((RelativeLayout) findViewById(R.id.more6)).setOnClickListener(new C0722q0());
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
        setContentView((int) R.layout.ottshow_main_home_activity);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(R.color.colorlight));
        }

        context = onlinetv_MainHomeActivity.this;
        admobsmallnative = findViewById(R.id.admobsmallnative);
        native_banner_ad_container = findViewById(R.id.native_banner_ad_container);
        q_native_banner = findViewById(R.id.q_native_banner);

        admobmediumnative = findViewById(R.id.admobmediumnative);
        native_ad_container = findViewById(R.id.native_ad_container);
        q_native = findViewById(R.id.q_native);

        admobmediumnative1 = findViewById(R.id.admobmediumnative1);
        native_ad_container1 = findViewById(R.id.native_ad_container1);
        q_native1 = findViewById(R.id.q_native1);

        admobmediumnative2 = findViewById(R.id.admobmediumnative2);
        native_ad_container2 = findViewById(R.id.native_ad_container2);
        q_native2 = findViewById(R.id.q_native2);

        convertedObject = ottshowtv_Utils.getResponse(this);

        if (convertedObject != null) {
            ottshowtv_Adintermethod.getInstance(this).ShowInter(this);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative, native_ad_container, q_native);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative1, native_ad_container1, q_native1);
            ottshowtv_Adintermethod.getInstance(this).checkNativeAdsMode(this, admobmediumnative2, native_ad_container2, q_native2);
            ottshowtv_Adintermethod.getInstance(this).checkNativeBannerAdsMode(this, admobsmallnative, native_banner_ad_container, q_native_banner);
        }

        mo3899B();
        mo3900v();
        mo3901w();
        mo3902x();
        mo3903y();
        mo3904z();
        mo3898A();
    }

    public void onResume() {
        super.onResume();
        mo3899B();
        mo3900v();
        mo3901w();
        mo3902x();
        mo3903y();
        mo3904z();
        mo3898A();
    }

    /* renamed from: v */
    public final void mo3900v() {
        ((RelativeLayout) findViewById(R.id.ott_a_1)).setOnClickListener(new C0724r0());
        ((RelativeLayout) findViewById(R.id.ott_a_2)).setOnClickListener(new C0689a());
        ((RelativeLayout) findViewById(R.id.ott_a_3)).setOnClickListener(new C0691b());
        ((RelativeLayout) findViewById(R.id.ott_a_4)).setOnClickListener(new C0693c());
        ((RelativeLayout) findViewById(R.id.ott_a_5)).setOnClickListener(new C0695d());
        ((RelativeLayout) findViewById(R.id.ott_a_6)).setOnClickListener(new C0697e());
    }

    /* renamed from: w */
    public final void mo3901w() {
        ((RelativeLayout) findViewById(R.id.ott_b_1)).setOnClickListener(new C0699f());
        ((RelativeLayout) findViewById(R.id.ott_b_2)).setOnClickListener(new C0701g());
        ((RelativeLayout) findViewById(R.id.ott_b_3)).setOnClickListener(new C0703h());
        ((RelativeLayout) findViewById(R.id.ott_b_4)).setOnClickListener(new C0705i());
        ((RelativeLayout) findViewById(R.id.ott_b_5)).setOnClickListener(new C0707j());
        ((RelativeLayout) findViewById(R.id.ott_b_6)).setOnClickListener(new C0711l());
    }

    /* renamed from: x */
    public final void mo3902x() {
        ((RelativeLayout) findViewById(R.id.ott_c_1)).setOnClickListener(new C0713m());
        ((RelativeLayout) findViewById(R.id.ott_c_2)).setOnClickListener(new C0715n());
        ((RelativeLayout) findViewById(R.id.ott_c_3)).setOnClickListener(new C0717o());
        ((RelativeLayout) findViewById(R.id.ott_c_4)).setOnClickListener(new C0719p());
        ((RelativeLayout) findViewById(R.id.ott_c_5)).setOnClickListener(new C0721q());
        ((RelativeLayout) findViewById(R.id.ott_c_6)).setOnClickListener(new C0723r());
    }

    /* renamed from: y */
    public final void mo3903y() {
        ((RelativeLayout) findViewById(R.id.ott_d_1)).setOnClickListener(new C0725s());
        ((RelativeLayout) findViewById(R.id.ott_d_2)).setOnClickListener(new C0726t());
        ((RelativeLayout) findViewById(R.id.ott_d_3)).setOnClickListener(new C0727u());
        ((RelativeLayout) findViewById(R.id.ott_d_4)).setOnClickListener(new C0729w());
        ((RelativeLayout) findViewById(R.id.ott_d_5)).setOnClickListener(new C0730x());
        ((RelativeLayout) findViewById(R.id.ott_d_6)).setOnClickListener(new C0731y());
    }

    /* renamed from: z */
    public final void mo3904z() {
        ((RelativeLayout) findViewById(R.id.ott_e_1)).setOnClickListener(new C0732z());
        ((RelativeLayout) findViewById(R.id.ott_e_2)).setOnClickListener(new C0690a0());
        ((RelativeLayout) findViewById(R.id.ott_e_3)).setOnClickListener(new C0692b0());
        ((RelativeLayout) findViewById(R.id.ott_e_4)).setOnClickListener(new C0694c0());
        ((RelativeLayout) findViewById(R.id.ott_e_5)).setOnClickListener(new C0696d0());
        ((RelativeLayout) findViewById(R.id.ott_e_6)).setOnClickListener(new C0698e0());
    }
}
