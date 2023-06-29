package com.BidProcess.BidProcess.Utils;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptedPasswordUtils {
    @Bean
    public static String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static Boolean decryptePassword(String password, String passwordDataBase){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Boolean isPasswodMatches = encoder.matches(passwordDataBase, password);
        return isPasswodMatches;
    }
}
