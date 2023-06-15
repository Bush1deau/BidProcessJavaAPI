package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
    Optional<Utilisateur> findUtilisateurById(Long id);

    List<Utilisateur> utilisateurs();

    Utilisateur createUtilisateur(Utilisateur utilisateur);

    Utilisateur updateUtilisateur(Utilisateur utilisateur , Long id);

    Utilisateur deleteUtilisateur(Utilisateur utilisateur);

}
