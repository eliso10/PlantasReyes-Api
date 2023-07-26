package com.plantasreyes.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.plantasreyes.database.entity.Products;
import com.plantasreyes.database.repository.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;
	
	
	//Get
	public List<Products> getAllProducts(){
		return productsRepository.findAll();

	}
	
	//Get by Id
	public Products getProductsById(Long id) {
		return productsRepository.findById(id).orElse(null);
	}
	
	//Post
	public Products createProducts(Products products) {
		return productsRepository.save(products);
	}
	
	// Put
	public Products updateProducts(Products products) {
		return productsRepository.save(products);
	}
	
	//Delete (necesario por id)
	public void deleteProducts(Long id) {
		productsRepository.deleteById(id);
	}
	
	
}
