package com.visal.learning.PhoneShop.exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@RequiredArgsConstructor
public class ApiException extends RuntimeException{
    final private HttpStatus status;
    final private String message;


}
