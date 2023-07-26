package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findUserById(Long id);

    List<User> users();

    User createUser(User user);

    User updateUser(User user, Long id);

    User deleteUser(User user);

}
