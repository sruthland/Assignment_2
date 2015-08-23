package com.example.stephen.traveland.OptionModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.parse.ParseObject;

public class Data2 {

    @SerializedName("country-iso")
    @Expose
    private String countryIso;
    @SerializedName("advisory-state")
    @Expose
    private Integer advisoryState;
    @SerializedName("has-advisory-warning")
    @Expose
    private Integer hasAdvisoryWarning;
    @SerializedName("has-regional-advisory")
    @Expose
    private Integer hasRegionalAdvisory;
    @SerializedName("has-content")
    @Expose
    private Integer hasContent;
    @SerializedName("update-metadata")
    @Expose
    private String updateMetadata;
    @Expose
    private Eng2 eng;
    @Expose
    private Fra2 fra;

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
     * @return The updateMetadata
     */
    public String getUpdateMetadata() {
        return updateMetadata;
    }

    /**
     * @param updateMetadata The update-metadata
     */
    public void setUpdateMetadata(String updateMetadata) {
        this.updateMetadata = updateMetadata;
    }

    /**
     * @return The eng
     */
    public Eng2 getEng() {
        return eng;
    }

    /**
     * @param eng The eng
     */
    public void setEng(Eng2 eng) {
        this.eng = eng;
    }

    /**
     * @return The fra
     */
    public Fra2 getFra() {
        return fra;
    }

    /**
     * @param fra The fra
     */
    public void setFra(Fra2 fra) {
        this.fra = fra;
    }
}
