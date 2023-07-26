package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.BidNotFoundException;
import com.BidProcess.BidProcess.Model.Bid;
import com.BidProcess.BidProcess.Repository.BidRepository;
import com.BidProcess.BidProcess.Service.BidService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BidServiceImpl implements BidService {

    private final BidRepository bidRepository;

    public BidServiceImpl(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public Optional<Bid> findBidById(Long id) {
        final Optional<Bid> optionalBid = this.bidRepository.findById(id);

        if (optionalBid.isPresent()) {
            final Bid bid = optionalBid.get();
            return bidRepository.findById(id);
        } else {
            throw BidNotFoundException.bidNotFound();
        }
    }

    @Override
    public List<Bid> bids() {
        return bidRepository.findAll();
    }

    @Override
    public Bid createBid(Bid bid) {
        bidRepository.save(bid);
        return bid;
    }
    @Override
    public Bid updateBid(Bid bid, Long id) {
        bid.setId(id);
        return  bidRepository.save(bid);
    }

    @Transactional
    public Bid deleteBid(Bid bid) {
        bidRepository.delete(bid);
        return bid;
    }

}
