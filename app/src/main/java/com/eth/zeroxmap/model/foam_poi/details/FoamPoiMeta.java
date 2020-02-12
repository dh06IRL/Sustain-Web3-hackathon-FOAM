package com.eth.zeroxmap.model.foam_poi.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoamPoiMeta {
    @SerializedName("state")
    @Expose
    public State state;
    @SerializedName("data")
    @Expose
    public Data data;
    @SerializedName("meta")
    @Expose
    public Meta meta;
}
