package com.example.stephen.traveland.Models;

import java.util.HashMap;
import java.util.Map;

public class DatePublished  {
    private Integer timestamp;
    private String date;
    private String asp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     * The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return
     * The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The asp
     */
    public String getAsp() {
        return asp;
    }

    /**
     *
     * @param asp
     * The asp
     */
    public void setAsp(String asp) {
        this.asp = asp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
