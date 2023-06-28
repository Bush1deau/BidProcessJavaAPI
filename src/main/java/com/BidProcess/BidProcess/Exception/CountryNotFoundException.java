package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends RuntimeException {


    private static final String COUNTRY_NON_TROUVEE = "Country non trouvée";
    private static final String COUNTRY_SUPPRIMEE = "Votre Country a été supprimée";

    public CountryNotFoundException(String message) {
        super(message);
    }

    public static CountryNotFoundException countryNotFound() {
        return new CountryNotFoundException(COUNTRY_NON_TROUVEE);
    }

    public static CountryNotFoundException countrySupprimee() {
        return new CountryNotFoundException(COUNTRY_SUPPRIMEE);
    }

}
