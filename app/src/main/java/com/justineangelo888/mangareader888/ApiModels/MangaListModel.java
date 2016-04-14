package com.justineangelo888.mangareader888.ApiModels;

import java.util.List;

/**
 * Created by justine on 14/04/16.
 */

//For get mangalist or
//get mangalist by genre
//for search
public class MangaListModel {
    public class Manga {
        String mangaId;
        String name;
        List<String> genres;
    }
}
