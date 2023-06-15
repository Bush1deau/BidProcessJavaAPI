package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Utilisateur;
import com.BidProcess.BidProcess.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UtilisateurRestController {

    @Autowired
    private UtilisateurService utilisateurService;

    public UtilisateurRestController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping( "utilisateur/{id}" )
    public Optional<Utilisateur> findCustomerById(@PathVariable("id") Long id
    ){
        return utilisateurService.findUtilisateurById(id);
    }

    @RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
    public List<Utilisateur> listUtilisateurs(){
        return utilisateurService.utilisateurs();
    }

    @RequestMapping(value = "/utilisateur/create", method = RequestMethod.POST)
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.createUtilisateur(utilisateur);
    }
    @RequestMapping(value = "/utilisateur/{id}", method = RequestMethod.PUT)
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur , @PathVariable("id") @NotNull Long id ){
        return utilisateurService.updateUtilisateur(utilisateur,id);
    }

    @RequestMapping(value = "/utilisateur/delete", method = RequestMethod.DELETE)
    public Utilisateur utilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.deleteUtilisateur(utilisateur);
    }

}