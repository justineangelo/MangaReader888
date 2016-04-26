package com.justineangelo888.mangareader888.SSApi.Models.Response;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Link;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

import java.util.List;

/**
 * Created by justine on 21/04/16.
 */
public class User {
    private Data data;
    private Link links;
    private Meta meta;
    private List<Data> included;

    public static User init() {
        return new User();
    }

    public Data getData() {
        return data;
    }

    public User setData(Data data) {
        this.data = data;
        return this;
    }

    public Link getLinks() {
        return links;
    }

    public User setLinks(Link links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public User setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Data> getIncluded() {
        return included;
    }
}
