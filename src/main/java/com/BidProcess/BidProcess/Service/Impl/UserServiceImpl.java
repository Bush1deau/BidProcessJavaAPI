package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.UserNotFoundException;
import com.BidProcess.BidProcess.Service.UserService;
import com.BidProcess.BidProcess.Model.User;
import com.BidProcess.BidProcess.Repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findUserById(Long id) {
        final Optional<User> optionalUser = this.userRepository.findById(id);

        if (optionalUser.isPresent()) {
            final User user = optionalUser.get();
            return userRepository.findById(id);
        } else {
            throw UserNotFoundException.userNotFound();
        }
    }

    @Override
    public List<User> users() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }
    @Override
    public User updateUser(User user, Long id) {
        user.setId(id);
        return  userRepository.save(user);
    }

    @Transactional
    public User deleteUser(User user) {
        userRepository.delete(user);
        return user;
    }

    @Override
    public User findUtilisateurByEmail(String email){
        return userRepository.findUtilisateurByEmail(email);
    }

}
