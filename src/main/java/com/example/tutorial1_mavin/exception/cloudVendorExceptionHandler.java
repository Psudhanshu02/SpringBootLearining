package com.example.tutorial1_mavin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class cloudVendorExceptionHandler {

    @ExceptionHandler(value= {vendorNotFoundException.class})
    public ResponseEntity<Object> handleVendorNotFoundException(vendorNotFoundException vendorNotFound){

        cloudVendorException cloudVendorException= new cloudVendorException(
                vendorNotFound.getMessage(),
                vendorNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorException,HttpStatus.NOT_FOUND);

    }
}
