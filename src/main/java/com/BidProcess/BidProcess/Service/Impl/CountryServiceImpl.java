package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.CountryNotFoundException;
import com.BidProcess.BidProcess.Model.Country;
import com.BidProcess.BidProcess.Repository.CountryRepository;
import com.BidProcess.BidProcess.Service.CountryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Optional<Country> findCountryById(Long id) {
        final Optional<Country> optionalCountry = this.countryRepository.findById(id);

        if (optionalCountry.isPresent()) {
            final Country country = optionalCountry.get();
            return countryRepository.findById(id);
        } else {
            throw CountryNotFoundException.countryNotFound();
        }
    }

    @Override
    public List<Country> countries() {
        return countryRepository.findAll();
    }

    @Override
    public Country createCountry(Country country) {
        countryRepository.save(country);
        return country;
    }
    @Override
    public Country updateCountry(Country country, Long id) {
        country.setId(id);
        return  countryRepository.save(country);
    }

    @Transactional
    public Country deleteCountry(Country country) {
        countryRepository.delete(country);
        return country;
    }

}
