package com.eth.zeroxmap.model.foam_poi.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("hash")
    @Expose
    public String hash;
    @SerializedName("eid")
    @Expose
    public String eid;
    @SerializedName("listingHash")
    @Expose
    public String listingHash;
    @SerializedName("transactionHash")
    @Expose
    public String transactionHash;
    @SerializedName("owner")
    @Expose
    public String owner;
    @SerializedName("type")
    @Expose
    public String type;
}
