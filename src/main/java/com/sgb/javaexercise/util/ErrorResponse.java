package com.sgb.javaexercise.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Sebastián Gamboa
 */
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {

    private int status;
    private String message;
}