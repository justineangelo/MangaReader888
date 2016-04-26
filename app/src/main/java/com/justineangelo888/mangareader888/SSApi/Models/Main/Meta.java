package com.justineangelo888.mangareader888.SSApi.Models.Main;

/**
 * Created by justine on 21/04/16.
 */
public class Meta {
    private String count;
    private String unReadCount;
    private String token;
    private String platform;
    private String platformVersion;
    private String name;
    private String deviceType;
    private String appName;
    private String appVersion;

    public static Meta init(){
        return new Meta();
    }
    public String getCount() {
        return count;
    }

    public String getUnReadCount() {
        return unReadCount;
    }

    public String getToken() {
        return token;
    }

    public Meta setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public Meta setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    public Meta setName(String name) {
        this.name = name;
        return this;
    }

    public Meta setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    public Meta setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public Meta setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
}
