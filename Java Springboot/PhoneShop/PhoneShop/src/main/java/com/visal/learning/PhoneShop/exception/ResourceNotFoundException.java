package com.visal.learning.PhoneShop.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiException{
    public ResourceNotFoundException(String source , Integer id) {
        super(HttpStatus.NOT_FOUND, "%s with id = %d is not found".formatted(source , id));
    }
}
