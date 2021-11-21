package com.gridnine.platform.service.integrations.service.kafka1c.impl;

import com.gridnine.platform.service.integrations.service.kafka1c.ParseJsonService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ParseJsonImpl implements ParseJsonService {

    @Override
    public JSONObject getJson(String message) {
        return null;
    }

    @Override
    public String getString(JSONObject jsonObject) {
        return null;
    }
}
