package com.example.springproject.Exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFound extends RuntimeException{
    private String msg="This customer doesn't exist";

}
