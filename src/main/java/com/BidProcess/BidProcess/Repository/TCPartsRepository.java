package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.TCParts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TCPartsRepository extends JpaRepository<TCParts,Long> {


    Optional<TCParts> findById(Long id);

}