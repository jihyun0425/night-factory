package org.recorder.nightfactory.controller;

import org.recorder.nightfactory.dto.PortOnePaymentResponse;
import org.recorder.nightfactory.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments/api")
public class PaymentApiController {
    PaymentService paymentService;

    @PostMapping("/complete")
    public ResponseEntity<String> completePayment(@RequestBody PortOnePaymentResponse portOnePaymentResponse) {

        return null;
    }
}