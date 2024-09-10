package com.bwgjoseph.error_handling_spring_boot_openapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bwgjoseph.error_handling_spring_boot_openapi.Error;

@ControllerAdvice(basePackages = "com.bwgjoseph.error_handling_spring_boot_openapi.profile")
public class MyExceptionHandler {
    @ExceptionHandler(MyBusinessException.class)
    // this must be added in order for springdoc-openapi to automatically generate the response
    @ResponseStatus(HttpStatus.PAYLOAD_TOO_LARGE)
    public Error handle() {
        return new Error("1234", "null");
    }
}
