package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.RequeteNotFoundException;
import com.BidProcess.BidProcess.Exception.UtilisateurNotFoundException;
import com.BidProcess.BidProcess.Model.Requete;
import com.BidProcess.BidProcess.Repository.RequeteRepository;
import com.BidProcess.BidProcess.Service.RequeteService;
import com.BidProcess.BidProcess.Service.UtilisateurService;
import com.BidProcess.BidProcess.Model.Utilisateur;
import com.BidProcess.BidProcess.Repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RequeteServiceImpl implements RequeteService {

    private final RequeteRepository requeteRepository;

    public RequeteServiceImpl(RequeteRepository requeteRepository) {
        this.requeteRepository = requeteRepository;
    }

    @Override
    public Optional<Requete> findRequeteById(Long id) {
        final Optional<Requete> optionalRequete = this.requeteRepository.findById(id);

        if (optionalRequete.isPresent()) {
            final Requete requete = optionalRequete.get();
            return requeteRepository.findById(id);
        } else {
            throw RequeteNotFoundException.requeteNotFound();
        }
    }

    @Override
    public List<Requete> requetes() {
        return requeteRepository.findAll();
    }

    @Override
    public Requete createRequete(Requete requete) {
        requeteRepository.save(requete);
        return requete;
    }
    @Override
    public Requete updateRequete(Requete requete, Long id) {
        requete.setId(id);
        return  requeteRepository.save(requete);
    }

    @Transactional
    public Requete deleteRequete(Requete requete) {
        requeteRepository.delete(requete);
        return requete;
    }

}
