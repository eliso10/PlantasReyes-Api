package com.plantasreyes.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.plantasreyes.database.entity.Payment;
import com.plantasreyes.database.service.PaymentService;


@RequestMapping(path ="/database/payment")
@RestController
public class PaymentController {
	
		@Autowired
		private final PaymentService PaymentService; 
		
		public PaymentController(PaymentService paymentService) {
			this.PaymentService = paymentService; 
		}
		
		@GetMapping
		public List<Payment> getPayments(){
			return PaymentService.getAllPayments();
		}
		
		@GetMapping("/(id)")
		public Payment getPaymentById(@PathVariable Long id) {
			return PaymentService.getPaymentId(id);
		}
		
		@PostMapping
		public Payment createPayment(@RequestBody Payment payment) {
			return PaymentService.createPayment(payment);
		}
		
		@PutMapping
		public Payment updatePayment(@RequestBody Payment payment) {
			return PaymentService.updatePayment(payment);
		}
		
		//Delete mapping
		@DeleteMapping("/(id)")
		public void deletePayment(@PathVariable Long id) {
			PaymentService.deletePayment(id);
		}
}
