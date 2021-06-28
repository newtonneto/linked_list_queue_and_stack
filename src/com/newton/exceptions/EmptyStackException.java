package com.newton.exceptions;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String error) {
        super(error);
    }
}
