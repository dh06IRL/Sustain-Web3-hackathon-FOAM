package com.eth.zeroxmap.model.foam_poi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State {
    @SerializedName("status")
    @Expose
    public Status status;
    @SerializedName("createdAt")
    @Expose
    public String createdAt;
    @SerializedName("deposit")
    @Expose
    public String deposit;
}
