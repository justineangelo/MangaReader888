package com.justineangelo888.mangareader888.SSApi.Models.Request;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;

/**
 * Created by androidshelf2 on 26/04/2016.
 */
public class ForgotPasswordRequest {
    public Data data;
    public static ForgotPasswordRequest init() {
        ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest();
        forgotPasswordRequest.data = Data.init();
        forgotPasswordRequest.data.setType("forgot_password");
        return forgotPasswordRequest;
    }
}
