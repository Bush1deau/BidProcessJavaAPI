package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.RoleNotFoundException;
import com.BidProcess.BidProcess.Exception.UserNotFoundException;
import com.BidProcess.BidProcess.Model.Role;
import com.BidProcess.BidProcess.Model.User;
import com.BidProcess.BidProcess.Repository.RoleRepository;
import com.BidProcess.BidProcess.Repository.UserRepository;
import com.BidProcess.BidProcess.Service.RoleService;
import com.BidProcess.BidProcess.Service.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<Role> findRoleById(Long id) {
        final Optional<Role> optionalRole = this.roleRepository.findById(id);

        if (optionalRole.isPresent()) {
            final Role role = optionalRole.get();
            return roleRepository.findById(id);
        } else {
            throw RoleNotFoundException.roleNotFound();
        }
    }

    @Override
    public List<Role> roles() {
        return roleRepository.findAll();
    }


}
