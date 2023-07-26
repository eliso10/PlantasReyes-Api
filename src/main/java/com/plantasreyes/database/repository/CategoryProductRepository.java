package com.plantasreyes.database.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plantasreyes.database.entity.CategoryProduct;

@Repository
public interface CategoryProductRepository extends JpaRepository <CategoryProduct,Long> {
 
}
