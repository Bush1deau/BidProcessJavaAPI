package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CredentialNotFoundException extends RuntimeException {


    private static final String REQUETE_NON_TROUVEE = "Credential non trouvée";
    private static final String REQUETE_SUPPRIMEE = "Votre credential a été supprimée";

    public CredentialNotFoundException(String message) {
        super(message);
    }

    public static CredentialNotFoundException credentialNotFound() {
        return new CredentialNotFoundException(REQUETE_NON_TROUVEE);
    }

    public static CredentialNotFoundException credentialSupprimee() {
        return new CredentialNotFoundException(REQUETE_SUPPRIMEE);
    }

}
