package com.plantasreyes.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Products")
public class Products {
	//Attributes
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Products", unique = true, nullable = false)
	private Long id_Products;
	
	@Column(nullable = false)
	private String product_name;
	
	@Column(nullable = false)
	private String url;
	
	@Column(nullable = false)
	private String description;
	
	
	//constructores
	//para el JPA
	public Products() {
		
	}
	
	//Automaticos eliminamos
	
	//Definir relaciones
	@OneToOne
	@JoinColumn(name = "Category_id_category", nullable = false)
	private CategoryProduct categoryProduct;
	
	public CategoryProduct getCategoryProduct() {
		return categoryProduct;
	}

	public void setCategoryProduct(CategoryProduct categoryProduct) {
		this.categoryProduct = categoryProduct;
	}

	//getters y setters
	public Long getId_products() {
		return id_Products;
	}

	public void setId_products(Long id_products) {
		this.id_Products = id_products;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Products [id_products=" + id_Products + ", product_name=" + product_name + ", url=" + url
				+ ", description=" + description + "]";
	}
	
	
	
}
