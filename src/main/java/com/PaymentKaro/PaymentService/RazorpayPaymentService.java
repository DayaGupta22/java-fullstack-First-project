package com.PaymentKaro.PaymentService;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider", havingValue = "razorpay") // this is dynamic call the payement service which payment service wil call
// and the pyement service are maianged by payement.provideer on applipcation .proporties file
public class RazorpayPaymentService implements PaymentService {
    @Override
    public String pay () {
        String payment = "RazorPay Payment";
        System.out.println("Payament From: "+ payment);
        return payment;
    }

}
