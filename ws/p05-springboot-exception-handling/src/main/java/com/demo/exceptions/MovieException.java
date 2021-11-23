package com.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus(code = HttpStatus.OK)
public class MovieException extends Exception {
    public MovieException(){}
    public MovieException(String m){
        super(m);
    }
    public MovieException(Exception e){
        super(e);
    }
    public MovieException(String m, Exception e){
        super(m, e);
    }
}