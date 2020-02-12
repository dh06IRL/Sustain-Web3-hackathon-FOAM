package com.eth.zeroxmap.utils;


public class DistanceFormatter {


    public static String distanceFormatted(float dist) {
        return "" + String.format("%.2f", (dist*0.000621371192)) + "mi  : " + String.format("%.2f", (dist/1000)) + "km";
    }
}
