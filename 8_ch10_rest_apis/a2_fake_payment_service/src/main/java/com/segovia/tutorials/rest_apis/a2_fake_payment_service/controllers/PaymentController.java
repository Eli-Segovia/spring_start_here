package com.segovia.tutorials.rest_apis.a2_fake_payment_service.controllers;

import com.segovia.tutorials.rest_apis.a2_fake_payment_service.exceptions.ErrorDetails;
import com.segovia.tutorials.rest_apis.a2_fake_payment_service.exceptions.NotEnoughMoneyException;
import com.segovia.tutorials.rest_apis.a2_fake_payment_service.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try{
            paymentService.processPayment();
        } catch (NotEnoughMoneyException e) {
            ErrorDetails details = new ErrorDetails();
            details.setMessage("Not enough Money");
            return ResponseEntity
                    .badRequest()
                    .body(details);
        }
        return null;
    }
}
