package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {


    Optional<Role> findById(Long id);

}