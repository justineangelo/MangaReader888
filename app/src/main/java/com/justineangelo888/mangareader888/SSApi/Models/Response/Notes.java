package com.justineangelo888.mangareader888.SSApi.Models.Response;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Link;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

import java.util.List;

/**
 * Created by justine on 22/04/16.
 */
public class Notes {
    private List<Data> data;
    private Link links;
    private Meta meta;
    private List<Data> included;

    public static Notes init() {
        return new Notes();
    }

    public List<Data> getIncluded() {
        return included;
    }

    public Notes setIncluded(List<Data> included) {
        this.included = included;
        return this;
    }

    public List<Data> getData() {
        return data;
    }

    public Notes setData(List<Data> data) {
        this.data = data;
        return this;
    }

    public Link getLinks() {
        return links;
    }

    public Notes setLinks(Link links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Notes setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }
}
