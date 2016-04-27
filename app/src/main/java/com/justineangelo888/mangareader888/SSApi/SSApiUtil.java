package com.justineangelo888.mangareader888.SSApi;

import android.util.Log;

import com.google.gson.Gson;
import com.justineangelo888.mangareader888.SSApi.Models.Request.*;
import com.justineangelo888.mangareader888.SSApi.Models.Request.ForgotPasswordRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.SignInRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.UpdateJobFilterRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Error;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Lead;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by justine on 20/04/16.
 */
public class SSApiUtil {
    private static final Integer DEFAULT_ERROR_CODE = 500;
    private static final String base_url = "";
    private static final String baseUrl = "https://staging.serviceseeking.com.au";
    private static final String BasicAuthHeader = "Basic c3NzdGFnaW5nOnNzVDNzdDFuZyE=";
    private String authHeader;
    private Retrofit retrofit;
    private SSApiServices service;
    private static Gson gson = new Gson();
    private Call call;
    private String funcName;
    private SSApiUtil() {

    }

    //Internal error parser
    private class GSONError {
        private List<SubError> errors;
        public List<SubError> getErrors() {
            return errors;
        }
    }

    private class SubError {
        private String id;
        private String detail;
        private String title;
        private String links;
        private String status;
        private Integer code;

        public String getId() {
            return id;
        }

        public String getDetail() {
            return detail;
        }

        public String getTitle() {
            return title;
        }

        public String getLinks() {
            return links;
        }

        public String getStatus() {
            return status;
        }

        public Integer getCode() {
            return code;
        }
    }

    //Initialized the request
    public static SSApiUtil sharedInstance(final String token) {
        SSApiUtil instance = new SSApiUtil();
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

    //Check if the response is valid and successful
    private Boolean isSuccessful(Response response, SSApiCompletionHandler completionHandler, String funcName) {
        if (response.isSuccessful()) {
            Log.i(funcName, "SUCCESS");
            completionHandler.success(response.body());
            return true;
        } else {
            Error returnError;
            try {
                GSONError error = gson.fromJson(response.errorBody().string(), GSONError.class);
                returnError = Error.init().setCode(error.getErrors().get(0).getCode()).setDescription(error.getErrors().get(0).getDetail());
            } catch (IOException e) { e.printStackTrace();
                returnError = Error.init().setCode(response.code()).setDescription(response.message());
            }
            Log.i(funcName, "ERROR : " + returnError.toString());
            completionHandler.failed(returnError);
            return false;
        }
    }

    public Call initiate(final SSApiCompletionHandler completionHandler){
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (isSuccessful(response, completionHandler, funcName)) {
                    completionHandler.success(response.body());
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                completionHandler.failed(Error.init().setCode(DEFAULT_ERROR_CODE).setDescription(t.getMessage()));
            }
        });
        return call;
    }

    public SSApiUtil createDeviceData(CreateDeviceDataRequest request) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "request : " + SSApiUtil.gson.toJson(request));
        call = service.createDeviceData(authHeader, request);
        return this;
    }

    public SSApiUtil signIn(SignInRequest request) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "request : " + SSApiUtil.gson.toJson(request));
        call = service.signIn(authHeader, request);
        return this;
    }

    public SSApiUtil forgotPassword(ForgotPasswordRequest request) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "start request : " + SSApiUtil.gson.toJson(request));
        call = service.forgotPassword(authHeader, request);
        return this;
    }

    public SSApiUtil getBusiness(String business_id, String include) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "start request");
        call = service.getBusiness(authHeader, business_id, include);
        return this;
    }

    public SSApiUtil getLead(String lead_id, String include) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "start request");
        call = service.getLead(authHeader, lead_id, include);
        return this;
    }

    public SSApiUtil getLeads(String include, String page_limit, String page_number, String sort) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "start request");
        call = service.getLeads(authHeader, include, page_limit, page_number, sort);
        return this;
    }

    public Call<Lead> discardLead(String lead_id) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "start request");
        call = service.discardLead(authHeader, lead_id);
        return call;
    }

    public SSApiUtil viewLead(String lead_id) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "start request");
        call = service.viewLead(authHeader, lead_id);
        return this;
    }

    public SSApiUtil updateJobFilter(String job_filter_id, UpdateJobFilterRequest request) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "request : " + SSApiUtil.gson.toJson(request));
        call = service.updateJobFilter(authHeader, job_filter_id, request);
        return this;
    }

    public SSApiUtil getQuote(String quote_id, String include) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "request");
        call = service.getQuote(authHeader, quote_id, include);
        return this;
    }

    public SSApiUtil getQuotes(String include, String page_limit, String page_number, String sort) {
        funcName = new Object(){}.getClass().getEnclosingMethod().getName();
        Log.i(funcName, "request");
        call = service.getQuotes(authHeader, include, page_limit, page_number, sort);
        return this;
    }
}
