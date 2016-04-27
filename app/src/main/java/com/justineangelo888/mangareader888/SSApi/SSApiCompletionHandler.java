package com.justineangelo888.mangareader888.SSApi;

import com.justineangelo888.mangareader888.SSApi.Models.Response.Error;

/**
 * Created by justine on 26/04/16.
 */
public interface SSApiCompletionHandler<T> {
    public void success(T response);
    public void failed(Error error);
}
