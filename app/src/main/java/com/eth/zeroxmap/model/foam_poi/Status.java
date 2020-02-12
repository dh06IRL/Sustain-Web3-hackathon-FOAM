package com.eth.zeroxmap.model.foam_poi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {
    @SerializedName("listingSince")
    @Expose
    public String listingSince;
    @SerializedName("type")
    @Expose
    public String type;
}
