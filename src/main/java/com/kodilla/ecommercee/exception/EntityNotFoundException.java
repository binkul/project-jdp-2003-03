package com.kodilla.ecommercee.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(ExceptionType type, String value) {
        super(String.format(type.getMessage(), value));
    }
}
