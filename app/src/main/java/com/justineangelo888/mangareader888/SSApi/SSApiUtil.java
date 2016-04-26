package com.justineangelo888.mangareader888.SSApi;

import android.util.Log;

import com.google.gson.Gson;
import com.justineangelo888.mangareader888.SSApi.Models.Request.CreateDeviceDataRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.ForgotPasswordRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.SignInRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.UpdateLeadsSettingsRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Business;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Device;
import com.justineangelo888.mangareader888.SSApi.Models.Response.JobFilter;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Lead;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Leads;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Quote;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Quotes;
import com.justineangelo888.mangareader888.SSApi.Models.Response.User;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by justine on 20/04/16.
 */
public class SSApiUtil {
    private static final String base_url = "";
    private static final String baseUrl = "https://staging.serviceseeking.com.au";
    private static final String BasicAuthHeader = "Basic c3NzdGFnaW5nOnNzVDNzdDFuZyE=";
    private static SSApiUtil instance = new SSApiUtil();
    private String authHeader;
    private Retrofit retrofit;
    private SSApiServices service;
    private static Gson gson = new Gson();
    private SSApiUtil() {

    }

    public static SSApiUtil sharedInstance(final String token) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient ssHttpClient = new OkHttpClient.Builder().addInterceptor(logging).build();
        instance.retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        instance.service = instance.retrofit.create(SSApiServices.class);
        StringBuilder authBuilder = new StringBuilder(BasicAuthHeader);
        if (token != null) { authBuilder.append(", Token toke=" + token); }
        instance.authHeader = authBuilder.toString();
        return instance;
    }

    public Call<Device> createDeviceData(CreateDeviceDataRequest request) {
        Log.i("createDeviceData", "request : " + SSApiUtil.gson.toJson(request));
        return service.createDeviceData(authHeader, request);
    }

    public Call<User> signIn(SignInRequest request) {
        Log.i("signIn", "request : " + SSApiUtil.gson.toJson(request));
        return service.signIn(authHeader, request);
    }

    public  Call<User> forgotPassword(ForgotPasswordRequest request) {
        Log.i("forgotPassword", "request : " + SSApiUtil.gson.toJson(request));
        return service.forgotPassword(authHeader, request);
    }

    public Call<Business> getBusiness(String business_id, String include) {
        return service.getBusiness(authHeader, business_id, include);
    }

    public Call<Lead> getLead(String lead_id, String include) {
        return service.getLead(authHeader, lead_id, include);
    }

    public Call<Leads> getLeads(String include, String page_limit, String page_number, String sort) {
        return service.getLeads(authHeader, include, page_limit, page_number, sort);
    }

    public Call<Lead> discardLead(String lead_id) {
        return service.discardLead(authHeader, lead_id);
    }

    public Call<Lead> viewLead(String lead_id) {
        return service.viewLead(authHeader, lead_id);
    }

    public Call<JobFilter> updateJobFilter(String job_filter_id, UpdateLeadsSettingsRequest request) {
        Log.i("updateJobFilter", "request : " + SSApiUtil.gson.toJson(request));
        return service.updateJobFilter(authHeader, job_filter_id, request);
    }

    public Call<Quote> getQuote(String quote_id, String include) {
        return service.getQuote(authHeader, quote_id, include);
    }

    public Call<Quotes> getQuotes(String include, String page_limit, String page_number, String sort) {
        return service.getQuotes(authHeader, include, page_limit, page_number, sort);
    }


}
