package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TCPartsNotFoundException extends RuntimeException {


    private static final String TCPARTS_NON_TROUVEE = "TCParts non trouvée";
    private static final String TCPARTS_SUPPRIMEE = "Votre TCParts a été supprimée";

    public TCPartsNotFoundException(String message) {
        super(message);
    }

    public static TCPartsNotFoundException tCPartsNotFound() {
        return new TCPartsNotFoundException(TCPARTS_NON_TROUVEE);
    }

    public static TCPartsNotFoundException tCPartsSupprimee() {
        return new TCPartsNotFoundException(TCPARTS_SUPPRIMEE);
    }

}
