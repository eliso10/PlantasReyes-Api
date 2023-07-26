package com.plantasreyes.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantasreyes.database.entity.Address;
import com.plantasreyes.database.repository.AddressRepository;

@Service
public class AddressService {
		////////////////////
		@Autowired
		private AddressRepository addressRepository;
		
		
		//Get
		public List<Address> getAllAddress(){
			return (List<Address>) addressRepository.findAll();

		}
		
		//Get by Id
		public Address getAddressById(Long id) {
			return addressRepository.findById(id).orElse(null);
		}
		
		//Post
		public Address createAddress(Address address) {
			return addressRepository.save(address);
		}
		
		// Put
		public Address updateAddress(Address address) {
			return addressRepository.save(address);
		}
		
		//Delete (necesario por id)
		public void deleteAddress(Long id) {
			addressRepository.deleteById(id);
		}
	//////////////////////////////////////////////
	
}
