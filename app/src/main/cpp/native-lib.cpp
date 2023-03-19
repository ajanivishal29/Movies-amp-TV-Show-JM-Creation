#include <jni.h>
#include <string>

extern "C" jstring
Java_com_showott_watchmovies_Main_1Ads_retrofit_APIClient_baseurl(
        JNIEnv *env, jclass clazz) {
// TODO: implement baseurl
    return env->NewStringUTF("https://mtlmedia.xyz/");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_showott_watchmovies_Main_1Ads_ottshowtv_1Splace_1Activity_fetchdatastring(
        JNIEnv *env, jclass clazz) {
    // TODO: implement fetchdatastring()
    return env->NewStringUTF("adservice/get_JMCREATION.php");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_showott_watchmovies_Main_1Ads_ottshowtv_1App_getLocalAdsData(
        JNIEnv *env, jclass clazz) {
    // TODO: implement getLocalAdsData()
    return env->NewStringUTF("localadservice/get_ShanTech_LocalAds.php");
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_showott_watchmovies_Main_1Ads_ottshowtv_1Splace_1Activity_updateAppData(
        JNIEnv *env, jclass clazz) {
    // TODO: implement updateAppData

    return env->NewStringUTF("localadservice/updatedownloadcount.php");
}