package com.example.tutorial1_mavin.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class responseHandler {
    public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpstatus, Object responseObject){
        Map<String,Object> response=new HashMap<>();
        response.put("message",message);
        response.put("HttpStatus",httpstatus);
        response.put("data",responseObject);

        return new ResponseEntity<>(response,httpstatus);

    }
}
