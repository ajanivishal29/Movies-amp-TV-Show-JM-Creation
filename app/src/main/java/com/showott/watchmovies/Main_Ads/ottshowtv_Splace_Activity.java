package com.showott.watchmovies.Main_Ads;

import android.Manifest;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.work.WorkRequest;

import com.anchorfree.hdr.AFHydra;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.partner.api.auth.AuthMethod;
import com.anchorfree.partner.api.response.RemainingTraffic;
import com.anchorfree.partner.api.response.User;
import com.anchorfree.reporting.TrackingConstants;
import com.anchorfree.sdk.NotificationConfig;
import com.anchorfree.sdk.SessionConfig;
import com.anchorfree.sdk.SessionInfo;
import com.anchorfree.sdk.UnifiedSDK;
import com.anchorfree.sdk.UnifiedSDKConfig;
import com.anchorfree.sdk.exceptions.PartnerApiException;
import com.anchorfree.sdk.rules.TrafficRule;
import com.anchorfree.vpnsdk.callbacks.CompletableCallback;
import com.anchorfree.vpnsdk.compat.CredentialsCompat;
import com.anchorfree.vpnsdk.exceptions.NetworkRelatedException;
import com.anchorfree.vpnsdk.exceptions.VpnException;
import com.anchorfree.vpnsdk.exceptions.VpnPermissionDeniedException;
import com.anchorfree.vpnsdk.exceptions.VpnPermissionRevokedException;
import com.anchorfree.vpnsdk.transporthydra.HydraTransport;
import com.anchorfree.vpnsdk.transporthydra.HydraVpnTransportException;
import com.anchorfree.vpnsdk.vpnservice.VPNState;
import com.facebook.FacebookSdk;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_AdListResponsenew;
import com.showott.watchmovies.Main_Ads.RetrofitResponce.ottshowtv_DataItem;
import com.showott.watchmovies.Main_Ads.admob_ads.Constant;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Adintermethod;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Privacy_PolicyActivity;
import com.showott.watchmovies.Main_Ads.admob_ads.ottshowtv_Utils;
import com.showott.watchmovies.Main_Ads.retrofit.APIClient;
import com.showott.watchmovies.Main_Ads.retrofit.RetrofitInterface;
import com.showott.watchmovies.R;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ottshowtv_Splace_Activity extends AppCompatActivity {

    private Context mContext;
    private Activity activity;
    private static final int PERMISSION_REQUEST_CODE = 1;
    private int success;
    private Timer tm;
    boolean isTimerStarted;
    public AppOpenAd appOpenAd = null;
    FullScreenContentCallback fullScreenContentCallback;
    private AppOpenAd.AppOpenAdLoadCallback loadCallback;

    public static final String ACTION_CLOSE = "ACTION_CLOSE";
    private FirstReceiver firstReceiver;

    private InterstitialAd mInterstitialAd;
    private com.facebook.ads.InterstitialAd interstitialAd;

    public static RetrofitInterface apiInterface;

    public static String TAG = "msg";
    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;

    public static ottshowtv_DataItem convertedObject;

    UnifiedSDK unifiedSDK;
    public boolean next1 = false;
    boolean connected = false;

    public String ServerIPaddress = "00.000.000.00";
    public String selectedCountry = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ottshow__activity_splash_screen);

        apiInterface = APIClient.getClient().create(RetrofitInterface.class);

        mContext = this;
        activity = this;
        isTimerStarted = false;

        sharedPreferences = activity.getSharedPreferences("MyPref", 0);
        SharedPreferences sharedPreferences2 = getSharedPreferences("memory", 0);
        sharedPreferences = sharedPreferences2;
        editor = sharedPreferences2.edit();

        ottshowtv_Adintermethod.getInstance(this).clearprefrence(this);

        if (isInternetConnection() == true) {
            try {
                if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
                    if (checkPermission()) {
                        fatchHeliNative();
                    } else {
                        requestPermission();
                    }
                }
            } catch (Exception e) {
            }
        } else {
            Toast.makeText(mContext, "Please Connect Internet", Toast.LENGTH_LONG).show();
        }

        ottshowtv_App app = (ottshowtv_App) getApplication();
        app.FatchStartApps();

        try {
            IntentFilter filter = new IntentFilter(ACTION_CLOSE);
            firstReceiver = new FirstReceiver();
            registerReceiver(firstReceiver, filter);

            String INSTALL_PREF = "install_pref_vd";
            SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
            if (!sharedPreferences.getBoolean(INSTALL_PREF, false)) {
                updatecounter();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(INSTALL_PREF, true);
                editor.apply();
            }

        } catch (Exception e) {
        }
    }

    static {
        System.loadLibrary("native-lib");
    }

    public static native String fetchdatastring();

    public static int initalize_appopenad = 0;

    private void fatchHeliNative() {
        Call<ottshowtv_AdListResponsenew> call1 = apiInterface.getadsdetail(getPackageName(), fetchdatastring());

        call1.enqueue(new Callback<ottshowtv_AdListResponsenew>() {
            @Override
            public void onResponse(Call<ottshowtv_AdListResponsenew> call, Response<ottshowtv_AdListResponsenew> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<ottshowtv_DataItem> dataItemList = new ArrayList<>();
                    if (response.body().getData() != null && !response.body().getData().isEmpty()) {

                        try {
                            String decryptedtext1 = decrypt(response.body().data);
                            Gson gson = new Gson();
                            Type type = new TypeToken<List<ottshowtv_DataItem>>() {
                            }.getType();
                            dataItemList = gson.fromJson(decryptedtext1, type);
                            System.out.println("plaintext  Data:  " + dataItemList.size());

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if (dataItemList != null && dataItemList.size() > 0) {
                            ottshowtv_DataItem item = dataItemList.get(0);
                            initHydraSdk(item.getVpn_base_url(), item.getVpn_carrier_id());

                            Gson gson = new Gson();
                            String favData = gson.toJson(item);

                            ottshowtv_Utils.saveStringtoPrefrence(ottshowtv_Splace_Activity.this, Constant.AdResponse, favData);

                            convertedObject = ottshowtv_Utils.getResponse(ottshowtv_Splace_Activity.this);

                            if (convertedObject != null) {
                                if (convertedObject.getCheckAdVpn().equalsIgnoreCase("on")) {
                                    loginToVpn();
                                } else {
                                    if (convertedObject != null) {
                                        if (convertedObject.getFacebookAppid() != null && !convertedObject.getFacebookAppid().isEmpty() &&
                                                convertedObject.getFacebookClientToken() != null && !convertedObject.getFacebookClientToken().isEmpty()) {
                                            FacebookSdk.setApplicationId(convertedObject.getFacebookAppid());
                                            FacebookSdk.setClientToken(convertedObject.getFacebookClientToken());
                                        }

                                        ottshowtv_Adintermethod.getInstance(ottshowtv_Splace_Activity.this).admob_nativebanner_load(ottshowtv_Splace_Activity.this, convertedObject.getAdmobNativeid());
                                        ottshowtv_Adintermethod.getInstance(ottshowtv_Splace_Activity.this).admob_native_load(ottshowtv_Splace_Activity.this, convertedObject.getAdmobNativeid());

                                        if (convertedObject.getCheckAdSplash().equals("admob")) {
                                            if (tm != null) {
                                                tm.cancel();
                                                tm.purge();
                                            }
                                            if (!isTimerStarted)
                                                Admob_callSplashAd();
                                        } else if (convertedObject.getCheckAdSplash().equals("fb")) {
                                            if (tm != null) {
                                                tm.cancel();
                                                tm.purge();
                                            }
                                            if (!isTimerStarted)
                                                fb_callSplashAd();
                                        } else if (convertedObject.getCheckAdSplash().equals("appopen")) {
                                            if (tm != null) {
                                                tm.cancel();
                                                tm.purge();
                                            }
                                            if (!isTimerStarted)
                                                fetchAd();
                                        } else if (convertedObject.getCheckAdSplash().equals("off")) {
                                            startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                                            finish();
                                        } else {
                                            startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                                            finish();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<ottshowtv_AdListResponsenew> call, Throwable t) {
                call.cancel();
                if (convertedObject != null) {
                    startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                    finish();
                }
            }
        });
    }

    public static String decrypt(@NotNull String input) {
        byte[] bytes = Base64.decode(input, Base64.DEFAULT);
        if (bytes.length < 17) {
            return null;
        }

        byte[] keybytes = Arrays.copyOfRange(bytes, 0, 16);
        byte[] ivBytes = Arrays.copyOfRange(bytes, 16, 32);
        byte[] contentBytes = Arrays.copyOfRange(bytes, 32, bytes.length);


        try {
            Cipher ciper = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec keySpec = new SecretKeySpec(keybytes, "AES");
            IvParameterSpec iv = new IvParameterSpec(ivBytes, 0, ciper.getBlockSize());
            ciper.init(Cipher.DECRYPT_MODE, keySpec, iv);
            return new String(ciper.doFinal(contentBytes));
        } catch (
                NoSuchAlgorithmException |
                        NoSuchPaddingException |
                        InvalidAlgorithmParameterException |
                        InvalidKeyException |
                        IllegalBlockSizeException |
                        BadPaddingException ignored
        ) {
        }

        return null;
    }

    public static native String updateAppData();

    public void updatecounter() {
        Call<Object> call1 = apiInterface.updatecounter(getPackageName(), updateAppData());

        call1.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if (response.isSuccessful() && response.body() != null) {

                    String data = new Gson().toJson(response.body());

                    try {
                        JSONObject jsonObject = new JSONObject(data);
                        success = jsonObject.getInt("success");
                        Toast.makeText(getApplicationContext(), "updatecounter = " + success, Toast.LENGTH_LONG).show();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                call.cancel();
            }
        });
    }

    class FirstReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("FirstReceiver", "FirstReceiver");
            if (intent.getAction().equals(ACTION_CLOSE)) {
                ottshowtv_Splace_Activity.this.finish();
            }
        }
    }

    private AdRequest getAdRequest() {
        return new AdRequest.Builder().build();
    }

    public boolean isAdAvailable() {
        return this.appOpenAd != null;
    }

    public void fetchAd() {
        if (!isAdAvailable()) {
            fullScreenContentCallback = new FullScreenContentCallback() {
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                }

                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Log.e("LOG_TAG", adError.getMessage());

                    startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                }

                public void onAdShowedFullScreenContent() {
                    Log.e("TAG", "onAdDismissedFullScreenContent:====> showott ");
                }
            };
            getAdsLoad();
        }
    }

    private void getAdsLoad() {
        this.loadCallback = new AppOpenAd.AppOpenAdLoadCallback() {
            public void onAdLoaded(final AppOpenAd appOpenAd) {
                super.onAdLoaded(appOpenAd);
                appOpenAd.show(ottshowtv_Splace_Activity.this);
                appOpenAd.setFullScreenContentCallback(ottshowtv_Splace_Activity.this.fullScreenContentCallback);
                AppOpenAd unused = ottshowtv_Splace_Activity.this.appOpenAd = appOpenAd;

            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
            }
        };
        AppOpenAd.load((Context) this, convertedObject.getAppopenadId(), getAdRequest(), 1, this.loadCallback);
    }


    private void Admob_callSplashAd() {
        try {

            InterstitialAd.load(this, convertedObject.getAdmobSplashInterid(), new AdRequest.Builder().build(),
                    new InterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                            mInterstitialAd = interstitialAd;

                            if (mInterstitialAd != null) {
                                mInterstitialAd.show(ottshowtv_Splace_Activity.this);
                            }

                            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                @Override
                                public void onAdDismissedFullScreenContent() {
                                    // Called when fullscreen content is dismissed.
                                    Log.d("TAG", "The ad was dismissed.");
                                    startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(AdError adError) {
                                    // Called when fullscreen content failed to showott.
                                    Log.d("TAG", "The ad failed to showott.");
                                    startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                                }

                                @Override
                                public void onAdShowedFullScreenContent() {
                                    // Called when fullscreen content is shown.
                                    // Make sure to set your reference to null so you don't
                                    // showott it a second time.
                                    mInterstitialAd = null;
                                }
                            });
                        }

                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                            mInterstitialAd = null;
                            startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                        }
                    });
        } catch (
                Exception e) {
        }

    }

    private void fb_callSplashAd() {

        interstitialAd = new com.facebook.ads.InterstitialAd(this, convertedObject.getFbinter1());
        // Set a listener to get notified on changes or when the user interact with the ad.
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                //======code here===========
                startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
            }

            @Override
            public void onError(Ad ad, com.facebook.ads.AdError adError) {

                Log.e("check5214", "Interstitial ad failed to load: " + adError.getErrorMessage());

                startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
            }

            @Override
            public void onAdLoaded(Ad ad) {
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(interstitialAdListener).build());
    }

    private boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(mContext, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int result1 = ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (result == PackageManager.PERMISSION_GRANTED || result1 == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                    if (isInternetConnection() == true) {
                        fatchHeliNative();
                    } else {
                        Toast.makeText(mContext, "Please Connect Internet", Toast.LENGTH_LONG).show();
                    }

                } else {
                    finish();
                }
                break;
        }
    }

    public boolean isInternetConnection() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            return true;
        } else
            return false;
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopUIUpdateTask();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    public void onDestroy() {
        super.onDestroy();
        if (convertedObject != null) {
            if (convertedObject.getCheckAdVpn().equalsIgnoreCase("on")) {
                disconnectFromVnp();
            }
        }
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("vpn", "Sample VPN", 3);
            notificationChannel.setDescription("VPN notification");
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    public void initHydraSdk(String vpn_base_url, String vpn_carrier_id) {
        createNotificationChannel();
        ClientInfo build = ClientInfo.newBuilder().baseUrl(vpn_base_url).carrierId(vpn_carrier_id).build();
        this.unifiedSDK = UnifiedSDK.getInstance(build, UnifiedSDKConfig.newBuilder().idfaEnabled(false).build());
        UnifiedSDK.update(NotificationConfig.newBuilder().title(getResources().getString(R.string.app_name)).channelId("vpn").build());
        UnifiedSDK.setLoggingLevel(2);
    }

    public void loginToVpn() {
        Log.e("TAG", "loginToVpn: 1111");
        //initilizeShowDialog();
        UnifiedSDK.getInstance().getBackend().login(AuthMethod.anonymous(), new com.anchorfree.vpnsdk.callbacks.Callback<User>() {
            public void success(User user) {
                Log.e("TAG", "loginToVpn: Sucess");
                next1 = true;
                isConnected(new com.anchorfree.vpnsdk.callbacks.Callback<Boolean>() {
                    public void failure(VpnException vpnException) {
                    }

                    public void success(Boolean bool) {
                        if (bool.booleanValue()) {
                            disconnectFromVnp();
                            return;
                        }
                        connectToVpn();
                    }
                });
            }

            public void failure(VpnException vpnException) {
                Log.e(TAG, "loginToVpn: 1111");
            }
        });
    }

    public void isConnected(final com.anchorfree.vpnsdk.callbacks.Callback<Boolean> callback) {
        UnifiedSDK.getVpnState(new com.anchorfree.vpnsdk.callbacks.Callback<VPNState>() {
            public void success(VPNState vPNState) {
                callback.success(Boolean.valueOf(vPNState == VPNState.CONNECTED));
            }

            public void failure(VpnException vpnException) {
                callback.success(false);
            }
        });
    }

    public void disconnectFromVnp() {
        showConnectProgress();
        UnifiedSDK.getInstance().getVPN().stop(TrackingConstants.GprReasons.M_UI, new CompletableCallback() {
            public void complete() {
                hideConnectProgress();
                stopUIUpdateTask();
            }

            public void error(VpnException vpnException) {
                hideConnectProgress();
                updateUI();
                connectToVpn();
                handleError(vpnException);
            }
        });
    }

    public void connectToVpn() {
        isLoggedIn(new com.anchorfree.vpnsdk.callbacks.Callback<Boolean>() {
            public void failure(VpnException vpnException) {
            }

            public void success(Boolean bool) {
                if (bool.booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("hydra");
                    arrayList.add(HydraTransport.TRANSPORT_ID);
                    showConnectProgress();
                    LinkedList linkedList = new LinkedList();
                    linkedList.add("*facebook.com");
                    linkedList.add("*wtfismyip.com");
                    UnifiedSDK.getInstance().getVPN().start(new SessionConfig.Builder().withReason(TrackingConstants.GprReasons.M_UI).
                            withTransportFallback(arrayList).withVirtualLocation
                                    (convertedObject.getVpn_country()).withTransport(AFHydra.LIB_HYDRA).
                            addDnsRule(TrafficRule.Builder.bypass().fromDomains(linkedList)).build(), new CompletableCallback() {
                        public void complete() {
                            hideConnectProgress();
                            startUIUpdateTask();
                        }

                        public void error(VpnException vpnException) {
                            hideConnectProgress();
                            updateUI();
                            connectToVpn();
                            handleError(vpnException);
                        }
                    });
                }
            }
        });

    }

    public void hideConnectProgress() {
    }

    public void showConnectProgress() {
    }

    public Handler mUIHandler = new Handler(Looper.getMainLooper());
    final Runnable mUIUpdateRunnable = new Runnable() {
        public void run() {
            updateUI();
            checkRemainingTraffic();
            mUIHandler.postDelayed(mUIUpdateRunnable, WorkRequest.MIN_BACKOFF_MILLIS);
        }
    };

    public void stopUIUpdateTask() {
        mUIHandler.removeCallbacks(this.mUIUpdateRunnable);
        updateUI();
    }

    public void updateUI() {
        UnifiedSDK.getVpnState(new com.anchorfree.vpnsdk.callbacks.Callback<VPNState>() {
            public void success(VPNState vPNState) {
                switch (vPNState.ordinal()) {
                    case 1:
                        if (!connected) {
                            ottshowtv_Splace_Activity uIActivity = ottshowtv_Splace_Activity.this;
                            uIActivity.connected = true;
                            ottshowtv_Splace_Activity uIActivity2 = ottshowtv_Splace_Activity.this;
                            if (uIActivity2.next1) {
                                uIActivity2.next1 = false;
//                                uIActivity2.startActivity(new Intent(realocation_Splace_Activity.this, realocation_StartApplictaion.class));
                                if (convertedObject != null) {
                                    if (convertedObject.getFacebookAppid() != null && !convertedObject.getFacebookAppid().isEmpty() &&
                                            convertedObject.getFacebookClientToken() != null && !convertedObject.getFacebookClientToken().isEmpty()) {
                                        FacebookSdk.setApplicationId(convertedObject.getFacebookAppid());
                                        FacebookSdk.setClientToken(convertedObject.getFacebookClientToken());
                                    }

                                    ottshowtv_Adintermethod.getInstance(ottshowtv_Splace_Activity.this).admob_nativebanner_load(ottshowtv_Splace_Activity.this, convertedObject.getAdmobNativeid());
                                    ottshowtv_Adintermethod.getInstance(ottshowtv_Splace_Activity.this).admob_native_load(ottshowtv_Splace_Activity.this, convertedObject.getAdmobNativeid());

                                    if (convertedObject.getCheckAdSplash().equals("admob")) {
                                        if (tm != null) {
                                            tm.cancel();
                                            tm.purge();
                                        }
                                        if (!isTimerStarted)
                                            Admob_callSplashAd();
                                    } else if (convertedObject.getCheckAdSplash().equals("fb")) {
                                        if (tm != null) {
                                            tm.cancel();
                                            tm.purge();
                                        }
                                        if (!isTimerStarted)
                                            fb_callSplashAd();
                                    } else if (convertedObject.getCheckAdSplash().equals("appopen")) {
                                        if (tm != null) {
                                            tm.cancel();
                                            tm.purge();
                                        }
                                        if (!isTimerStarted)
                                            fetchAd();
                                    } else if (convertedObject.getCheckAdSplash().equals("off")) {
                                        startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                                        finish();
                                    } else {
                                        startActivity(new Intent(ottshowtv_Splace_Activity.this, ottshowtv_Privacy_PolicyActivity.class));
                                        finish();
                                    }
                                }
                            }
                        }
                        ottshowtv_Splace_Activity.this.hideConnectProgress();
                        return;

                    case 2:
                        ottshowtv_Splace_Activity uiActivity2 = ottshowtv_Splace_Activity.this;
                        if (uiActivity2.connected) {
                            uiActivity2.connected = false;
                        }
                        ottshowtv_Splace_Activity.this.hideConnectProgress();
                        return;

                    case 3:
                    case 4:
                    case 5:
                        ottshowtv_Splace_Activity.this.showConnectProgress();
                        return;
                    case 6:
//                        Log.e(realocation_UIActivity.TAG, "success: PAUSED");
                        return;
                    default:
                        return;
                }
            }

            public void failure(VpnException vpnException) {
            }
        });
        getCurrentServer(new com.anchorfree.vpnsdk.callbacks.Callback<String>() {
            public void success(final String str) {
                ottshowtv_Splace_Activity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        if (!str.equals("")) {
                            Locale locale = new Locale("", "United States");
//                            String str = realocation_UIActivity.TAG;
                            Log.e(str, "run: " + locale.getCountry());
                            return;
                        }
                    }
                });
            }

            public void failure(VpnException vpnException) {
            }
        });
    }

    public void handleError(Throwable th) {
        if (th instanceof NetworkRelatedException) {
            showMessage("Check internet connection");
        } else if (th instanceof VpnException) {
            if (th instanceof VpnPermissionRevokedException) {
                showMessage("User revoked vpn permissions");
            } else if (th instanceof VpnPermissionDeniedException) {
                showMessage("User canceled to grant vpn permissions");
            } else if (th instanceof HydraVpnTransportException) {
                HydraVpnTransportException hydraVpnTransportException = (HydraVpnTransportException) th;
                if (hydraVpnTransportException.getCode() == 181) {
                    showMessage("Connection with vpn server was lost");
                } else if (hydraVpnTransportException.getCode() == 191) {
                    showMessage("Client traffic exceeded");
                } else {
                    showMessage("Error in VPN transport");
                }
            } else {
                Log.e(TAG, "Error in VPN Service ");
            }
        } else if (th instanceof PartnerApiException) {
            String content = ((PartnerApiException) th).getContent();
            content.hashCode();
            if (content.equals("TRAFFIC_EXCEED")) {
                showMessage("Server unavailable");
            } else if (!content.equals("NOT_AUTHORIZED")) {
                showMessage("Other error. Check PartnerApiException constants");
            } else {
                showMessage("User unauthorized");
            }
        }
    }

    public void isLoggedIn(com.anchorfree.vpnsdk.callbacks.Callback<Boolean> callback) {
        UnifiedSDK.getInstance().getBackend().isLoggedIn(callback);
    }

    public void startUIUpdateTask() {
        stopUIUpdateTask();
        this.mUIHandler.post(this.mUIUpdateRunnable);
    }

    public void checkRemainingTraffic() {
        UnifiedSDK.getInstance().getBackend().remainingTraffic(new com.anchorfree.vpnsdk.callbacks.Callback<RemainingTraffic>() {
            public void success(RemainingTraffic remainingTraffic) {
                ottshowtv_Splace_Activity.this.updateRemainingTraffic(remainingTraffic);
            }

            public void failure(VpnException vpnException) {
                ottshowtv_Splace_Activity.this.updateUI();
                ottshowtv_Splace_Activity.this.handleError(vpnException);
            }
        });
    }

    public void getCurrentServer(final com.anchorfree.vpnsdk.callbacks.Callback<String> callback) {
        UnifiedSDK.getVpnState(new com.anchorfree.vpnsdk.callbacks.Callback<VPNState>() {
            public void success(VPNState vPNState) {
                if (vPNState == VPNState.CONNECTED) {
                    UnifiedSDK.getStatus(new com.anchorfree.vpnsdk.callbacks.Callback<SessionInfo>() {
                        public void success(SessionInfo sessionInfo) {
                            String unused = ottshowtv_Splace_Activity.this.ServerIPaddress = sessionInfo.getCredentials().getServers().get(0).getAddress();
                            callback.success(CredentialsCompat.getServerCountry(sessionInfo.getCredentials()));
                        }

                        public void failure(VpnException vpnException) {
                            callback.success(ottshowtv_Splace_Activity.this.selectedCountry);
                        }
                    });
                } else {
                    callback.success(ottshowtv_Splace_Activity.this.selectedCountry);
                }
            }

            public void failure(VpnException vpnException) {
                callback.failure(vpnException);
            }
        });
    }

    public void showMessage(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void updateRemainingTraffic(RemainingTraffic remainingTraffic) {
        if (!remainingTraffic.isUnlimited()) {
            ColorCallConverter.megabyteCount(remainingTraffic.getTrafficUsed());
            ColorCallConverter.megabyteCount(remainingTraffic.getTrafficLimit());
        }
    }
}