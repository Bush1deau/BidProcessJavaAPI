package com.BidProcess.BidProcess.Service.Impl;

import com.BidProcess.BidProcess.Exception.TCPartsCountryBidProductCategoryNotFoundException;
import com.BidProcess.BidProcess.Model.PK.TCPartsCountryBidProductCategoryPK;
import com.BidProcess.BidProcess.Model.TCPartsCountryBidProductCategory;
import com.BidProcess.BidProcess.Repository.TCPartsCountryBidProductCategoryRepository;
import com.BidProcess.BidProcess.Service.TCPartsCountryBidProductCategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TCPartsCountryBidProductCategoryServiceImpl implements TCPartsCountryBidProductCategoryService {


    private final TCPartsCountryBidProductCategoryRepository tCPartsCountryBidProductCategoryRepository;


    public TCPartsCountryBidProductCategoryServiceImpl(TCPartsCountryBidProductCategoryRepository tCPartsCountryBidProductCategoryRepository) {
        this.tCPartsCountryBidProductCategoryRepository = tCPartsCountryBidProductCategoryRepository;
    }

    @Override
    public Optional<TCPartsCountryBidProductCategory> findTCPartsCountryBidProductCategoryById(TCPartsCountryBidProductCategoryPK id){
        final Optional<TCPartsCountryBidProductCategory> optionalTCPartsCountryBidProductCategory = this.tCPartsCountryBidProductCategoryRepository.findById(id);

        if (optionalTCPartsCountryBidProductCategory.isPresent()) {
            final TCPartsCountryBidProductCategory tCPartsCountryBidProductCategory = optionalTCPartsCountryBidProductCategory.get();
            return tCPartsCountryBidProductCategoryRepository.findById(id);
        } else {
            throw  TCPartsCountryBidProductCategoryNotFoundException.tCPartsCountryBidProductCategoryNotFound();
        }
    }

    @Override
    public List<TCPartsCountryBidProductCategory> listTCPartsCountryBidProductCategories() {
        return tCPartsCountryBidProductCategoryRepository.findAll();

    }

    @Override
    public TCPartsCountryBidProductCategory createTCPartsCountryBidProductCategory(TCPartsCountryBidProductCategory tcPartsCountryBidProductCategory) {
        tCPartsCountryBidProductCategoryRepository.save(tcPartsCountryBidProductCategory);
        return tcPartsCountryBidProductCategory;
    }
    @Override
    public TCPartsCountryBidProductCategory updateTCPartsCountryBidProductCategory(TCPartsCountryBidProductCategory tCPartsCountryBidProductCategory,TCPartsCountryBidProductCategoryPK tcPartsCountryBidProductCategoryPK) {
        tCPartsCountryBidProductCategory.setId(tcPartsCountryBidProductCategoryPK);
        return tCPartsCountryBidProductCategoryRepository.save(tCPartsCountryBidProductCategory);
    }

    @Transactional
    public TCPartsCountryBidProductCategory deleteTCPartsCountryBidProductCategory(TCPartsCountryBidProductCategory tcPartsCountryBidProductCategory) {
        tCPartsCountryBidProductCategoryRepository.delete(tcPartsCountryBidProductCategory);
        return tcPartsCountryBidProductCategory;
    }

}