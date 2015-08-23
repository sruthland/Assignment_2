package com.example.stephen.traveland.Rest;

import com.example.stephen.traveland.OptionModels.Data2;
import com.example.stephen.traveland.OptionModels.Metadata2;
import com.example.stephen.traveland.Rest.Data;
import com.example.stephen.traveland.Rest.Metadata;
import com.google.gson.annotations.Expose;
import com.parse.ParseObject;

/**
 * Created by Stephen on 8/15/2015.
 */
public class VPModel {

    @Expose
    private Metadata2 metadata;
    @Expose
    private Data2 data;

    /**
     * @return The metadata
     */
    public Metadata2 getMetadata() {
        return metadata;
    }

    /**
     * @param metadata The metadata
     */
    public void setMetadata(Metadata2 metadata) {
        this.metadata = metadata;
    }

    /**
     * @return The data
     */
    public Data2 getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(Data2 data) {
        this.data = data;
    }
}
