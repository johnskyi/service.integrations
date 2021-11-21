package com.gridnine.platform.service.integrations.controller;

import com.gridnine.platform.service.integrations.exeption.MessageNotFoundExeption;
import com.gridnine.platform.service.integrations.model.kafka1c.Response;
import org.springframework.http.ResponseEntity;

public interface AdviceController {

    ResponseEntity<Response> messageNotFoundExceptionHandler(MessageNotFoundExeption exception);
}
