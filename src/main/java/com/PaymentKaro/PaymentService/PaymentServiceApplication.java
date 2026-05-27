package com.PaymentKaro.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentServiceApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(PaymentServiceApplication.class, args);
//     RazorpayPaymentService paymentService = new RazorpayPaymentService(); // this is the tightly couple with razorpay service object
//       String Payment= paymentService.pay();
//       System.out.println("payment done :"+Payment);
	}

//    @Autowired
//    private PaymentService paymentService2;

    private PaymentService paymentService1;
   public  PaymentServiceApplication(PaymentService paymentService1) {
       this.paymentService1= paymentService1;
   }
    @Override
    public void run(String... args) throws Exception {
        String Payment= paymentService1.pay();
//        String payment1 = paymentService2.pay();
        System.out.println("payment done :"+Payment);
        System.out.println("payment 1 :"+Payment);
    }

}
