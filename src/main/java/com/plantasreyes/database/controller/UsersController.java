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

import com.plantasreyes.database.entity.Address;
import com.plantasreyes.database.entity.Payment;
import com.plantasreyes.database.entity.Users;
import com.plantasreyes.database.service.AddressService;
import com.plantasreyes.database.service.PaymentService;
import com.plantasreyes.database.service.UsersService;
@RequestMapping(path="/database/users")
@RestController

public class UsersController{

	@Autowired
	private UsersService usersService;
	private PaymentService paymentService;
	private AddressService addressService;
	
	public UsersController(UsersService usersService, PaymentService paymentService, AddressService addressService) {
		this.usersService = usersService;
		this.paymentService = paymentService;
		this.addressService = addressService;
	}
	
	//GetAll
	@GetMapping
	public List<Users> getAllUsers(){
		return usersService.getAllUsers();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public Users getUsersById(@PathVariable Long id) {
		return usersService.getUsersById(id);
	}
	/*
	//Post
	@PostMapping
	public Users createUsers(@RequestBody Users users) {
		return usersService.createUsers(users);
	}
	*/
	@PostMapping
	public Users createUser(@RequestBody Users user) {

		// get genre from the database and make a match
	
		Payment persistentPayment = paymentService.getPaymentId(user.getPayment().getId_payment());
		user.setPayment(persistentPayment);
	/*	
		Address persistentAddress = addressService.getAddressById(user.getAddress().getId());
		user.setAddress(persistentAddress);
		
		// CategoryProducts is the same as genre, but for a list
		List<CategoryProduct> persistentCategoryProducts = new ArrayList<>();
		// Add to the list each author found by their ID
		for(CategoryProduct author: user.getCategoryProducts()) {
			CategoryProduct persistentCategoryProduct = authorService.getCategoryProductId(author.getCategoryProduct_id());
			persistentCategoryProducts.add(persistentCategoryProduct);

		}*/
		return usersService.createUsers(user);

	}
	
	//Put
	@PutMapping
	public Users updateUsers(@RequestBody Users users) {
		return usersService.updateUsers(users);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteUsers(@PathVariable Long id) {
		usersService.deleteUsers(id);
	}
}
