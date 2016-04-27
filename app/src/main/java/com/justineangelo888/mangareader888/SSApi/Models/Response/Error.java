package com.justineangelo888.mangareader888.SSApi.Models.Response;

/**
 * Created by justine on 27/04/16.
 */
public class Error {
    private Integer code;
    private String description;

    public static Error init() {
        Error error = new Error();
        error.code = 500;
        error.description = "Internal Server Error";
        return error;
    }

    public String toString() {
        return "Code : <" + this.code + "> Description : <" + this.description + ">";
    }

    public Integer getCode() {
        return code;
    }

    public Error setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Error setDescription(String description) {
        this.description = description;
        return this;
    }
}
