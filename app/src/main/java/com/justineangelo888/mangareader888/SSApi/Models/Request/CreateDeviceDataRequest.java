package com.justineangelo888.mangareader888.SSApi.Models.Request;

import com.justineangelo888.mangareader888.SSApi.Models.Main.Data;

/**
 * Created by justine on 26/04/16.
 */
public class CreateDeviceDataRequest {
    public Data data;
    public static CreateDeviceDataRequest init() {
        CreateDeviceDataRequest createDeviceDataRequest = new CreateDeviceDataRequest();
        createDeviceDataRequest.data = Data.init();
        createDeviceDataRequest.data.setType("devices");
        return createDeviceDataRequest;
    }
}
