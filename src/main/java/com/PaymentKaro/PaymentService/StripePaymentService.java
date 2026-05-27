package com.PaymentKaro.PaymentService;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue = "stripe")
public class StripePaymentService implements PaymentService {
   @Override
    public String pay(){
        String payment="stripePayment ";
        System.out.println("payment service are from:" + payment);
        return payment;
    }

}
