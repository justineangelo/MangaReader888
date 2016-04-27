package com.justineangelo888.mangareader888.SSApi.Models.Request;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;


/**
 * Created by justine on 22/04/16.
 */
public class UpdateJobFilterRequest {
    public Data data;
    public static UpdateJobFilterRequest init() {
        UpdateJobFilterRequest updateJobFilterRequest = new UpdateJobFilterRequest();
        updateJobFilterRequest.data = Data.init();
        updateJobFilterRequest.data.setType("job_filters");
        return updateJobFilterRequest;
    }
}
