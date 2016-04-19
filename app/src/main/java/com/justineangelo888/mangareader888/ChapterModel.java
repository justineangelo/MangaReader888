package com.justineangelo888.mangareader888;

import java.util.List;

/**
 * Created by justine on 14/04/16.
 */
public class ChapterModel {
    String href;
    String name;
    List<Page> pages;
    String lastUpdate;
    public class Page {
        String pageId;
        String url;
    }
}


