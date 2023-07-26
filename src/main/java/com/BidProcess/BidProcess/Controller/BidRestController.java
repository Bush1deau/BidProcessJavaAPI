package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Bid;
import com.BidProcess.BidProcess.Service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BidRestController {

    @Autowired
    private BidService bidService;

    public BidRestController(BidService bidService) {
        this.bidService = bidService;
    }

    @GetMapping("bid/{id}")
    public Optional<Bid> findBidById(@PathVariable("id") Long id
    ) {
        return bidService.findBidById(id);
    }

    @RequestMapping(value = "/bids", method = RequestMethod.GET)
    public List<Bid> listBids() {
        return bidService.bids();
    }

    @RequestMapping(value = "/bid/create", method = RequestMethod.POST)
    public Bid createBid(@RequestBody Bid bid) {
        return bidService.createBid(bid);
    }

    @RequestMapping(value = "/bid/{id}", method = RequestMethod.PUT)
    public Bid updateRequete(@RequestBody Bid bid, @PathVariable("id") @NotNull Long id) {
        return bidService.updateBid(bid, id);
    }

    @RequestMapping(value = "/bid/delete", method = RequestMethod.DELETE)
    public Bid bid(@RequestBody Bid bid) {
        return bidService.deleteBid(bid);
    }

}