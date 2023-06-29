package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.ProductCategory;
import com.BidProcess.BidProcess.Model.Utilisateur;
import com.BidProcess.BidProcess.Service.ProductCategoryService;
import com.BidProcess.BidProcess.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductCategoryRestController {

    @Autowired
    private ProductCategoryService productCategoryService;

    public ProductCategoryRestController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @GetMapping( "productCategory/{id}" )
    public Optional<ProductCategory> findProductCategoryById(@PathVariable("id") Long id
    ){
        return productCategoryService.findProductCategoryById(id);
    }

    @RequestMapping(value = "/productCategories", method = RequestMethod.GET)
    public List<ProductCategory> listProductCategories(){
        return productCategoryService.productCategories();
    }

    @RequestMapping(value = "/productCategory/create", method = RequestMethod.POST)
    public ProductCategory createProductCategory(@RequestBody ProductCategory productCategory){
        return productCategoryService.createProductCategory(productCategory);
    }
    @RequestMapping(value = "/productCategory/{id}", method = RequestMethod.PUT)
    public ProductCategory updateProductCategory(@RequestBody ProductCategory productCategory , @PathVariable("id") @NotNull Long id ){
        return productCategoryService.updateProductCategory(productCategory,id);
    }

    @RequestMapping(value = "/productCategory/delete", method = RequestMethod.DELETE)
    public ProductCategory productCategory(@RequestBody ProductCategory productCategory) {
        return productCategoryService.deleteProductCategory(productCategory);
    }

}