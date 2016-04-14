package com.justineangelo888.mangareader888;

import org.json.JSONObject;

import retrofit2.Retrofit;

/**
 * Created by justine on 13/04/16.
 */
public class ApiUtil {
    private static final String  baseUrl = "https://doodle-manga-scraper.p.mashape.com/";
    private static ApiUtil instance = new ApiUtil();
    private ApiUtil() {

    }

    public static ApiUtil sharedInstance() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).build();
        return instance;
    }


}
