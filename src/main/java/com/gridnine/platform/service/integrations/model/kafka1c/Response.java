package com.gridnine.platform.service.integrations.model.kafka1c;

import lombok.Builder;
import lombok.Data;
import org.json.JSONObject;

@Data
@Builder
public class Response {

    String message;
    String error;
    String errorDescription;
    String description;
    JSONObject jsonResponse;
    Long timestamp;
}