package com.Quiz.Quizapp.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> ExceptionHandler(Exception e) {
        return new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
    }
}
