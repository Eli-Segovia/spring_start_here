package com.segovia.tutorials.rest_apis.a3_advice_exception_handling.controllers;

import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.beans.PaymentDetails;
import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.exception.ErrorDetails;
import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.exception.NotEnoughMoneyException;
import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(
            @RequestBody PaymentDetails paymentDetails
    ) throws Exception {

        logger.info("Received payment: {" + paymentDetails.getAmountOwed() + "}");

        PaymentDetails pd = paymentService.processPayment(paymentDetails);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(pd);
    }
}
