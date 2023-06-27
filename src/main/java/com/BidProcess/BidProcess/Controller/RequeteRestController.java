package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Requete;
import com.BidProcess.BidProcess.Service.RequeteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RequeteRestController {

    @Autowired
    private RequeteService requeteService;

    public RequeteRestController(RequeteService requeteService) {
        this.requeteService = requeteService;
    }

    @GetMapping("requete/{id}")
    public Optional<Requete> findRequeteById(@PathVariable("id") Long id
    ) {
        return requeteService.findRequeteById(id);
    }

    @RequestMapping(value = "/requetes", method = RequestMethod.GET)
    public List<Requete> listRequetes() {
        return requeteService.requetes();
    }

    @RequestMapping(value = "/requete/create", method = RequestMethod.POST)
    public Requete createRequete(@RequestBody Requete requete) {
        return requeteService.createRequete(requete);
    }

    @RequestMapping(value = "/requete/{id}", method = RequestMethod.PUT)
    public Requete updateRequete(@RequestBody Requete requete, @PathVariable("id") @NotNull Long id) {
        return requeteService.updateRequete(requete, id);
    }

    @RequestMapping(value = "/requete/delete", method = RequestMethod.DELETE)
    public Requete requete(@RequestBody Requete requete) {
        return requeteService.deleteRequete(requete);
    }

}