package com.demo.controllers;

import java.time.LocalDateTime;

import com.demo.exceptions.MovieException;
import com.demo.models.MyErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(MovieException.class)
    public ResponseEntity<MyErrorResponse> handleMovieException(MovieException e){
        System.out.println("error message");
        return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(e.getMessage(), 500, LocalDateTime.now(), e), HttpStatus.OK);
    }


}