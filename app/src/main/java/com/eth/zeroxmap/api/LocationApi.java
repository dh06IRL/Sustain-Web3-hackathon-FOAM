package com.eth.zeroxmap.api;

import android.location.Location;
import android.os.Build;

import com.eth.zeroxmap.utils.Constants;
import com.foursquare.api.types.geofence.GeofenceEvent;
import com.foursquare.pilgrim.Visit;
import com.mapbox.android.core.location.LocationEngineRequest;
import com.pixplicity.easyprefs.library.Prefs;

public class LocationApi {
    private static final int UPDATE_INTERVAL_IN_MILLISECONDS = 750;
    private static final int FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 350;
    //Standardize our location engine generation here for shared use across all maps
    public static LocationEngineRequest buildEngineRequest() {
        int fastest = FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS;
        int interval = UPDATE_INTERVAL_IN_MILLISECONDS;
        return new LocationEngineRequest.Builder(interval)
                .setFastestInterval(fastest)
                .setPriority(LocationEngineRequest.PRIORITY_HIGH_ACCURACY)
                .setDisplacement(0.45f)
                .build();
    }

    public static void sendPlaceEvent4sq(Visit visit, boolean isBackfill) {

    }

    public static void sendGeofenceEvent4sq(GeofenceEvent geofenceEvent) {

    }

    public static void saveLocToPrefs(Location location) {
        try {
            Prefs.putDouble(Constants.PREF_LAST_LOC_LAT, location.getLatitude());
            Prefs.putDouble(Constants.PREF_LAST_LOC_LON, location.getLongitude());
            Prefs.putDouble(Constants.PREF_LAST_LOC_ALT, location.getAltitude());
            Prefs.putFloat(Constants.PREF_LAST_LOC_ACCU, location.getAccuracy());
            Prefs.putFloat(Constants.PREF_LAST_LOC_SPEED, location.getSpeed());
            Prefs.putFloat(Constants.PREF_LAST_LOC_BEAR, location.getBearing());
            Prefs.putString(Constants.PREF_LAST_LOC_PROV, location.getProvider());
            Prefs.putLong(Constants.PREF_LAST_LOC_TIME, location.getTime());
            Prefs.putLong(Constants.PREF_LAST_LOC_ELA, location.getElapsedRealtimeNanos());
            if (Build.VERSION.SDK_INT >= 26) {
                Prefs.putFloat(Constants.PREF_LAST_LOC_BEAR_ACCU, location.getBearingAccuracyDegrees());
                Prefs.putFloat(Constants.PREF_LAST_LOC_VER_ACCU, location.getVerticalAccuracyMeters());
                Prefs.putFloat(Constants.PREF_LAST_LOC_SPEED_ACCU, location.getSpeedAccuracyMetersPerSecond());
            }
            if (Build.VERSION.SDK_INT >= 18) {
                Prefs.putBoolean(Constants.PREF_LAST_LOC_ISMOCK, location.isFromMockProvider());
            }
        } catch (Exception e) {
        }
    }

    public static Location getLastLoc() {
        Location location = new Location("prefs");
        location.setLatitude(Prefs.getDouble(Constants.PREF_LAST_LOC_LAT, 0.0));
        location.setLongitude(Prefs.getDouble(Constants.PREF_LAST_LOC_LON, 0.0));
        location.setAltitude(Prefs.getDouble(Constants.PREF_LAST_LOC_ALT, 0.0));
        location.setAccuracy(Prefs.getFloat(Constants.PREF_LAST_LOC_ACCU, 0f));
        location.setSpeed(Prefs.getFloat(Constants.PREF_LAST_LOC_SPEED, 0f));
        location.setBearing(Prefs.getFloat(Constants.PREF_LAST_LOC_BEAR, 0f));
        location.setProvider(Prefs.getString(Constants.PREF_LAST_LOC_PROV, null));
        location.setTime(Prefs.getLong(Constants.PREF_LAST_LOC_TIME, 0));
        location.setElapsedRealtimeNanos(Prefs.getLong(Constants.PREF_LAST_LOC_ELA, 0));
        if (Build.VERSION.SDK_INT >= 26) {
            location.setBearingAccuracyDegrees(Prefs.getFloat(Constants.PREF_LAST_LOC_BEAR_ACCU, 0f));
            location.setVerticalAccuracyMeters(Prefs.getFloat(Constants.PREF_LAST_LOC_VER_ACCU, 0f));
            location.setSpeedAccuracyMetersPerSecond(Prefs.getFloat(Constants.PREF_LAST_LOC_SPEED_ACCU, 0f));
        }
        return location;
    }
}
