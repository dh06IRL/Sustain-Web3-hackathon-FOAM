package com.eth.zeroxmap.model.foam_poi.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("uUID")
    @Expose
    public String uUID;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("geohash")
    @Expose
    public String geohash;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("web")
    @Expose
    public String web;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("tags")
    @Expose
    public List<String> tags = new ArrayList<>();
}
