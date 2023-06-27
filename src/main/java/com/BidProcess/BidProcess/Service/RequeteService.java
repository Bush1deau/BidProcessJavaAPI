package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Requete;
import com.BidProcess.BidProcess.Model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface RequeteService {
    Optional<Requete> findRequeteById(Long id);

    List<Requete> requetes();

    Requete createRequete(Requete requete);

    Requete updateRequete(Requete requete , Long id);

    Requete deleteRequete(Requete requete);

}