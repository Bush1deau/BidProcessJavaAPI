package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.Requete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RequeteRepository extends JpaRepository<Requete ,Long> {


    Optional<Requete> findById(Long id);

}