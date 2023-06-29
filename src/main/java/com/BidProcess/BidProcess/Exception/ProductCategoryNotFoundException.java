package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductCategoryNotFoundException extends RuntimeException {


    private static final String PRODUCTCATEGORY_NON_TROUVEE = "ProductCategory non trouvée";
    private static final String PRODUCTCATEGORY_SUPPRIMEE = "Votre ProductCategory a été supprimée";

    public ProductCategoryNotFoundException(String message) {
        super(message);
    }

    public static ProductCategoryNotFoundException productCategoryNotFound() {
        return new ProductCategoryNotFoundException(PRODUCTCATEGORY_NON_TROUVEE);
    }

    public static ProductCategoryNotFoundException productCategorySupprimee() {
        return new ProductCategoryNotFoundException(PRODUCTCATEGORY_SUPPRIMEE);
    }

}
