package com.gridnine.platform.service.integrations.controller.kafka1c.impl;

import com.gridnine.platform.service.integrations.controller.kafka1c.KafkaController;
import com.gridnine.platform.service.integrations.model.kafka1c.Response;
import com.gridnine.platform.service.integrations.service.kafka1c.impl.KafkaConsumerImpl;
import com.gridnine.platform.service.integrations.service.kafka1c.impl.KafkaProducerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Kafka base controller")
@RequiredArgsConstructor
@Slf4j
public class KafkaControllerImpl implements KafkaController {

    private final KafkaProducerImpl kafkaProducer;
    private final KafkaConsumerImpl kafkaConsumer;

    @Override
    @ApiOperation(value="Get message")
    public ResponseEntity<Response> getOrder(String message) {
        log.info("Get message from My_Topic");
        return ResponseEntity.ok(kafkaConsumer.getMessage(message));
    }

    @Override
    @ApiOperation(value="Publish message")
    public ResponseEntity<Response> postOrder(JSONObject jsonObject) {
        log.info("Publish message in topic My_Topic");
        return ResponseEntity.ok(kafkaProducer.writeMessage(jsonObject));
    }
}
