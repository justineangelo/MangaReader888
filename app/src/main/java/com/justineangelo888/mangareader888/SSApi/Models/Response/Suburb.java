package com.justineangelo888.mangareader888.SSApi.Models.Response;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Link;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

import java.util.List;

/**
 * Created by justine on 21/04/16.
 */
public class Suburb {
    private Data data;
    private Link links;
    private Meta meta;
    private List<Data> included;

    public static Suburb init() {
        return new Suburb();
    }

    public Data getData() {
        return data;
    }

    public Suburb setData(Data data) {
        this.data = data;
        return this;
    }

    public Link getLinks() {
        return links;
    }

    public Suburb setLinks(Link links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Suburb setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Data> getIncluded() {
        return included;
    }

    public Suburb setIncluded(List<Data> included) {
        this.included = included;
        return this;
    }
}
