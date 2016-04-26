package com.justineangelo888.mangareader888.SSApi.Models.Main;

/**
 * Created by justine on 21/04/16.
 */
public class Link {
    private String self;
    private String first;
    private String next;
    private String last;
    private String related;

    public static Link init() {
        return new Link();
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }
}
