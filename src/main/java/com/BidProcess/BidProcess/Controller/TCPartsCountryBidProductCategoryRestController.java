package com.BidProcess.BidProcess.Controller;


import com.BidProcess.BidProcess.Model.PK.TCPartsCountryBidProductCategoryPK;
import com.BidProcess.BidProcess.Model.TCPartsCountryBidProductCategory;
import com.BidProcess.BidProcess.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TCPartsCountryBidProductCategoryRestController {

    @Autowired
    private TCPartsCountryBidProductCategoryService tCPartsCountryBidProductCategoryService;


    public TCPartsCountryBidProductCategoryRestController(TCPartsCountryBidProductCategoryService tcPartsCountryBidProductCategoryService, TCPartsService tCPartsService, CountryService countryService, RequeteService requeteService, ProductCategoryService productCategoryService) {
        this.tCPartsCountryBidProductCategoryService = tcPartsCountryBidProductCategoryService;

    }

    @RequestMapping(value = "tCPartsCountryBidProductCategory/{idTCParts}/{idCountry}/{idBid}/{idProductCategory}", method = RequestMethod.GET)
    public Optional<TCPartsCountryBidProductCategory> findTCPartsCountryBidProductCategoryById(@PathVariable("idTCParts") @NotNull Long idTCParts,
                                                                                               @PathVariable("idCountry") @NotNull Long idCountry,
                                                                                               @PathVariable("idBid") @NotNull Long idBid,
                                                                                               @PathVariable("idProductCategory") @NotNull Long idProductCategory
    ) {
        return tCPartsCountryBidProductCategoryService.findTCPartsCountryBidProductCategoryById(new TCPartsCountryBidProductCategoryPK(idTCParts, idCountry, idBid, idProductCategory));
    }

    @RequestMapping(value = "/tCPartsCountryBidProductCategories", method = RequestMethod.GET)
    public List<TCPartsCountryBidProductCategory> listTCPartsCountryBidProductCategories() {
        return tCPartsCountryBidProductCategoryService.listTCPartsCountryBidProductCategories();
    }


    @RequestMapping(value = "/tCPartsCountryBidProductCategories/create", method = RequestMethod.POST)
    public TCPartsCountryBidProductCategory createTCPartsCountryBidProductCategory(@RequestBody TCPartsCountryBidProductCategory tCPartsCountryBidProductCategory) {
        return tCPartsCountryBidProductCategoryService.createTCPartsCountryBidProductCategory(tCPartsCountryBidProductCategory);
    }

    @RequestMapping(value = "/update/{idTCParts}/{idCountry}/{idBid}/{idProductCategory}", method = RequestMethod.PUT)
    public TCPartsCountryBidProductCategory updateTCPartsCountryBidProductCategory(@RequestBody TCPartsCountryBidProductCategory tCPartsCountryBidProductCategory,
                                                                                   @PathVariable("idTCParts") @NotNull Long idTCParts,
                                                                                   @PathVariable("idCountry") @NotNull Long idCountry,
                                                                                   @PathVariable("idBid") @NotNull Long idBid,
                                                                                   @PathVariable("idProductCategory") @NotNull Long idProductCategory) {
        return tCPartsCountryBidProductCategoryService.updateTCPartsCountryBidProductCategory(tCPartsCountryBidProductCategory, new TCPartsCountryBidProductCategoryPK(idTCParts, idCountry, idBid, idProductCategory));
    }


    @RequestMapping(value = "/tCPartsCountryBidProductCategories/delete", method = RequestMethod.DELETE)
    public TCPartsCountryBidProductCategory deleteCustomerCompanyLicenceTeam(@RequestBody TCPartsCountryBidProductCategory tcPartsCountryBidProductCategory) {
        return tCPartsCountryBidProductCategoryService.deleteTCPartsCountryBidProductCategory(tcPartsCountryBidProductCategory);
    }


}
