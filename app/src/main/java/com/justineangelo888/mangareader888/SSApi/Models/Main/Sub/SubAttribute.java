package com.justineangelo888.mangareader888.SSApi.Models.Main.Sub;

import com.google.gson.annotations.SerializedName;
import com.justineangelo888.mangareader888.SSApi.Models.Response.SubCategories;

import java.security.PrivateKey;

/**
     * Created by justine on 21/04/16.
     */

    //Business, Business Status, Suburb, User, Leads, Attachments, Category, SubCategory, JobFilter, Eoi/Quote, Message, Note, Eoi/Quote-Template
    public class SubAttribute {
        private String appVersion;
        private String appName;
        private String platforVersion;
        private String platform;
        private String deviceType;
        private String token;
        private String password;
        @SerializedName(value = "default") private Boolean isDefault;
        private String responseTemplate;
        private String content;
        private String sender;
        private String body;
        private Boolean canContactUser;
        private Boolean deleted;
        private Boolean gst;
        private String rate;
        private Double upperPrice;
        private Double price;
        private String priceType;
        private String eoiStatus;
        private String subfolder;
        private String bandExpiresAt;
        private Integer band;
        private String coverageType;
        private Integer radius;
        private String jobTitle;
        private String contentType;
        private Integer size;
        private String url;
        private String thumbUrl;
        private String userName;
        private String suburbName;
        private String biddingClosesOn;
        private String distanceAway;
        private String timing;
        private Boolean canQuote;
        private Boolean withinRange;
        @SerializedName(value = "new") private Boolean isNew;
        private Boolean featured;
        private Boolean urgent;
        @SerializedName(value = "private") private Boolean isPrivate;
        private String active;
        private String abn;
        private String abnStatus;
        private String membershipPlan;
        private Boolean membershipActive;
        private Boolean identityVerified;
        private Boolean creditCardValid;
        private String quoteLastSentAt;
        private Integer quoteCountLast30Days;
        private String name;
        private String email;
        private String postcode;
        private String lat;
        private String lng;
        private String area;
        private String region;
        private String number;
        private String phone;
        private String description;
        private String mobilePhone;
        private String faxNumber;
        private String address;
        private String websiteUrl;
        private String status;
        private String state;
        private Boolean hidden;
        private String createdAt;
        private String updatedAt;

        public static SubAttribute init() {
            return new SubAttribute();
        }

        public SubAttribute setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        public SubAttribute setAppName(String appName) {
            this.appName = appName;
            return this;
        }

        public SubAttribute setPlatforVersion(String platforVersion) {
            this.platforVersion = platforVersion;
            return this;
        }

        public SubAttribute setPlatform(String platform) {
            this.platform = platform;
            return this;
        }

        public SubAttribute setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public SubAttribute setToken(String token) {
            this.token = token;
            return this;
        }

        public SubAttribute setPassword(String password) {
            this.password = password;
            return this;
        }

        public Boolean getDefault() {
                return isDefault;
        }

        public SubAttribute setDefault(Boolean aDefault) {
            isDefault = aDefault;
            return this;
        }

        public String getResponseTemplate() {
            return responseTemplate;
        }

        public SubAttribute setResponseTemplate(String responseTemplate) {
            this.responseTemplate = responseTemplate;
            return this;
        }

        public String getContent() {
            return content;
        }

        public SubAttribute setContent(String content) {
            this.content = content;
            return this;
        }

        public String getSender() {
            return sender;
        }

        public SubAttribute setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public String getBody() {
            return body;
        }

        public SubAttribute setBody(String body) {
            this.body = body;
            return this;
        }

        public Boolean getCanContactUser() {
            return canContactUser;
        }

        public SubAttribute setCanContactUser(Boolean canContactUser) {
            this.canContactUser = canContactUser;
            return this;
        }

        public Boolean getDeleted() {
            return deleted;
        }

        public SubAttribute setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public Boolean getGst() {
            return gst;
        }

        public SubAttribute setGst(Boolean gst) {
            this.gst = gst;
            return this;
        }

        public String getRate() {
            return rate;
        }

        public SubAttribute setRate(String rate) {
            this.rate = rate;
            return this;
        }

        public Double getUpperPrice() {
            return upperPrice;
        }

        public SubAttribute setUpperPrice(Double upperPrice) {
            this.upperPrice = upperPrice;
            return this;
        }

        public Double getPrice() {
            return price;
        }

        public SubAttribute setPrice(Double price) {
            this.price = price;
            return this;
        }

        public String getPriceType() {
            return priceType;
        }

        public SubAttribute setPriceType(String priceType) {
            this.priceType = priceType;
            return this;
        }

        public String getEoiStatus() {
            return eoiStatus;
        }

        public SubAttribute setEoiStatus(String eoiStatus) {
            this.eoiStatus = eoiStatus;
            return this;
        }

        public String getSubfolder() {
            return subfolder;
        }

        public SubAttribute setSubfolder(String subfolder) {
            this.subfolder = subfolder;
            return this;
        }

        public String getBandExpiresAt() {
            return bandExpiresAt;
        }

        public SubAttribute setBandExpiresAt(String bandExpiresAt) {
            this.bandExpiresAt = bandExpiresAt;
            return this;
        }

        public Integer getBand() {
            return band;
        }

        public SubAttribute setBand(Integer band) {
            this.band = band;
            return this;
        }

        public String getCoverageType() {
            return coverageType;
        }

        public SubAttribute setCoverageType(String coverageType) {
            this.coverageType = coverageType;
            return this;
        }

        public Integer getRadius() {
            return radius;
        }

        public SubAttribute setRadius(Integer radius) {
            this.radius = radius;
            return this;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public SubAttribute setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public String getContentType() {
            return contentType;
        }

        public SubAttribute setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Integer getSize() {
            return size;
        }

        public SubAttribute setSize(Integer size) {
            this.size = size;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public SubAttribute setUrl(String url) {
            this.url = url;
            return this;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public SubAttribute setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public String getUserName() {
            return userName;
        }

        public SubAttribute setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public String getSuburbName() {
            return suburbName;
        }

        public SubAttribute setSuburbName(String suburbName) {
            this.suburbName = suburbName;
            return this;
        }

        public String getBiddingClosesOn() {
            return biddingClosesOn;
        }

        public SubAttribute setBiddingClosesOn(String biddingClosesOn) {
            this.biddingClosesOn = biddingClosesOn;
            return this;
        }

        public String getDistanceAway() {
            return distanceAway;
        }

        public SubAttribute setDistanceAway(String distanceAway) {
            this.distanceAway = distanceAway;
            return this;
        }

        public String getTiming() {
            return timing;
        }

        public SubAttribute setTiming(String timing) {
            this.timing = timing;
            return this;
        }

        public Boolean getCanQuote() {
            return canQuote;
        }

        public SubAttribute setCanQuote(Boolean canQuote) {
            this.canQuote = canQuote;
            return this;
        }

        public Boolean getWithinRange() {
            return withinRange;
        }

        public SubAttribute setWithinRange(Boolean withinRange) {
            this.withinRange = withinRange;
            return this;
        }

        public Boolean getNew() {
            return isNew;
        }

        public SubAttribute setNew(Boolean aNew) {
            isNew = aNew;
            return this;
        }

        public Boolean getFeatured() {
            return featured;
        }

        public SubAttribute setFeatured(Boolean featured) {
            this.featured = featured;
            return this;
        }

        public Boolean getUrgent() {
            return urgent;
        }

        public SubAttribute setUrgent(Boolean urgent) {
            this.urgent = urgent;
            return this;
        }

        public Boolean getPrivate() {
            return isPrivate;
        }

        public SubAttribute setPrivate(Boolean aPrivate) {
            isPrivate = aPrivate;
            return this;
        }

        public String getName() {
            return name;
        }

        public SubAttribute setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public SubAttribute setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPostcode() {
            return postcode;
        }

        public SubAttribute setPostcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public String getLat() {
            return lat;
        }

        public SubAttribute setLat(String lat) {
            this.lat = lat;
            return this;
        }

        public String getLng() {
            return lng;
        }

        public SubAttribute setLng(String lng) {
            this.lng = lng;
            return this;
        }

        public String getArea() {
            return area;
        }

        public SubAttribute setArea(String area) {
            this.area = area;
            return this;
        }

        public String getRegion() {
            return region;
        }

        public SubAttribute setRegion(String region) {
            this.region = region;
            return this;
        }

        public String getNumber() {
            return number;
        }

        public SubAttribute setNumber(String number) {
            this.number = number;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public SubAttribute setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public SubAttribute setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public SubAttribute setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public String getFaxNumber() {
            return faxNumber;
        }

        public SubAttribute setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public SubAttribute setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getWebsiteUrl() {
            return websiteUrl;
        }

        public SubAttribute setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }

        public String getStatus() {
            return status;
        }

        public SubAttribute setStatus(String status) {
            this.status = status;
            return this;
        }

        public String getState() {
            return state;
        }

        public SubAttribute setState(String state) {
            this.state = state;
            return this;
        }

        public Boolean getHidden() {
            return hidden;
        }

        public SubAttribute setHidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public SubAttribute setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public SubAttribute setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public String getActive() {
            return active;
        }

        public SubAttribute setActive(String active) {
            this.active = active;
            return this;
        }

        public String getAbn() {
            return abn;
        }

        public SubAttribute setAbn(String abn) {
            this.abn = abn;
            return this;
        }

        public String getAbnStatus() {
            return abnStatus;
        }

        public SubAttribute setAbnStatus(String abnStatus) {
            this.abnStatus = abnStatus;
            return this;
        }

        public String getMembershipPlan() {
            return membershipPlan;
        }

        public SubAttribute setMembershipPlan(String membershipPlan) {
            this.membershipPlan = membershipPlan;
            return this;
        }

        public Boolean getMembershipActive() {
            return membershipActive;
        }

        public SubAttribute setMembershipActive(Boolean membershipActive) {
            this.membershipActive = membershipActive;
            return this;
        }

        public Boolean getIdentityVerified() {
            return identityVerified;
        }

        public SubAttribute setIdentityVerified(Boolean identityVerified) {
            this.identityVerified = identityVerified;
            return this;
        }

        public Boolean getCreditCardValid() {
            return creditCardValid;
        }

        public SubAttribute setCreditCardValid(Boolean creditCardValid) {
            this.creditCardValid = creditCardValid;
            return this;
        }

        public String getQuoteLastSentAt() {
            return quoteLastSentAt;
        }

        public SubAttribute setQuoteLastSentAt(String quoteLastSentAt) {
            this.quoteLastSentAt = quoteLastSentAt;
            return this;
        }

        public Integer getQuoteCountLast30Days() {
            return quoteCountLast30Days;
        }

        public SubAttribute setQuoteCountLast30Days(Integer quoteCountLast30Days) {
            this.quoteCountLast30Days = quoteCountLast30Days;
            return this;
        }
    }

