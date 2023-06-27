package com.BidProcess.BidProcess.Model.PK;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class TCPartsCountryBidProductCategoryPK implements Serializable {
    private Long idTCParts;
    private Long idCountry;
    private Long idBid;
    private Long idProductCategory;
}
