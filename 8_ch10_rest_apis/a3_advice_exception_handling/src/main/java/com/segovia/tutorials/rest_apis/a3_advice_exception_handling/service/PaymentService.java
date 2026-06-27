package com.segovia.tutorials.rest_apis.a3_advice_exception_handling.service;

import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.beans.PaymentDetails;
import com.segovia.tutorials.rest_apis.a3_advice_exception_handling.exception.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment (PaymentDetails paymentDetails) throws NotEnoughMoneyException {
        if (paymentDetails.getAmountOwed() < 1000) {
            throw new NotEnoughMoneyException();    // always throwing the exception to demonstrate how handle exceptions
        } else {                                    // in the controller.
            PaymentDetails pd = new PaymentDetails();
            pd.setAmountOwed(0);
            return pd;
        }
    }
}

