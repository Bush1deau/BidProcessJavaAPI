package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Exception.ResourceNotFoundException;
import com.BidProcess.BidProcess.Model.Bid;
import com.BidProcess.BidProcess.Repository.BidRepository;
import com.BidProcess.BidProcess.Service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BidRestController {

    @Autowired
    private BidService bidService;
    @Autowired
    private BidRepository bidRepository;

    public class BidStatusUpdateRequest {
        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

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

    @PutMapping("/{id}/update-status")
    public ResponseEntity<String> updateStatus(@PathVariable Long id, @RequestBody String newStatus){
            bidService.updateBidStatus(id, newStatus);
            return ResponseEntity.ok(newStatus); }
    @RequestMapping(value = "/bid/delete", method = RequestMethod.DELETE)
    public Bid deleteBid(@RequestBody Bid bid) {
        return bidService.deleteBid(bid);
    }

    @GetMapping("bid/user_id/{user_id}")
    public List<Bid> findBidByUserId(@PathVariable("user_id") Long id
    ) {
        return bidService.bids();
    }

    @PatchMapping("bid/{id}")
    public ResponseEntity<Bid> updateBidStatus(@PathVariable Long id, @RequestBody BidStatusUpdateRequest request) {
        Bid updatedBid = bidService.updateBidStatus(id, request.getStatus());
        return ResponseEntity.ok(updatedBid);
    }

}