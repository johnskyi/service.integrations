package com.gridnine.platform.service.integrations.service.kafka1c.impl;

import com.gridnine.platform.service.integrations.exeption.MessageNotFoundExeption;
import com.gridnine.platform.service.integrations.model.kafka1c.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumerImpl {

    private final ParseJsonImpl parseJson;

    @KafkaListener(topics = "my_topic", groupId = "my_group_id")
    public Response getMessage(String message) {
        if(message == null) {
            throw new MessageNotFoundExeption("Message not found");
        }
        JSONObject jsonResponse = parseJson.getJson(message);
       return Response.builder()
               .message("ok")
               .timestamp(System.currentTimeMillis())
               .jsonResponse(jsonResponse)
               .build();
    }
}
