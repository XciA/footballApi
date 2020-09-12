package com.sapienttest.springboot.utils;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;

@Component
public class ErrorHandlerUtil {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public final String exceptionHandlerIllegalArgumentException(final IllegalArgumentException e) {
        return '"' + e.getMessage() + '"';
    }
    @ExceptionHandler(InterruptedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public final String exceptionHandlerInterruptedException(final InterruptedException e) {
        return '"' + "Process Interrupted" + '"';
    }
    @ExceptionHandler(RestClientException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public final String exceptionHandlerInterruptedException(final RestClientException e) {
        return '"' + "Internal Error" + '"';
    }
}
