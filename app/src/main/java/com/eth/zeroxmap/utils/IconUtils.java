package com.eth.zeroxmap.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

import com.eth.zeroxmap.R;

public class IconUtils {

    static int bitmapDimen = 200;

    public static int getIconForType(String type){
        int icon = R.mipmap.ic_marker;
        return icon;
    }

    public static int getColorForPoiState(String status){
        int color = R.color.black_;
        if(TextUtils.equals(status, "challenged")){
            color = R.color.foam_status_challenged;
        }
        if(TextUtils.equals(status, "pending")){
            color = R.color.foam_status_pending;
        }
        if(TextUtils.equals(status, "applied")){
            color = R.color.foam_status_pending;
        }
        if(TextUtils.equals(status, "verified")){
            color = R.color.foam_status_verified;
        }
        if(TextUtils.equals(status, "listing")){
            color = R.color.foam_status_verified;
        }
        return color;
    }

    public static int getDrawableForPoiState(String status){
        int color = R.drawable.ic_launcher_foreground;
        if(TextUtils.equals(status, "challenged")){
            color = R.drawable.foam_circle_challenged;
        }
        if(TextUtils.equals(status, "pending")){
            color = R.drawable.foam_circle_pending;
        }
        if(TextUtils.equals(status, "applied")){
            color = R.drawable.foam_circle_pending;
        }
        if(TextUtils.equals(status, "verified")){
            color = R.drawable.foam_circle_verified;
        }
        if(TextUtils.equals(status, "listing")){
            color = R.drawable.foam_circle_verified;
        }
        return color;
    }

    public static Bitmap getBitmapFromDrawable(Context mContext, int drawable){
        Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(), drawable);
        Bitmap bitmapS = Bitmap.createScaledBitmap(bitmap, bitmapDimen, bitmapDimen, false);
        return bitmapS;
    }

    public static Bitmap returnBitmapDrawable(Context mContext, int d){
        Drawable drawable = mContext.getResources().getDrawable(d);
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }

        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }
}
