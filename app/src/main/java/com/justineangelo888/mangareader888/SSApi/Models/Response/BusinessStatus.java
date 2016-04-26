package com.justineangelo888.mangareader888.SSApi.Models.Response;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Link;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

import java.util.List;

/**
 * Created by justine on 21/04/16.
 */
public class BusinessStatus {
    private Data data;
    private Link links;
    private Meta meta;
    private List<Data> included;

    public static BusinessStatus init() {
        return new BusinessStatus();
    }

    public Data getData() {
        return data;
    }

    public BusinessStatus setData(Data data) {
        this.data = data;
        return this;
    }

    public Link getLinks() {
        return links;
    }

    public BusinessStatus setLinks(Link links) {
        this.links = links;
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public BusinessStatus setMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public List<Data> getIncluded() {
        return included;
    }

    public BusinessStatus setIncluded(List<Data> included) {
        this.included = included;
        return this;
    }
}
