package com.BidProcess.BidProcess.Utils;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Credential {
    String email;
    String password;

    @Override
    public String toString() {
        return "Credential{" +
                "email='" + email + '\'' +
        ", password='" + password + '\'' +
        '}';
    }
}
