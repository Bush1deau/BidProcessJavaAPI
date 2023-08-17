package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Bid;

import java.util.List;
import java.util.Optional;

public interface BidService {
    Optional<Bid> findBidById(Long id);

    List<Bid> bids();

    Bid createBid(Bid bid);

    Bid updateBid(Bid bid , Long id);

    Bid deleteBid(Bid bid);

    List<Bid> findBidByUserId(Long user_id);

    Bid updateBidStatus(Long bidId, String newStatus);
}