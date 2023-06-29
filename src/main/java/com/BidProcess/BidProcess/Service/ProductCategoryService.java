package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ProductCategoryService {
    Optional<ProductCategory> findProductCategoryById(Long id);

    List<ProductCategory> productCategories();

    ProductCategory createProductCategory(ProductCategory productCategory);

    ProductCategory updateProductCategory(ProductCategory productCategory , Long id);

    ProductCategory deleteProductCategory(ProductCategory productCategory);

}
