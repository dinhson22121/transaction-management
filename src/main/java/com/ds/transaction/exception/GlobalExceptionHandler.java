package com.ds.transaction.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<?>handleRuntimeException(RuntimeException ex, WebRequest request) {
        return ResponseEntity.badRequest().body(ex.getMessage() + request.getContextPath());
    }

}
