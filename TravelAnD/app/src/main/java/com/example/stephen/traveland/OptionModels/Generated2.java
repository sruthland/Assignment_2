package com.example.stephen.traveland.OptionModels;

import com.google.gson.annotations.Expose;

/**
 * Created by Stephen on 8/16/2015.
 */
public class Generated2 {

    @Expose
    private Integer timestamp;
    @Expose
    private String date;

    /**
     * @return The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(String date) {
        this.date = date;
    }
}
