package com.justineangelo888.mangareader888.SSApi.Models.Request;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Meta;
import com.justineangelo888.mangareader888.SSApi.Models.Main.Sub.SubRelationship;



/**
 * Created by justine on 22/04/16.
 */
public class UpdateLeadsSettingsRequest {
    public Data data;
    public static UpdateLeadsSettingsRequest init() {
        UpdateLeadsSettingsRequest updateLeadsSettingsRequest = new UpdateLeadsSettingsRequest();
        updateLeadsSettingsRequest.data = Data.init();
        updateLeadsSettingsRequest.data.setType("job_filters");
        return updateLeadsSettingsRequest;
    }
}
