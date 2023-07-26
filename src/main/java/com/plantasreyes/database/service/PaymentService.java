package com.plantasreyes.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantasreyes.database.repository.PaymentRepository;
import com.plantasreyes.database.entity.Payment;


@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository; 
	
	//Get
		public List<Payment> getAllPayments(){
			return paymentRepository.findAll();
		}
	//Get by Id
		public Payment getPaymentId(Long id){
			return paymentRepository.findById(id).orElse(null);
		}
		
		//Post
		public Payment createPayment(Payment payment) {
			return paymentRepository.save(payment);
		}
		
		//put
		public Payment updatePayment(Payment payment) {
			return paymentRepository.save(payment);
		}
		
		//DELETE
		public void deletePayment(Long id) {
			paymentRepository.deleteById(id);
		}
}
