package com.justineangelo888.mangareader888.SSApi;

/**
 * Created by justine on 26/04/16.
 */
public interface SSApiCompletionHandler<T> {
    public void success(T responseModel);
    public void failed();
}
