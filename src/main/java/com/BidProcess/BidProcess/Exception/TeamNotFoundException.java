package com.BidProcess.BidProcess.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TeamNotFoundException extends RuntimeException {


    private static final String TEAM_NON_TROUVEE = "Team non trouvée";
    private static final String TEAM_SUPPRIMEE = "Votre Team a été supprimée";

    public TeamNotFoundException(String message) {
        super(message);
    }

    public static TeamNotFoundException teamNotFound() {
        return new TeamNotFoundException(TEAM_NON_TROUVEE);
    }

    public static TeamNotFoundException teamSupprimee() {
        return new TeamNotFoundException(TEAM_SUPPRIMEE);
    }

}
