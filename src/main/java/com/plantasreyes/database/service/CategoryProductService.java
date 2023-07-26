package com.plantasreyes.database.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantasreyes.database.entity.CategoryProduct;
import com.plantasreyes.database.repository.CategoryProductRepository;

@Service
public class CategoryProductService {
	@Autowired
	private CategoryProductRepository categoryProductRepository;
	
	
	//Get
	public List<CategoryProduct> getAllCategoryProduct(){
		return categoryProductRepository.findAll();

	}
	
	//Get by Id
	public CategoryProduct getCategoryProductById(Long id) {
		return categoryProductRepository.findById(id).orElse(null);
	}
	
	//Post
	public CategoryProduct createCategoryProduct(CategoryProduct category) {
		return categoryProductRepository.save(category);
	}
	
	// Put
	public CategoryProduct updateCategoryProduct(CategoryProduct category) {
		return categoryProductRepository.save(category);
	}
	
	//Delete (necesario por id)
	public void deleteCategoryProduct(Long id) {
		categoryProductRepository.deleteById(id);
	}
	
	
}
