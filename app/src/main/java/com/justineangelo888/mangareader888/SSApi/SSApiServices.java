package com.justineangelo888.mangareader888.SSApi;

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

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by justine on 20/04/16.
 */
public interface SSApiServices {

    @POST("/devices")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Device> createDeviceData(
            @Header("Authorization") String auth_header,
            @Body CreateDeviceDataRequest request
    );

    //SignIn
    //http://staging.serviceseeking.com.au/users/sign_in
    @POST("users/sign_in")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<User> signIn(
            @Header("Authorization") String auth_header,
            @Body SignInRequest request);

    //http://staging.serviceseeking.com.au/users/forgot_password
    @POST("users/forgot_password")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<User> forgotPassword(
            @Header("Authorization") String auth_header,
            @Body ForgotPasswordRequest request);

    //Get Business
    //http://staging.serviceseeking.com.au/users/713180/business?include=business_status
    @GET("users/{business_id}/business")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Business> getBusiness(
            @Header("Authorization") String auth_header,
            @Path("business_id") String business_id,
            @Query("include") String include);

    //Get Lead
    //http://staging.serviceseeking.com.au/leads/1088946?include=suburb,attachments,business_status
    @GET("leads/{lead_id}")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Lead> getLead(
            @Header("Authorization") String auth_header,
            @Path("lead_id") String lead_id,
            @Query("include") String include);

    //Get Leads
    //http://staging.serviceseeking.com.au/leads?include=suburb,attachments
    @GET("leads")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Leads> getLeads(
            @Header("Authorization") String auth_header,
            @Query("include") String include,
            @Query("page[limit]") String page_limit,
            @Query("page[number]") String page_number,
            @Query("sort") String sort);

    //Discard Lead
    @DELETE("leads/{lead_id}")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Lead> discardLead(
            @Header("Authorization") String auth_header,
            @Path("lead_id") String lead_id
    );

    //View Lead
    @POST("leads/{lead_id}/viewed")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Lead> viewLead(
            @Header("Authorization") String auth_header,
            @Path("lead_id") String lead_id
    );

    //Get Lead Settings
    //http://staging.serviceseeking.com.au/job_filters/90737?include=suburb,sub_categories
    @GET("job_filters/{job_filter_id}")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<JobFilter> getJobFilter(
            @Header("Authorization") String auth_header,
            @Path("job_filter_id") String job_filter_id,
            @Query("include") String include);

    //Update Lead Setting
    //include=suburb,sub_categories&page[size]=999
    @PUT("job_filters/{job_filter_id}")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<JobFilter> updateJobFilter(
            @Header("Authorization") String auth_header,
            @Path("job_filter_id") String job_filter_id,
            @Body UpdateLeadsSettingsRequest request);

    //Get Quote
    //http://staging.serviceseeking.com.au/eois/3779987?include=job.suburb,job,messages
    @GET("eois/{quote_id}")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Quote> getQuote(
            @Header("Authorization") String auth_header,
            @Path("quote_id") String quote_id,
            @Query("include") String include);

    //Get Quotes
    @GET("eois")
    @Headers({
            "Accept: application/vnd.api+json; version=1",
            "Content-Type: application/vnd.api+json"
    })
    Call<Quotes> getQuotes(
            @Header("Authorization") String auth_header,
            @Query("include") String include,
            @Query("page[limit]") String page_limit,
            @Query("page[number]") String page_number,
            @Query("sort") String sort);
}
