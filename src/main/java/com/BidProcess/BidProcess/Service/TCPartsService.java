package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.TCParts;

import java.util.List;
import java.util.Optional;

public interface TCPartsService {
    Optional<TCParts> findTCPartsById(Long id);

    List<TCParts> tCPartss();

    TCParts createTCParts(TCParts tCParts);

    TCParts updateTCParts(TCParts tCParts , Long id);

    TCParts deleteTCParts(TCParts tCParts);

}