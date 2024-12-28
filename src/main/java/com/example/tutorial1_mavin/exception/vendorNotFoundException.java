package com.example.tutorial1_mavin.exception;

public class vendorNotFoundException extends RuntimeException{


    public vendorNotFoundException(String message) {
        super(message);
    }

    public vendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
