package com.justineangelo888.mangareader888.SSApi.Models.Response;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Link;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

import java.util.List;

/**
 * Created by justine on 21/04/16.
 */
public class Suburbs {
    private List<Data> data;
    private Link links;
    private Meta meta;
    private List<Data> included;

    public static Suburbs init() {
        return new Suburbs();
    }

    public List<Data> getData() {
        return data;
    }

    public Suburbs setData(List<Data> data) {
        this.data = data;
        return this;
    }

    public Link getLinks() {
        return links;
    }

    public Suburbs setLinks(Link links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Suburbs setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Data> getIncluded() {
        return included;
    }

    public Suburbs setIncluded(List<Data> included) {
        this.included = included;
        return this;
    }
}
