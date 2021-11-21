package com.gridnine.platform.service.integrations.controller.kafka1c;

import com.gridnine.platform.service.integrations.model.kafka1c.Response;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface KafkaController {

    /**Listen message from topic.*/
    @GetMapping("/listen")
    ResponseEntity<Response> getOrder(@RequestParam("message") String message);

    /**Publish  message.*/
    @PostMapping("/publish")
    ResponseEntity<Response> postOrder(@RequestBody JSONObject jsonObject);

}
