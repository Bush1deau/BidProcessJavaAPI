package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.User;
import com.BidProcess.BidProcess.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class UserRestController {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Autowired
    private UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping( "utilisateur/{id}" )
    public Optional<User> findUserById(@PathVariable("id") Long id
    ){
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUsers(){
        return userService.users();
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.createUser(user);
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user, @PathVariable("id") @NotNull Long id ){
        return userService.updateUser(user,id);
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.DELETE)
    public User user(@RequestBody User user) {
        return userService.deleteUser(user);
    }

}