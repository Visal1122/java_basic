package com.visal.learning.PhoneShop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ApiExceptionDTO {
    private HttpStatus status;
    private String message;
}
