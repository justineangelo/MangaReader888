package com.justineangelo888.mangareader888;

import com.justineangelo888.mangareader888.ApiModels.ChapterModel;
import com.justineangelo888.mangareader888.ApiModels.GenreListModel;
import com.justineangelo888.mangareader888.ApiModels.MangaListModel;
import com.justineangelo888.mangareader888.ApiModels.MangaModel;
import com.justineangelo888.mangareader888.ApiModels.SiteListModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by justine on 14/04/16.
 */
public interface MangaScraperApiUtil {
    @GET("{site_id}/manga/{manga_id}/{chapter_id}")
    Call<ChapterModel>getChapter(@Path("site_id") String site_id, @Path("manga_id") String manga_id, @Path("chapter_id") String chapter_id);

    @GET("{site_id}/search/genres")
    Call<List<GenreListModel.Genre>>getGenreList(@Path("site_id") String site_id);

    @GET("{site_id}/manga/{manga_id}")
    Call<MangaModel>getManga(@Path("site_id") String site_id, @Path("manga_id") String manga_id);

    @GET("{site_id}/search/genres/{genre_id}")
    Call<List<MangaListModel.Manga>>getMangaByGenre(@Path("site_id") String site_id, @Path("genre_id") String genre_id,
                                                    @Query("cover") String cover,
                                                    @Query("info") String info);

    @GET("{site_id}")
    Call<List<MangaListModel.Manga>>getMangaList(@Path("user_id") String user_id,
                                                 @Query("cover") String cover,
                                                 @Query("info") String info);

    @GET("")
    Call<List<SiteListModel>>getSiteList();

    @GET("{site_id}/search")
    Call<List<MangaListModel.Manga>>search(@Path("site_id") String user_id,
                                           @Query("cover") String cover,
                                           @Query("g") List<String> g,
                                           @Query("info") String info,
                                           @Query("l") String l,
                                           @Query("q") String q);


}
