package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Role;
import com.BidProcess.BidProcess.Model.User;
import com.BidProcess.BidProcess.Service.RoleService;
import com.BidProcess.BidProcess.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RoleRestController {

    @Autowired
    private RoleService roleService;

    public RoleRestController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping( "role/{id}" )
    public Optional<Role> findRoleById(@PathVariable("id") Long id
    ){
        return roleService.findRoleById(id);
    }

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> listRoles(){
        return roleService.roles();
    }

}