package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TCPartsCountryBidProductCategoryNotFoundException extends RuntimeException {

    private static final String TCPARTSCOUNTRYBIDPRODUCTCATEGORY_NOT_FOUND = "TCPartsCountryBidProductCategory not found";
    private static final String TCPARTSCOUNTRYBIDPRODUCTCATEGORY_DELETED = "Your tCPartsCountryBidProductCategory is deleted";

    public TCPartsCountryBidProductCategoryNotFoundException(String message) {
        super(message);
    }

    public static TCPartsCountryBidProductCategoryNotFoundException tCPartsCountryBidProductCategoryNotFound() {
        return new TCPartsCountryBidProductCategoryNotFoundException(TCPARTSCOUNTRYBIDPRODUCTCATEGORY_NOT_FOUND);
    }

    public static TCPartsCountryBidProductCategoryNotFoundException tCPartsCountryBidProductCategorySupprimee() {
        return new TCPartsCountryBidProductCategoryNotFoundException(TCPARTSCOUNTRYBIDPRODUCTCATEGORY_DELETED);
    }


}
