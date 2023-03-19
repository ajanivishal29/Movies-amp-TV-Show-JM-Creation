package com.showott.watchmovies.splash_exit.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.showott.watchmovies.R;


/* renamed from: console.tv.watchmovies.splash_exit.Activity.ThankYouActivity */
public class ottshowtv_ThankYouActivity extends AppCompatActivity {
    ImageView yes;

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ottshow_activity_thank_you);
        ImageView imageView = (ImageView) findViewById(R.id.ok);
        this.yes = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ottshowtv_ThankYouActivity.this.finishAffinity();
                ottshowtv_ThankYouActivity.this.finish();
            }
        });
    }
}
