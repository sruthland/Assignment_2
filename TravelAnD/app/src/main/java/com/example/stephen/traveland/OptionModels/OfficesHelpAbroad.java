package com.example.stephen.traveland.OptionModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Stephen on 8/15/2015.
 */
public class OfficesHelpAbroad {
    @SerializedName("opening-text")
    @Expose
    private String openingText;
    @SerializedName("closing-text")
    @Expose
    private String closingText;

    /**
     * @return The openingText
     */
    public String getOpeningText() {
        return openingText;
    }

    /**
     * @param openingText The opening-text
     */
    public void setOpeningText(String openingText) {
        this.openingText = openingText;
    }

    /**
     * @return The closingText
     */
    public String getClosingText() {
        return closingText;
    }

    /**
     * @param closingText The closing-text
     */
    public void setClosingText(String closingText) {
        this.closingText = closingText;
    }
}
