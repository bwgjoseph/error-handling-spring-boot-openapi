package com.bwgjoseph.error_handling_spring_boot_openapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PAYLOAD_TOO_LARGE)
public class MyBusinessException extends RuntimeException {
    public MyBusinessException(String message) {
        super(message);
    }
}
