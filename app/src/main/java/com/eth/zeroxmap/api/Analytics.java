package com.eth.zeroxmap.api;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Analytics {

    public static void sendAnalyticEvent(Context mContext, String category, String actionId, String labelId, Long time) {
        Bundle bundle = new Bundle();
        bundle.putString("category", category.replace(" ", "_"));
        bundle.putString("action", actionId.replace(" ", "_"));
        bundle.putString("label", labelId.replace(" ", "_"));
        bundle.putLong("time", time);
        FirebaseAnalytics.getInstance(mContext).logEvent(category.replace(" ", "_"), bundle);
    }

    public static void setUserProperty(Context mContext, String property, String value){
        FirebaseAnalytics.getInstance(mContext).setUserProperty(property, value);
    }
}
