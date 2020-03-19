package com.sgb.javaexercise.controller.advice;

import com.sgb.javaexercise.util.ErrorResponse;
import com.sgb.javaexercise.exception.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Sebastián Gamboa
 */
@RestControllerAdvice
public class ResourceNotFoundAdvice {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ErrorResponse resourceNotFoundHandler(ResourceNotFoundException ex) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
}