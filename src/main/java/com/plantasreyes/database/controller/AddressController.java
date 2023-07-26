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
import com.plantasreyes.database.service.AddressService;

@RequestMapping(path = "/database/address")
@RestController

public class AddressController {
	@Autowired
	private final AddressService addressService;
	
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	//GetAll
	@GetMapping
	public List<Address> getAllAddress(){
		return addressService.getAllAddress();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public Address getAddressById(@PathVariable Long id) {
		return addressService.getAddressById(id);
	}
	
	//Post
	@PostMapping
	public Address createaddress (@RequestBody Address address) {
		return addressService.createAddress(address);
	}
	
	//Put
	@PutMapping
	public Address updateaddress(@RequestBody Address address) {
		return addressService.updateAddress(address);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteAddress(@PathVariable Long id) {
		addressService.deleteAddress(id);
	}
}
