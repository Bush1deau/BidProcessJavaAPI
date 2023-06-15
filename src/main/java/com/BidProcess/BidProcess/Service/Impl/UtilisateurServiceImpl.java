package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.UtilisateurNotFoundException;
import com.BidProcess.BidProcess.Service.UtilisateurService;
import com.BidProcess.BidProcess.Model.Utilisateur;
import com.BidProcess.BidProcess.Repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Optional<Utilisateur> findUtilisateurById(Long id) {
        final Optional<Utilisateur> optionalUtilisateur = this.utilisateurRepository.findById(id);

        if (optionalUtilisateur.isPresent()) {
            final Utilisateur utilisateur = optionalUtilisateur.get();
            return utilisateurRepository.findById(id);
        } else {
            throw UtilisateurNotFoundException.utilisateurNotFound();
        }
    }

    @Override
    public List<Utilisateur> utilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
        return utilisateur;
    }
    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur, Long id) {
        utilisateur.setId(id);
        return  utilisateurRepository.save(utilisateur);
    }

    @Transactional
    public Utilisateur deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);
        return utilisateur;
    }

}
