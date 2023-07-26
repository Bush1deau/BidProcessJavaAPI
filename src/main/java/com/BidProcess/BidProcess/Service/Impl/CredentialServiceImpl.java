package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.CountryNotFoundException;
import com.BidProcess.BidProcess.Exception.CredentialNotFoundException;
import com.BidProcess.BidProcess.Model.Country;
import com.BidProcess.BidProcess.Model.Credential;
import com.BidProcess.BidProcess.Repository.CredentialRepository;
import com.BidProcess.BidProcess.Service.CredentialService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CredentialServiceImpl implements CredentialService {

    private final CredentialRepository credentialRepository;

    public CredentialServiceImpl(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    @Override
    public Optional<Credential> findCredentialById(Long id) {
        final Optional<Credential> optionalCredential = this.credentialRepository.findById(id);

        if (optionalCredential.isPresent()) {
            final Credential credential = optionalCredential.get();
            return credentialRepository.findById(id);
        } else {
            throw CredentialNotFoundException.credentialNotFound();
        }
    }

}
