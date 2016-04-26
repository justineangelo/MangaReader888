package com.justineangelo888.mangareader888.SSApi.Models.Main;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Sub.SubError;

import java.util.List;

/**
 * Created by justine on 26/04/16.
 */
public class Error {
    private List<SubError> errors;
    public List<SubError> getErrors() {
        return errors;
    }
}
