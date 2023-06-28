package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.Country;
import com.BidProcess.BidProcess.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country ,Long> {


    Optional<Country> findById(Long id);

}