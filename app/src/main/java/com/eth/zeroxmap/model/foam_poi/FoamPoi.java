package com.eth.zeroxmap.model.foam_poi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FoamPoi {
    @SerializedName("state")
    @Expose
    public State state;
    @SerializedName("listingHash")
    @Expose
    public String listingHash;
    @SerializedName("owner")
    @Expose
    public String owner;
    @SerializedName("geohash")
    @Expose
    public String geohash;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("tags")
    @Expose
    public List<String> tags = new ArrayList<>();
}
