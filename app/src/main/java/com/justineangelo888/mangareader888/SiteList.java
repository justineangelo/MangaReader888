package com.justineangelo888.mangareader888;

import android.graphics.Point;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Error;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Sub.SubAttribute;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Sub.SubRelationship;
import com.justineangelo888.mangareader888.SSApi.Models.Request.CreateDeviceDataRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.ForgotPasswordRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.SignInRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Request.UpdateLeadsSettingsRequest;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Business;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Device;
import com.justineangelo888.mangareader888.SSApi.Models.Response.JobFilter;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Lead;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Leads;
import com.justineangelo888.mangareader888.SSApi.Models.Response.SubCategories;
import com.justineangelo888.mangareader888.SSApi.Models.Response.Suburb;
import com.justineangelo888.mangareader888.SSApi.Models.Response.User;
import com.justineangelo888.mangareader888.SSApi.SSApiUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SiteList extends AppCompatActivity {
    public static SiteList instance;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = SiteList.this;
        setContentView(R.layout.activity_site_list);
        this.initialized();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void initialized() {
        ApiUtil.sharedInstance().getSiteList().enqueue(new Callback<List<SiteListModel>>() {
            @Override
            public void onResponse(Call<List<SiteListModel>> call, Response<List<SiteListModel>> response) {
//                Log.i("getSiteList", "" + response.isSuccessful());
//                Log.i("getSiteList", "" + call.request().url().toString());
//                Log.i("getSiteList", "code : " + response.code() + " Description : " + response.message());
//                for (SiteListModel site:response.body()) {
//                    Log.i("getSiteList",site.siteId);
//                }
            }

            @Override
            public void onFailure(Call<List<SiteListModel>> call, Throwable t) {

            }
        });
        ApiUtil.sharedInstance().getGenreList("mangareader.net").enqueue(new Callback<List<GenreListModel.Genre>>() {
            @Override
            public void onResponse(Call<List<GenreListModel.Genre>> call, Response<List<GenreListModel.Genre>> response) {
//                Log.i("getGenreList", "" + response.isSuccessful());
//                Log.i("getGenreList", "" + call.request().url().toString());
//                Log.i("getGenreList", "code : " + response.code() + " Description : " + response.message());
//                for (GenreListModel.Genre genre:response.body()) {
//                    Log.i("getSiteList",genre.genreId);
//                }
            }

            @Override
            public void onFailure(Call<List<GenreListModel.Genre>> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getMangaList("mangareader.net", null, null, null).enqueue(new Callback<List<MangaListModel.Manga>>() {
            @Override
            public void onResponse(Call<List<MangaListModel.Manga>> call, Response<List<MangaListModel.Manga>> response) {
//                Log.i("getMangaList", "" + response.isSuccessful());
//                Log.i("getMangaList", "" + call.request().url().toString());
//                Log.i("getMangaList", "code : " + response.code() + " Description : " + response.message());
//                for (MangaListModel.Manga manga:response.body()) {
//                    Log.i("getMangaList",manga.mangaId);
//                }
            }

            @Override
            public void onFailure(Call<List<MangaListModel.Manga>> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getManga("mangareader.net", "pretty-face").enqueue(new Callback<MangaModel>() {
            @Override
            public void onResponse(Call<MangaModel> call, Response<MangaModel> response) {
//                Log.i("getManga", "" + response.isSuccessful());
//                Log.i("getManga", "" + call.request().url().toString());
//                Log.i("getManga", "code : " + response.code() + " Description : " + response.message());
//                MangaModel manga = response.body();
//                Log.i("getManga",manga.href);
            }

            @Override
            public void onFailure(Call<MangaModel> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getMangaList("mangareader.net", "yaoi", null, null).enqueue(new Callback<List<MangaListModel.Manga>>() {
            @Override
            public void onResponse(Call<List<MangaListModel.Manga>> call, Response<List<MangaListModel.Manga>> response) {
//                Log.i("getMangaByGenre", "" + response.isSuccessful());
//                Log.i("getMangaByGenre", "" + call.request().url().toString());
//                Log.i("getMangaByGenre", "code : " + response.code() + " Description : " + response.message());
//                for (MangaListModel.Manga manga:response.body()) {
//                    Log.i("getMangaByGenre",manga.mangaId);
//                }
            }

            @Override
            public void onFailure(Call<List<MangaListModel.Manga>> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getChapter("mangareader.net","sengoku-paradise","1").enqueue(new Callback<ChapterModel>() {
            @Override
            public void onResponse(Call<ChapterModel> call, Response<ChapterModel> response) {
//                Log.i("getChapter", "" + response.isSuccessful());
//                Log.i("getChapter", "" + call.request().url().toString());
//                Log.i("getChapter", "code : " + response.code() + " Description : " + response.message());
//                ChapterModel chapter = response.body();
//                Log.i("getChapter", chapter.href);
//                Log.i("getChapter", "" + chapter.pages.size());
            }

            @Override
            public void onFailure(Call<ChapterModel> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().search("mangareader.net",null,null,null,null,"naruto").enqueue(new Callback<List<MangaListModel.Manga>>() {
            @Override
            public void onResponse(Call<List<MangaListModel.Manga>> call, Response<List<MangaListModel.Manga>> response) {
//                Log.i("search", "" + response.isSuccessful());
//                Log.i("search", "" + call.request().url().toString());
//                Log.i("search", "headers : " + call.request().headers().get("Accept"));
//                Log.i("search", "code : " + response.code() + " Description : " + response.message());
//                for (MangaListModel.Manga manga:response.body()) {
//                    Log.i("search",manga.mangaId);
//                }
            }

            @Override
            public void onFailure(Call<List<MangaListModel.Manga>> call, Throwable t) {

            }
        });

        //OK
//        SSApiUtil.sharedInstance("ygizHC5mSruBh7w7moYt").getBusiness("713180", "business_status").enqueue(new Callback<Business>() {
//            @Override
//            public void onResponse(Call<Business> call, Response<Business> response) {
//                Business business = response.body();
//                Log.i("getBusiness", "" + response.isSuccessful());
//                Log.i("getBusiness", "" + call.request().url().toString());
//                if (business.getData() != null) {
//                    Log.i("getBusiness", "Has Data");
//                    Log.i("getBusiness", " business id: " + business.getData().getId());
//                    Log.i("getBusiness", " business fax: " + business.getData().getAttributes().getFaxNumber());
//                } else {
//                    Log.i("getBusiness", "No Data");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Business> call, Throwable t) {
//
//            }
//        });

        //OK
//        SSApiUtil.sharedInstance("ygizHC5mSruBh7w7moYt").getLeads("suburb,attachments", null, null, null).enqueue(new Callback<Leads>() {
//            @Override
//            public void onResponse(Call<Leads> call, Response<Leads> response) {
//                Leads leads = response.body();
//                Log.i("getLeads", "" + response.isSuccessful());
//                Log.i("getLeads", "" + call.request().url().toString());
//                Log.i("getLeads", "Leads count : " + leads.getData().size());
//
//                for (Data data:leads.getData()) {
//                    Log.i("getLeads", "Has Data");
//                    Log.i("getLeads", " business id: " + data.getId());
//                    Log.i("getLeads", " business fax: " + data.getAttributes().getDescription());
//                    Log.i("getLeads", " suburb name : " + data.getRelationships().getSuburb().getData().getId());
//                    Log.i("getLeads", " attachments count : " + data.getRelationships().getAttachments().getData().size());
//                    for (Data attachment:data.getRelationships().getAttachments().getData()) {
//                        Log.i("getLeads", " attachment id : " + attachment.getId());
//                    }
//                }
//                if (leads.getIncluded() != null) {
//                    Log.i("getLeads", "Included count : " + leads.getIncluded().size());
//                    for (Data entity:leads.getIncluded()) {
//                        Log.i("getLeads", "Included type : " + entity.getType());
//                    }
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<Leads> call, Throwable t) {
//                t.printStackTrace();
//                Log.i("getLeads", "failed :(");
//            }
//        });

        //OK
//        SSApiUtil.sharedInstance("ygizHC5mSruBh7w7moYt").getLead("311570", "suburb,attachments").enqueue(new Callback<Lead>() {
//            @Override
//            public void onResponse(Call<Lead> call, Response<Lead> response) {
//                Lead business = response.body();
//                Log.i("getLead_", "" + response.isSuccessful());
//                Log.i("getLead_", "" + call.request().url().toString());
//                if (business.getData() != null) {
//                    Log.i("getLead_", "Has Data");
//                    Log.i("getLead_", " lead id: " + business.getData().getId());
//                    Log.i("getLead_", " lead fax: " + business.getData().getAttributes().getBiddingClosesOn());
//                } else {
//                    Log.i("getLead_", "No Data");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Lead> call, Throwable t) {
//
//            }
//        });

        //OK
//        SignInRequest request = SignInRequest.init();
//        request.data.setAttributes((new SubAttribute()).setEmail("bing@thousandminds.com").setPassword("thousandminds"));
//        request.meta.setAppName("Test-Droid").setAppVersion("1b0").setDeviceType("Droid").setName("Android").setPlatform("Jelly-Ace").setPlatformVersion("1.4.7");
//        SSApiUtil.sharedInstance(null).signIn(request).enqueue(new Callback<User>() {
//            @Override
//            public void onResponse(Call<User> call, Response<User> response) {
//                User user = response.body();
//                Log.i("signIn", "" + response.isSuccessful());
//                Log.i("signIn", "" + call.request().url().toString());
//                if (user.getData() != null) {
//                    Log.i("signIn", "Has Data");
//                    Log.i("signIn", " user id: " + user.getData().getId());
//                    Log.i("signIn", " relationship business id: " + user.getData().getRelationships().getBusiness().getData().getId());
//                } else {
//                    Log.i("signIn", "No Data");
//                }
//
//                if (user.getIncluded() != null) {
//                    Log.i("signIn", "Included count : " + user.getIncluded().size());
//                    for (Data entity:user.getIncluded()) {
//                        Log.i("signIn", "Included type : " + entity.getType());
//                        Data data = entity.getRelationships().getBusiness().getData();
//
//                        if (data != null) {
//                            Log.i("signIn", "Included business suburb id : " + data.getRelationships().getSuburb().getData().getId());
//                        }
//
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<User> call, Throwable t) {
//
//            }
//        });

        //NOT OK
        UpdateLeadsSettingsRequest updateLeadsSettingsRequest = UpdateLeadsSettingsRequest.init();

        SubRelationship relationship = SubRelationship.init();
        List<Data> subcat = new ArrayList<Data>();
        subcat.add((new Data()).setId("161").setType("job_filter_sub_categories"));
        SubCategories job_filter_sub_categories =  SubCategories.init().setData(subcat);

        updateLeadsSettingsRequest.data
            .setType("job_filters")
            .setAttributes(
                SubAttribute.init()
                    .setRadius(75)
            )
            .setRelationships(
                SubRelationship.init()
                    .setSuburb(Suburb.init().setData(Data.init().setId("1").setType("suburbs")))
                    .setJob_filter_sub_categories(job_filter_sub_categories)
            );

        SSApiUtil.sharedInstance("ygizHC5mSruBh7w7moYt").updateJobFilter("90737", updateLeadsSettingsRequest).enqueue(new Callback<JobFilter>() {
            @Override
            public void onResponse(Call<JobFilter> call, Response<JobFilter> response) {
                JobFilter user = response.body();
                Log.i("updateJobFilter", "is successful? " + response.isSuccessful() + " code : " + response.code() + " description : " + response.message());
                Log.i("updateJobFilter", "" + call.request().url().toString());
                if (user.getData() != null) {
                    Log.i("updateJobFilter", "Has Data");
                    Log.i("updateJobFilter", " user id: " + user.getData().getId());
                } else {
                    Log.i("updateJobFilter", "No Data");
                }
            }

            @Override
            public void onFailure(Call<JobFilter> call, Throwable t) {

            }
        });

        CreateDeviceDataRequest createDeviceDataRequest = CreateDeviceDataRequest.init();
        createDeviceDataRequest.data
                .setType("devices")
                .setAttributes(SubAttribute.init()
                        .setToken("fasfgaoufgoiahsofaospf")
                        .setName("iPhone Simulator")
                        .setDeviceType("x86_64")
                        .setPlatform("iOS")
                        .setPlatforVersion("9.3")
                        .setAppName("au.com.serviceseeking.business")
                        .setAppVersion("1.3.6b85"))
                .setRelationships(SubRelationship.init()
                        .setUser(User.init()
                                .setData(Data.init().setId("713180").setType("users"))));

        SSApiUtil.sharedInstance("ygizHC5mSruBh7w7moYt").createDeviceData(createDeviceDataRequest).enqueue(new Callback<Device>() {
            @Override
            public void onResponse(Call<Device> call, Response<Device> response) {
                Device device = response.body();
                Log.i("createDeviceData", "resp : " + response.raw());
                Log.i("createDeviceData", "is successful? " + response.isSuccessful() + " code : " + response.code() + " description : " + response.message());
                Log.i("createDeviceData", "" + call.request().url().toString());
                if (device.getData() != null) {
                    Log.i("createDeviceData", "Has Data");
                    Log.i("createDeviceData", " user id: " + device.getData().getId());
                } else {
                    Log.i("createDeviceData", "No Data");
                }
            }

            @Override
            public void onFailure(Call<Device> call, Throwable t) {

            }
        });

        ForgotPasswordRequest request = ForgotPasswordRequest.init();
        request.data.setAttributes(SubAttribute.init().setEmail("justine@serviceseeking.com.au"));
        SSApiUtil.sharedInstance("ygizHC5mSruBh7w7moYt").forgotPassword(request).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Gson gson = new Gson();
                try {
                    Error error = gson.fromJson(response.errorBody().string(), Error.class);
                    Log.i("forgotPassword", "resp detail: " + error.getErrors().get(0).getDetail());
//                    Log.i("forgotPassword", "resp : " + response.errorBody().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Log.i("forgotPassword", "is successful? " + response.isSuccessful() + " code : " + response.code() + " description : " + response.message());
                Log.i("forgotPassword", "" + call.request().url().toString());
                if (response.body() == null) {
                    Log.i("forgotPassword", "not able to parse");
                }
                User user = response.body();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });

        final SiteListGridViewAdapter gridViewAdapter = new SiteListGridViewAdapter();
        gridViewAdapter.siteListNames = Arrays.asList("SiteListModel 1", "SiteListModel 2", "SiteListModel 3");
        final GridView siteListGridView = (GridView) findViewById(R.id.gridView);
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        siteListGridView.setColumnWidth(CommonUtil.getScreenSize().widthPixels / 3);
        siteListGridView.setAdapter(gridViewAdapter);
        siteListGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SiteList.this,"Hello " + gridViewAdapter.siteListNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "SiteList Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.justineangelo888.mangareader888/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "SiteList Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.justineangelo888.mangareader888/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

