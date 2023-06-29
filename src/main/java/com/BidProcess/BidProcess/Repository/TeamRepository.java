package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team ,Long> {


    Optional<Team> findById(Long id);

}