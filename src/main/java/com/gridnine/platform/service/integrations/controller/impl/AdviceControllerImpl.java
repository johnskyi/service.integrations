package com.gridnine.platform.service.integrations.controller.impl;

import com.gridnine.platform.service.integrations.controller.AdviceController;
import com.gridnine.platform.service.integrations.exeption.MessageNotFoundExeption;
import com.gridnine.platform.service.integrations.model.kafka1c.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdviceControllerImpl implements AdviceController {

    @Override
    @ExceptionHandler(MessageNotFoundExeption.class)
    public ResponseEntity<Response> messageNotFoundExceptionHandler(MessageNotFoundExeption exception) {
        return new ResponseEntity<Response>(Response.builder().error("error").errorDescription(exception.getMessage()).build(),
                HttpStatus.BAD_REQUEST);
    }
}
