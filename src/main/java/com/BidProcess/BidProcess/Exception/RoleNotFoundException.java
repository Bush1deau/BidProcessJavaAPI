package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RoleNotFoundException extends RuntimeException {


    private static final String UTILISATEUR_NON_TROUVEE = "Role non trouvée";
    private static final String UTILISATEUR_SUPPRIMEE = "Votre role a été supprimée";

    public RoleNotFoundException(String message) {
        super(message);
    }

    public static RoleNotFoundException roleNotFound() {
        return new RoleNotFoundException(UTILISATEUR_NON_TROUVEE);
    }

    public static RoleNotFoundException roleSupprimee() {
        return new RoleNotFoundException(UTILISATEUR_SUPPRIMEE);
    }

}
