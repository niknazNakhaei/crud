package com.nakhaei.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice

@Slf4j
public class RestExceptionHandling {

    @ExceptionHandler({BadRequestException.class})
    protected ResponseEntity<Object> badRequest(BadRequestException ex, HttpServletRequest request){
        log.error("Error happened : " +ex.getLocalizedMessage());
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST,ex));
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }



}
