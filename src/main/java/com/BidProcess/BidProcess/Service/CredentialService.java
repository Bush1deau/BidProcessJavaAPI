package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Credential;

import java.util.List;
import java.util.Optional;

public interface CredentialService {
    Optional<Credential> findCredentialById(Long id);


}
