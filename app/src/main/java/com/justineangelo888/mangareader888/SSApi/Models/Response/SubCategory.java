package com.justineangelo888.mangareader888.SSApi.Models.Response;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Link;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

import java.util.List;

/**
 * Created by justine on 22/04/16.
 */
public class SubCategory {
    private Data data;
    private Link links;
    private Meta meta;
    private List<Data> included;

    public static SubCategory init() {
        return new SubCategory();
    }

    public Data getData() {
        return data;
    }

    public SubCategory setData(Data data) {
        this.data = data;
        return this;
    }

    public Link getLinks() {
        return links;
    }

    public SubCategory setLinks(Link links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public SubCategory setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Data> getIncluded() {
        return included;
    }

    public SubCategory setIncluded(List<Data> included) {
        this.included = included;
        return this;
    }
}
