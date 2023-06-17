package com.nabatech.eureka.paymentprovider.api.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/paynow/{price}")
    public String payNow(@PathVariable int price){
        return "Payment With "+price+" is Successful !!";
    }

}
