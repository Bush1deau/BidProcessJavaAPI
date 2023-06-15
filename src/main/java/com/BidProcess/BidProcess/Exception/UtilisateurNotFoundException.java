package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UtilisateurNotFoundException extends RuntimeException {


    private static final String UTILISATEUR_NON_TROUVEE = "Utilisateur non trouvée";
    private static final String UTILISATEUR_SUPPRIMEE = "Votre Utilisateur a été supprimée";

    public UtilisateurNotFoundException(String message) {
        super(message);
    }

    public static UtilisateurNotFoundException utilisateurNotFound() {
        return new UtilisateurNotFoundException(UTILISATEUR_NON_TROUVEE);
    }

    public static UtilisateurNotFoundException utilisateurSupprimee() {
        return new UtilisateurNotFoundException(UTILISATEUR_SUPPRIMEE);
    }

}
