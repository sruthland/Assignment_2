package com.example.stephen.traveland.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fra {

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


}
