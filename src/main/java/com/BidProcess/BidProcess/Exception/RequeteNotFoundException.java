package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RequeteNotFoundException extends RuntimeException {


    private static final String REQUETE_NON_TROUVEE = "Requete non trouvée";
    private static final String REQUETE_SUPPRIMEE = "Votre Requete a été supprimée";

    public RequeteNotFoundException(String message) {
        super(message);
    }

    public static RequeteNotFoundException requeteNotFound() {
        return new RequeteNotFoundException(REQUETE_NON_TROUVEE);
    }

    public static RequeteNotFoundException utilisateurSupprimee() {
        return new RequeteNotFoundException(REQUETE_SUPPRIMEE);
    }

}
