package com.gridnine.platform.service.integrations.service.kafka1c;
import org.json.JSONObject;

public interface ParseJsonService {

    JSONObject getJson(String message);
    String getString(JSONObject jsonObject);

}
