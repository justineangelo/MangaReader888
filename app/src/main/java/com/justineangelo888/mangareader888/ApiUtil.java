package com.justineangelo888.mangareader888;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by justine on 13/04/16.
 */
public class ApiUtil {
    private static final String baseUrl = "https://doodle-manga-scraper.p.mashape.com/";
    private static final String headerKey = "aslZFMQAiYmshYlDOgMBDfET2ohtp18ASNYjsnhnsmRqLWvXuL";
    private static ApiUtil instance = new ApiUtil();
    private Retrofit retrofit;
    private MangaScraperApiUtil service;
    private ApiUtil() {}

    public static ApiUtil sharedInstance() {
        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader("X-Mashape-Key", headerKey)
                        .addHeader("Accept", "text/plain")
                        .build();
                return chain.proceed(request);
            }
        }).build();
        instance.retrofit = new Retrofit.Builder().baseUrl(baseUrl).client(httpClient).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        instance.service = instance.retrofit.create(MangaScraperApiUtil.class);
        return instance;
    }

    public Call<List<SiteListModel>> getSiteList() {
        Call<List<SiteListModel>> call = service.getSiteList();
        return call;
    }

    public Call<List<GenreListModel.Genre>> getGenreList(String site_id) {
        Call<List<GenreListModel.Genre>> call = service.getGenreList(site_id);
        return call;
    }

    public Call<List<MangaListModel.Manga>> getMangaList(String site_id, String genre_id, String cover, String info) {
        Call<List<MangaListModel.Manga>> call;
        if (genre_id == null) {
            call = service.getMangaList(site_id, cover, info);
        } else {
            call = service.getMangaByGenre(site_id, genre_id, cover, info);
        }
        return  call;
    }

    public Call<MangaModel> getManga(String site_id, String manga_id) {
        Call<MangaModel> call = service.getManga(site_id, manga_id);
        return  call;
    }

    public Call<ChapterModel> getChapter(String site_id, String manga_id, String chapter_id) {
        Call<ChapterModel> call = service.getChapter(site_id, manga_id, chapter_id);
        return  call;
    }

    public Call<List<MangaListModel.Manga>> search(String site_id, String cover, List<String> g, String info, String l, String q) {
        Call<List<MangaListModel.Manga>> call = service.search(site_id, cover, g, info, l, q);
        return call;
    }
}