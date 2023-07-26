package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredentialRepository extends JpaRepository<Credential,Long> {


    Optional<Credential> findById(Long id);

}