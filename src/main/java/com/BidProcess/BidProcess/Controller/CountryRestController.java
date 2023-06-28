package com.BidProcess.BidProcess.Controller;

import com.BidProcess.BidProcess.Model.Country;
import com.BidProcess.BidProcess.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CountryRestController {

    @Autowired
    private CountryService countryService;

    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping( "country/{id}" )
    public Optional<Country> findCountryById(@PathVariable("id") Long id
    ){
        return countryService.findCountryById(id);
    }

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    public List<Country> listCountries(){
        return countryService.countries();
    }

    @RequestMapping(value = "/country/create", method = RequestMethod.POST)
    public Country createCountry(@RequestBody Country country){
        return countryService.createCountry(country);
    }
    @RequestMapping(value = "/country/{id}", method = RequestMethod.PUT)
    public Country updateCountry(@RequestBody Country country , @PathVariable("id") @NotNull Long id ){
        return countryService.updateCountry(country,id);
    }

    @RequestMapping(value = "/country/delete", method = RequestMethod.DELETE)
    public Country country(@RequestBody Country country) {
        return countryService.deleteCountry(country);
    }

}