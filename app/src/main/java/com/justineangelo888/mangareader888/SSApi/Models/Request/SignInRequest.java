package com.justineangelo888.mangareader888.SSApi.Models.Request;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;

/**
 * Created by justine on 22/04/16.
 */
public class SignInRequest  {
    public Data data;
    public Meta meta;
    public static SignInRequest init() {
        SignInRequest signInRequest = new SignInRequest();
        signInRequest.data = Data.init();
        signInRequest.data.setType("user_sessions");
        signInRequest.meta = Meta.init();
        return signInRequest;
    }
}
