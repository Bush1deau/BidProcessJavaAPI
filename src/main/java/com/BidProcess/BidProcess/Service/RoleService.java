package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Optional<Role> findRoleById(Long id);

    List<Role> roles();


}
