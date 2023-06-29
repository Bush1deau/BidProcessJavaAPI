package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {


    Optional<ProductCategory> findById(Long id);

}