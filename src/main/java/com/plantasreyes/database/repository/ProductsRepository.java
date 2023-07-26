package com.plantasreyes.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plantasreyes.database.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{

}
