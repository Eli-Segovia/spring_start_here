package com.segovia.tutorials.rest_apis.a3_advice_exception_handling.advices;

import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.exception.ErrorDetails;
import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.exception.NotEnoughMoneyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    // takes the Exception to intercept. Whenever it is thrown,
    // this advice/interceptor gets called instead of the normal flow.
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough fucking money, bro");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
