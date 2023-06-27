package com.BidProcess.BidProcess.Repository;

import com.BidProcess.BidProcess.Model.PK.TCPartsCountryBidProductCategoryPK;
import com.BidProcess.BidProcess.Model.TCPartsCountryBidProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TCPartsCountryBidProductCategoryRepository extends JpaRepository<TCPartsCountryBidProductCategory, TCPartsCountryBidProductCategoryPK> {

    Optional<TCPartsCountryBidProductCategory> findById(TCPartsCountryBidProductCategoryPK id);

}
