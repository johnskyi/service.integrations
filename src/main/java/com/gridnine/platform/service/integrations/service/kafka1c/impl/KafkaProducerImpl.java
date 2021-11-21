package com.gridnine.platform.service.integrations.service.kafka1c.impl;

import com.gridnine.platform.service.integrations.model.kafka1c.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducerImpl {

    private final static String TOPIC = "my_topik";

    private final KafkaTemplate<String,String> kafkaTemplate;
    private final ParseJsonImpl parseJson;

    public Response writeMessage(JSONObject jsonObject) {

        kafkaTemplate.send(TOPIC, parseJson.getString(jsonObject));
        return Response.builder()
                .message("ok")
                .description("Sended in topic" + TOPIC)
                .timestamp(System.currentTimeMillis())
                .build();
    }

}
