package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.ProductCategoryNotFoundException;
import com.BidProcess.BidProcess.Model.ProductCategory;
import com.BidProcess.BidProcess.Repository.ProductCategoryRepository;
import com.BidProcess.BidProcess.Service.ProductCategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public Optional<ProductCategory> findProductCategoryById(Long id) {
        final Optional<ProductCategory> optionalProductCategory = this.productCategoryRepository.findById(id);

        if (optionalProductCategory.isPresent()) {
            final ProductCategory productCategory = optionalProductCategory.get();
            return productCategoryRepository.findById(id);
        } else {
            throw ProductCategoryNotFoundException.productCategoryNotFound();
        }
    }

    @Override
    public List<ProductCategory> productCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
        productCategoryRepository.save(productCategory);
        return productCategory;
    }
    @Override
    public ProductCategory updateProductCategory(ProductCategory productCategory, Long id) {
        productCategory.setId(id);
        return  productCategoryRepository.save(productCategory);
    }

    @Transactional
    public ProductCategory deleteProductCategory(ProductCategory productCategory) {
        productCategoryRepository.delete(productCategory);
        return productCategory;
    }

}
