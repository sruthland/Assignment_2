package com.example.stephen.traveland.Models;

import android.os.Parcel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Country {

    @SerializedName("country-id")
    @Expose
    private Integer countryId;
    @SerializedName("country-iso")
    @Expose
    private String countryIso;
    @SerializedName("country-eng")
    @Expose
    private String countryEng;
    @SerializedName("country-fra")
    @Expose
    private String countryFra;
    @SerializedName("advisory-state")
    @Expose
    private Integer advisoryState;
    @SerializedName("date-published")
    @Expose
    private DatePublished datePublished;
    @SerializedName("has-advisory-warning")
    @Expose
    private Integer hasAdvisoryWarning;
    @SerializedName("has-regional-advisory")
    @Expose
    private Integer hasRegionalAdvisory;
    @SerializedName("has-content")
    @Expose
    private Integer hasContent;
    @SerializedName("recent-updates-type")
    @Expose
    private String recentUpdatesType;
    @Expose
    private Eng eng;
    @Expose
    private Fra fra;

    /**
     * @return The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId The country-id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * @return The countryIso
     */
    public String getCountryIso() {
        return countryIso;
    }

    /**
     * @param countryIso The country-iso
     */
    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    /**
     * @return The countryEng
     */
    public String getCountryEng() {
        return countryEng;
    }

    /**
     * @param countryEng The country-eng
     */
    public void setCountryEng(String countryEng) {
        this.countryEng = countryEng;
    }

    /**
     * @return The countryFra
     */
    public String getCountryFra() {
        return countryFra;
    }

    /**
     * @param countryFra The country-fra
     */
    public void setCountryFra(String countryFra) {
        this.countryFra = countryFra;
    }

    /**
     * @return The advisoryState
     */
    public Integer getAdvisoryState() {
        return advisoryState;
    }

    /**
     * @param advisoryState The advisory-state
     */
    public void setAdvisoryState(Integer advisoryState) {
        this.advisoryState = advisoryState;
    }

    /**
     * @return The datePublished
     */
    public DatePublished getDatePublished() {
        return datePublished;
    }

    /**
     * @param datePublished The date-published
     */
    public void setDatePublished(DatePublished datePublished) {
        this.datePublished = datePublished;
    }

    /**
     * @return The hasAdvisoryWarning
     */
    public Integer getHasAdvisoryWarning() {
        return hasAdvisoryWarning;
    }

    /**
     * @param hasAdvisoryWarning The has-advisory-warning
     */
    public void setHasAdvisoryWarning(Integer hasAdvisoryWarning) {
        this.hasAdvisoryWarning = hasAdvisoryWarning;
    }

    /**
     * @return The hasRegionalAdvisory
     */
    public Integer getHasRegionalAdvisory() {
        return hasRegionalAdvisory;
    }

    /**
     * @param hasRegionalAdvisory The has-regional-advisory
     */
    public void setHasRegionalAdvisory(Integer hasRegionalAdvisory) {
        this.hasRegionalAdvisory = hasRegionalAdvisory;
    }

    /**
     * @return The hasContent
     */
    public Integer getHasContent() {
        return hasContent;
    }

    /**
     * @param hasContent The has-content
     */
    public void setHasContent(Integer hasContent) {
        this.hasContent = hasContent;
    }

    /**
     * @return The recentUpdatesType
     */
    public String getRecentUpdatesType() {
        return recentUpdatesType;
    }

    /**
     * @param recentUpdatesType The recent-updates-type
     */
    public void setRecentUpdatesType(String recentUpdatesType) {
        this.recentUpdatesType = recentUpdatesType;
    }

    /**
     * @return The eng
     */
    public Eng getEng() {
        return eng;
    }

    /**
     * @param eng The eng
     */
    public void setEng(Eng eng) {
        this.eng = eng;
    }

    /**
     * @return The fra
     */
    public Fra getFra() {
        return fra;
    }

    /**
     * @param fra The fra
     */
    public void setFra(Fra fra) {
        this.fra = fra;
    }

}
