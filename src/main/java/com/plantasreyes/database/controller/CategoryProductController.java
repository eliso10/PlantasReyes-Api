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
import com.plantasreyes.database.entity.CategoryProduct;
import com.plantasreyes.database.service.CategoryProductService;

@RequestMapping(path = "/database/category")
@RestController //ApiRESTfull
public class CategoryProductController{

	@Autowired
	private final CategoryProductService categoryProductService;
	
	public CategoryProductController(CategoryProductService categoryProductService) {
		this.categoryProductService = categoryProductService;
	}
	
	//GetAll
	@GetMapping
	public List<CategoryProduct> getAllCategoryProduct(){
		return categoryProductService.getAllCategoryProduct();
	}
	
	//Get individual
	@GetMapping("/{id}")
	public CategoryProduct getCategoryProductById(@PathVariable Long id) {
		return categoryProductService.getCategoryProductById(id);
	}
	
	//Post
	@PostMapping
	public CategoryProduct createCategoryProduct (@RequestBody CategoryProduct categoryProduct) {
		return categoryProductService.createCategoryProduct(categoryProduct);
	}
	
	//Put
	@PutMapping
	public CategoryProduct updateCategoryProduct(@RequestBody CategoryProduct categoryProduct) {
		return categoryProductService.updateCategoryProduct(categoryProduct);
	}
	
	
	//Delete
	@DeleteMapping("/{id}")
	public void deleteCategoryProduct(@PathVariable Long id) {
		categoryProductService.deleteCategoryProduct(id);
	}
}