package com.eth.zeroxmap.api;

import com.foursquare.api.types.geofence.GeofenceEvent;
import com.foursquare.pilgrim.Visit;
import com.mapbox.android.core.location.LocationEngineRequest;

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
}
