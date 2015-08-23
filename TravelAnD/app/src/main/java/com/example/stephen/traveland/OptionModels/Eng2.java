package com.example.stephen.traveland.OptionModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephen on 8/15/2015.
 */
public class Eng2 {
    @Expose
    private String name;
    @SerializedName("url-slug")
    @Expose
    private String urlSlug;
    @SerializedName("friendly-date")
    @Expose
    private String friendlyDate;
    @SerializedName("advisory-text")
    @Expose
    private String advisoryText;
    @SerializedName("recent-updates")
    @Expose
    private String recentUpdates;
    @Expose
    private String advisories;
    @Expose
    private String security;
    @SerializedName("entry-exit")
    @Expose
    private String entryExit;
    @Expose
    private String health;
    @SerializedName("laws-culture")
    @Expose
    private String lawsCulture;
    @SerializedName("disasters-climate")
    @Expose
    private String disastersClimate;
    @SerializedName("offices-help-abroad")
    @Expose
    private OfficesHelpAbroad officesHelpAbroad;
    @Expose
    private List<Office> offices = new ArrayList<Office>();

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The urlSlug
     */
    public String getUrlSlug() {
        return urlSlug;
    }

    /**
     * @param urlSlug The url-slug
     */
    public void setUrlSlug(String urlSlug) {
        this.urlSlug = urlSlug;
    }

    /**
     * @return The friendlyDate
     */
    public String getFriendlyDate() {
        return friendlyDate;
    }

    /**
     * @param friendlyDate The friendly-date
     */
    public void setFriendlyDate(String friendlyDate) {
        this.friendlyDate = friendlyDate;
    }

    /**
     * @return The advisoryText
     */
    public String getAdvisoryText() {
        return advisoryText;
    }

    /**
     * @param advisoryText The advisory-text
     */
    public void setAdvisoryText(String advisoryText) {
        this.advisoryText = advisoryText;
    }

    /**
     * @return The recentUpdates
     */
    public String getRecentUpdates() {
        return recentUpdates;
    }

    /**
     * @param recentUpdates The recent-updates
     */
    public void setRecentUpdates(String recentUpdates) {
        this.recentUpdates = recentUpdates;
    }

    /**
     * @return The advisories
     */
    public String getAdvisories() {
        return advisories;
    }

    /**
     * @param advisories The advisories
     */
    public void setAdvisories(String advisories) {
        this.advisories = advisories;
    }

    /**
     * @return The security
     */
    public String getSecurity() {
        return security;
    }

    /**
     * @param security The security
     */
    public void setSecurity(String security) {
        this.security = security;
    }

    /**
     * @return The entryExit
     */
    public String getEntryExit() {
        return entryExit;
    }

    /**
     * @param entryExit The entry-exit
     */
    public void setEntryExit(String entryExit) {
        this.entryExit = entryExit;
    }

    /**
     * @return The health
     */
    public String getHealth() {
        return health;
    }

    /**
     * @param health The health
     */
    public void setHealth(String health) {
        this.health = health;
    }

    /**
     * @return The lawsCulture
     */
    public String getLawsCulture() {
        return lawsCulture;
    }

    /**
     * @param lawsCulture The laws-culture
     */
    public void setLawsCulture(String lawsCulture) {
        this.lawsCulture = lawsCulture;
    }

    /**
     * @return The disastersClimate
     */
    public String getDisastersClimate() {
        return disastersClimate;
    }

    /**
     * @param disastersClimate The disasters-climate
     */
    public void setDisastersClimate(String disastersClimate) {
        this.disastersClimate = disastersClimate;
    }

    /**
     * @return The officesHelpAbroad
     */
    public OfficesHelpAbroad getOfficesHelpAbroad() {
        return officesHelpAbroad;
    }

    /**
     * @param officesHelpAbroad The offices-help-abroad
     */
    public void setOfficesHelpAbroad(OfficesHelpAbroad officesHelpAbroad) {
        this.officesHelpAbroad = officesHelpAbroad;
    }

    /**
     * @return The offices
     */
    public List<Office> getOffices() {
        return offices;
    }

    /**
     * @param offices The offices
     */
    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }
}
