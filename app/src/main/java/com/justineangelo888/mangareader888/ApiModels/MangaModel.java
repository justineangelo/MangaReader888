package com.justineangelo888.mangareader888.ApiModels;

import java.util.List;

/**
 * Created by justine on 14/04/16.
 */
public class MangaModel {
    String name;
    String href;
    List<String> author;
    List<String> artist;
    String status;
    String yearOfRelease;
    List<String> genres;
    String info;
    String cover;
    String lastUpdate;
    List<Chapter> chapters;
    public class Chapter {
        String chapterId;
        String name;
    }
}
