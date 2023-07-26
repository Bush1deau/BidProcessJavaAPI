package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BidNotFoundException extends RuntimeException {


    private static final String REQUETE_NON_TROUVEE = "Bid non trouvée";
    private static final String REQUETE_SUPPRIMEE = "Votre bid a été supprimée";

    public BidNotFoundException(String message) {
        super(message);
    }

    public static BidNotFoundException bidNotFound() {
        return new BidNotFoundException(REQUETE_NON_TROUVEE);
    }

    public static BidNotFoundException utilisateurSupprimee() {
        return new BidNotFoundException(REQUETE_SUPPRIMEE);
    }

}
