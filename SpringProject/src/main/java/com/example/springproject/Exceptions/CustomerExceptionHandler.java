/*package com.example.springproject.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

public class CustomerExceptionHandler {
    @ExceptionHandler(CustomerNotFound.class)
    public final ResponseEntity<Object> handleCustomerNotFound(CustomerNotFound ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND, "Customer Not Found", details);
        return new ResponseEntity(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserNotFound.class)
    public final ResponseEntity<Object> handleUserNotFound(UserNotFound ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND,  "This user doesn't exists!!", details);
        return new ResponseEntity(error, HttpStatus.NOT_FOUND);
    }
}*/