package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.TCParts;
import com.BidProcess.BidProcess.Service.TCPartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TCPartsRestController {

    @Autowired
    private TCPartsService tCPartsService;

    public TCPartsRestController(TCPartsService tCPartsService) {
        this.tCPartsService = tCPartsService;
    }

    @GetMapping("tCParts/{id}")
    public Optional<TCParts> findCTCPartsById(@PathVariable("id") Long id
    ) {
        return tCPartsService.findTCPartsById(id);
    }

    @RequestMapping(value = "/tCPartss", method = RequestMethod.GET)
    public List<TCParts> listTCPartss() {
        return tCPartsService.tCPartss();
    }

    @RequestMapping(value = "/tCParts/create", method = RequestMethod.POST)
    public TCParts createTCParts(@RequestBody TCParts tCParts) {
        return tCPartsService.createTCParts(tCParts);
    }

    @RequestMapping(value = "/tCParts/{id}", method = RequestMethod.PUT)
    public TCParts updateTCParts(@RequestBody TCParts tCParts, @PathVariable("id") @NotNull Long id) {
        return tCPartsService.updateTCParts(tCParts, id);
    }

    @RequestMapping(value = "/tCParts/delete", method = RequestMethod.DELETE)
    public TCParts requete(@RequestBody TCParts tCParts) {

        return tCPartsService.deleteTCParts(tCParts);
    }

}