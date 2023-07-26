package com.BidProcess.BidProcess.Service;

import com.BidProcess.BidProcess.Model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Optional<Country> findCountryById(Long id);

    List<Country> countries();

    Country createCountry(Country country);

    Country updateCountry(Country country , Long id);

    Country deleteCountry(Country country);

}
