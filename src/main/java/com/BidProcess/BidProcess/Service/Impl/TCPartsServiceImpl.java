package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.RequeteNotFoundException;
import com.BidProcess.BidProcess.Exception.UtilisateurNotFoundException;
import com.BidProcess.BidProcess.Model.Requete;
import com.BidProcess.BidProcess.Model.TCParts;
import com.BidProcess.BidProcess.Repository.RequeteRepository;
import com.BidProcess.BidProcess.Repository.TCPartsRepository;
import com.BidProcess.BidProcess.Service.RequeteService;
import com.BidProcess.BidProcess.Service.TCPartsService;
import com.BidProcess.BidProcess.Service.UtilisateurService;
import com.BidProcess.BidProcess.Model.Utilisateur;
import com.BidProcess.BidProcess.Repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TCPartsServiceImpl implements TCPartsService {

    private final TCPartsRepository tCPartsRepository;

    public TCPartsServiceImpl(TCPartsRepository tCPartsRepository) {
        this.tCPartsRepository = tCPartsRepository;
    }

    @Override
    public Optional<TCParts> findTCPartsById(Long id) {
        final Optional<TCParts> optionalTCParts = this.tCPartsRepository.findById(id);

        if (optionalTCParts.isPresent()) {
            final TCParts tcParts = optionalTCParts.get();
            return tCPartsRepository.findById(id);
        } else {
            throw RequeteNotFoundException.requeteNotFound();
        }
    }

    @Override
    public List<TCParts> tCPartss() {
        return tCPartsRepository.findAll();
    }

    @Override
    public TCParts createTCParts(TCParts tCParts) {
        tCPartsRepository.save(tCParts);
        return tCParts;
    }
    @Override
    public TCParts updateTCParts(TCParts tCParts, Long id) {
        tCParts.setId(id);
        return  tCPartsRepository.save(tCParts);
    }

    @Transactional
    public TCParts deleteTCParts(TCParts tCParts) {
        tCPartsRepository.delete(tCParts);
        return tCParts;
    }

}
