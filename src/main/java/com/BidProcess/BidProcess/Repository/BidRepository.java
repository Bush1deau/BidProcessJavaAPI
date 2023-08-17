package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BidRepository extends JpaRepository<Bid ,Long> {


    Optional<Bid> findById(Long id);
    List<Bid> findBidByUserId(Long user_id);


}