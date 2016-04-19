package com.justineangelo888.mangareader888;

import android.content.Context;
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
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

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
                Log.i("getSiteList", "" + response.isSuccessful());
                Log.i("getSiteList", "" + call.request().url().toString());
                Log.i("getSiteList", "code : " + response.code() + " Description : " + response.message());
                for (SiteListModel site:response.body()) {
                    Log.i("getSiteList",site.siteId);
                }
            }

            @Override
            public void onFailure(Call<List<SiteListModel>> call, Throwable t) {

            }
        });
        ApiUtil.sharedInstance().getGenreList("mangareader.net").enqueue(new Callback<List<GenreListModel.Genre>>() {
            @Override
            public void onResponse(Call<List<GenreListModel.Genre>> call, Response<List<GenreListModel.Genre>> response) {
                Log.i("getGenreList", "" + response.isSuccessful());
                Log.i("getGenreList", "" + call.request().url().toString());
                Log.i("getGenreList", "code : " + response.code() + " Description : " + response.message());
                for (GenreListModel.Genre genre:response.body()) {
                    Log.i("getSiteList",genre.genreId);
                }
            }

            @Override
            public void onFailure(Call<List<GenreListModel.Genre>> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getMangaList("mangareader.net", null, null, null).enqueue(new Callback<List<MangaListModel.Manga>>() {
            @Override
            public void onResponse(Call<List<MangaListModel.Manga>> call, Response<List<MangaListModel.Manga>> response) {
                Log.i("getMangaList", "" + response.isSuccessful());
                Log.i("getMangaList", "" + call.request().url().toString());
                Log.i("getMangaList", "code : " + response.code() + " Description : " + response.message());
                for (MangaListModel.Manga manga:response.body()) {
                    Log.i("getMangaList",manga.mangaId);
                }
            }

            @Override
            public void onFailure(Call<List<MangaListModel.Manga>> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getManga("mangareader.net", "pretty-face").enqueue(new Callback<MangaModel>() {
            @Override
            public void onResponse(Call<MangaModel> call, Response<MangaModel> response) {
                Log.i("getManga", "" + response.isSuccessful());
                Log.i("getManga", "" + call.request().url().toString());
                Log.i("getManga", "code : " + response.code() + " Description : " + response.message());
                MangaModel manga = response.body();
                Log.i("getManga",manga.href);
            }

            @Override
            public void onFailure(Call<MangaModel> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getMangaList("mangareader.net", "yaoi", null, null).enqueue(new Callback<List<MangaListModel.Manga>>() {
            @Override
            public void onResponse(Call<List<MangaListModel.Manga>> call, Response<List<MangaListModel.Manga>> response) {
                Log.i("getMangaByGenre", "" + response.isSuccessful());
                Log.i("getMangaByGenre", "" + call.request().url().toString());
                Log.i("getMangaByGenre", "code : " + response.code() + " Description : " + response.message());
                for (MangaListModel.Manga manga:response.body()) {
                    Log.i("getMangaByGenre",manga.mangaId);
                }
            }

            @Override
            public void onFailure(Call<List<MangaListModel.Manga>> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().getChapter("mangareader.net","sengoku-paradise","1").enqueue(new Callback<ChapterModel>() {
            @Override
            public void onResponse(Call<ChapterModel> call, Response<ChapterModel> response) {
                Log.i("getChapter", "" + response.isSuccessful());
                Log.i("getChapter", "" + call.request().url().toString());
                Log.i("getChapter", "code : " + response.code() + " Description : " + response.message());
                ChapterModel chapter = response.body();
                Log.i("getChapter", chapter.href);
                Log.i("getChapter", "" + chapter.pages.size());
            }

            @Override
            public void onFailure(Call<ChapterModel> call, Throwable t) {

            }
        });

        ApiUtil.sharedInstance().search("mangareader.net",null,null,null,null,"naruto").enqueue(new Callback<List<MangaListModel.Manga>>() {
            @Override
            public void onResponse(Call<List<MangaListModel.Manga>> call, Response<List<MangaListModel.Manga>> response) {
                Log.i("search", "" + response.isSuccessful());
                Log.i("search", "" + call.request().url().toString());
                Log.i("search", "code : " + response.code() + " Description : " + response.message());
                for (MangaListModel.Manga manga:response.body()) {
                    Log.i("search",manga.mangaId);
                }
            }

            @Override
            public void onFailure(Call<List<MangaListModel.Manga>> call, Throwable t) {

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

