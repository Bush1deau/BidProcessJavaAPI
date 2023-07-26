package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Country;
import com.BidProcess.BidProcess.Model.Credential;
import com.BidProcess.BidProcess.Service.CountryService;
import com.BidProcess.BidProcess.Service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CredentialRestController {

    @Autowired
    private CredentialService credentialService;

    public CredentialRestController(CredentialService credentialService) {
        this.credentialService = credentialService;
    }

    @GetMapping( "credential/{id}" )
    public Optional<Credential> findCredentialById(@PathVariable("id") Long id
    ){
        return credentialService.findCredentialById(id);
    }

}