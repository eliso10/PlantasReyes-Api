package com.plantasreyes.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_payment", unique = true, nullable = false)
	private Long id_payment;
	
	@Column(nullable = false)
	private String method;
	
	//Construcctor Vacio para JPA
	public Payment(){
		
	}
	
	@OneToOne(mappedBy = "payment")
	private Users users;
	
	
	public Payment(Long id_payment, String method) {
		super();
		this.id_payment = id_payment;
		this.method = method;
	}

	public long getId_payment() {
		return id_payment;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public void setId_payment(Long id_payment) {
		this.id_payment = id_payment;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Override
	public String toString() {
		return "Payment [id_payment=" + id_payment + ", method=" + method + "]";
	}
	
	
	
}
