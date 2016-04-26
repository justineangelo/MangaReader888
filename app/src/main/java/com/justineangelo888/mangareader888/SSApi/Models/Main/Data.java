package com.justineangelo888.mangareader888.SSApi.Models.Main;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Sub.*;

/**
 * Created by justine on 21/04/16.
 */
public class Data {
    private String id;
    private String type;
    private SubAttribute attributes;
    private SubRelationship relationships;
    private SubLink links;

    //DAO
    public Data() {

    }

    public static Data init() {
        return new Data();
    }
    public String getId() {
        return id;
    }

    public Data setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public Data setType(String type) {
        this.type = type;
        return this;
    }

    public SubAttribute getAttributes() {
        return attributes;
    }

    public Data setAttributes(SubAttribute attributes) {
        this.attributes = attributes;
        return this;
    }

    public SubRelationship getRelationships() {
        return relationships;
    }

    public Data setRelationships(SubRelationship relationships) {
        this.relationships = relationships;
        return this;
    }

    public SubLink getLinks() {
        return links;
    }

    public Data setLinks(SubLink links) {
        this.links = links;
        return this;
    }
}
