package com.example.stephen.traveland.OptionModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Stephen on 8/15/2015.
 */
public class Office {
    @SerializedName("office-id")
    @Expose
    private Integer officeId;
    @SerializedName("country-iso")
    @Expose
    private String countryIso;
    @Expose
    private String lat;
    @Expose
    private String lng;
    @SerializedName("is-primary")
    @Expose
    private Integer isPrimary;
    @SerializedName("honorary-consul")
    @Expose
    private Integer honoraryConsul;
    @SerializedName("is-partner")
    @Expose
    private Integer isPartner;
    @SerializedName("has-passport-services")
    @Expose
    private Integer hasPassportServices;
    @Expose
    private String country;
    @Expose
    private String city;
    @Expose
    private String type;
    @Expose
    private String address;
    @SerializedName("postal-address")
    @Expose
    private String postalAddress;
    @SerializedName("tel-legacy")
    @Expose
    private String telLegacy;
    @SerializedName("emergency-toll-free-legacy")
    @Expose
    private String emergencyTollFreeLegacy;
    @SerializedName("fax-legacy")
    @Expose
    private String faxLegacy;
    @SerializedName("email-1")
    @Expose
    private String email1;
    @SerializedName("email-2")
    @Expose
    private String email2;
    @SerializedName("email-3")
    @Expose
    private String email3;
    @Expose
    private String internet;
    @SerializedName("note-1-title")
    @Expose
    private String note1Title;
    @SerializedName("note-1-text")
    @Expose
    private String note1Text;
    @SerializedName("note-2-title")
    @Expose
    private String note2Title;
    @SerializedName("note-2-text")
    @Expose
    private String note2Text;
    @SerializedName("note-3-title")
    @Expose
    private String note3Title;
    @SerializedName("note-3-text")
    @Expose
    private String note3Text;

    /**
     * @return The officeId
     */
    public Integer getOfficeId() {
        return officeId;
    }

    /**
     * @param officeId The office-id
     */
    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
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
     * @return The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return The lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * @param lng The lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * @return The isPrimary
     */
    public Integer getIsPrimary() {
        return isPrimary;
    }

    /**
     * @param isPrimary The is-primary
     */
    public void setIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * @return The honoraryConsul
     */
    public Integer getHonoraryConsul() {
        return honoraryConsul;
    }

    /**
     * @param honoraryConsul The honorary-consul
     */
    public void setHonoraryConsul(Integer honoraryConsul) {
        this.honoraryConsul = honoraryConsul;
    }

    /**
     * @return The isPartner
     */
    public Integer getIsPartner() {
        return isPartner;
    }

    /**
     * @param isPartner The is-partner
     */
    public void setIsPartner(Integer isPartner) {
        this.isPartner = isPartner;
    }

    /**
     * @return The hasPassportServices
     */
    public Integer getHasPassportServices() {
        return hasPassportServices;
    }

    /**
     * @param hasPassportServices The has-passport-services
     */
    public void setHasPassportServices(Integer hasPassportServices) {
        this.hasPassportServices = hasPassportServices;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The postalAddress
     */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * @param postalAddress The postal-address
     */
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    /**
     * @return The telLegacy
     */
    public String getTelLegacy() {
        return telLegacy;
    }

    /**
     * @param telLegacy The tel-legacy
     */
    public void setTelLegacy(String telLegacy) {
        this.telLegacy = telLegacy;
    }

    /**
     * @return The emergencyTollFreeLegacy
     */
    public String getEmergencyTollFreeLegacy() {
        return emergencyTollFreeLegacy;
    }

    /**
     * @param emergencyTollFreeLegacy The emergency-toll-free-legacy
     */
    public void setEmergencyTollFreeLegacy(String emergencyTollFreeLegacy) {
        this.emergencyTollFreeLegacy = emergencyTollFreeLegacy;
    }

    /**
     * @return The faxLegacy
     */
    public String getFaxLegacy() {
        return faxLegacy;
    }

    /**
     * @param faxLegacy The fax-legacy
     */
    public void setFaxLegacy(String faxLegacy) {
        this.faxLegacy = faxLegacy;
    }

    /**
     * @return The email1
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * @param email1 The email-1
     */
    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    /**
     * @return The email2
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * @param email2 The email-2
     */
    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    /**
     * @return The email3
     */
    public String getEmail3() {
        return email3;
    }

    /**
     * @param email3 The email-3
     */
    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    /**
     * @return The internet
     */
    public String getInternet() {
        return internet;
    }

    /**
     * @param internet The internet
     */
    public void setInternet(String internet) {
        this.internet = internet;
    }

    /**
     * @return The note1Title
     */
    public String getNote1Title() {
        return note1Title;
    }

    /**
     * @param note1Title The note-1-title
     */
    public void setNote1Title(String note1Title) {
        this.note1Title = note1Title;
    }

    /**
     * @return The note1Text
     */
    public String getNote1Text() {
        return note1Text;
    }

    /**
     * @param note1Text The note-1-text
     */
    public void setNote1Text(String note1Text) {
        this.note1Text = note1Text;
    }

    /**
     * @return The note2Title
     */
    public String getNote2Title() {
        return note2Title;
    }

    /**
     * @param note2Title The note-2-title
     */
    public void setNote2Title(String note2Title) {
        this.note2Title = note2Title;
    }

    /**
     * @return The note2Text
     */
    public String getNote2Text() {
        return note2Text;
    }

    /**
     * @param note2Text The note-2-text
     */
    public void setNote2Text(String note2Text) {
        this.note2Text = note2Text;
    }

    /**
     * @return The note3Title
     */
    public String getNote3Title() {
        return note3Title;
    }

    /**
     * @param note3Title The note-3-title
     */
    public void setNote3Title(String note3Title) {
        this.note3Title = note3Title;
    }

    /**
     * @return The note3Text
     */
    public String getNote3Text() {
        return note3Text;
    }

    /**
     * @param note3Text The note-3-text
     */
    public void setNote3Text(String note3Text) {
        this.note3Text = note3Text;
    }
}
