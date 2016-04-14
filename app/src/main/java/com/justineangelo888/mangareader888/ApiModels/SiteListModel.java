package com.justineangelo888.mangareader888.ApiModels;
import java.util.HashMap;
import java.util.List;

/**
 * Created by justine on 14/04/16.
 */
public class SiteListModel {
    List<Site> list;
    public class Site {
        String siteId;
        List<String> mangaProperties;
        List<HashMap<String,String>> genres;
    }
}
