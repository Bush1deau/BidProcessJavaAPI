package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {


    private static final String UTILISATEUR_NON_TROUVEE = "User non trouvée";
    private static final String UTILISATEUR_SUPPRIMEE = "Votre user a été supprimée";

    public UserNotFoundException(String message) {
        super(message);
    }

    public static UserNotFoundException userNotFound() {
        return new UserNotFoundException(UTILISATEUR_NON_TROUVEE);
    }

    public static UserNotFoundException userSupprimee() {
        return new UserNotFoundException(UTILISATEUR_SUPPRIMEE);
    }

}
