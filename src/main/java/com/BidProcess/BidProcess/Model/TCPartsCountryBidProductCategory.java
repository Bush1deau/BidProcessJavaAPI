package com.BidProcess.BidProcess.Model;


import com.BidProcess.BidProcess.Model.PK.TCPartsCountryBidProductCategoryPK;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TCPARTSCOUNTRYBIDPRODUCTCATEGORY")
public class TCPartsCountryBidProductCategory implements Serializable {


    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = -372222644021026319L;

    @EmbeddedId
    private TCPartsCountryBidProductCategoryPK id = new TCPartsCountryBidProductCategoryPK() ;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idTCParts")
    private TCParts tCParts;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCountry")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idBid")
    private Requete requete;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idProductCategory")
    private ProductCategory productCategory;


    public TCPartsCountryBidProductCategory( TCParts tCParts, Country country, Requete requete, ProductCategory productCategory ) {
        TCPartsCountryBidProductCategoryPK id =new TCPartsCountryBidProductCategoryPK(tCParts.getId(),country.getId(),requete.getId(),productCategory.getId());
        this.id=id;
        this.tCParts=tCParts;
        this.country=country;
        this.requete=requete;
        this.productCategory =productCategory;
    }


    public TCPartsCountryBidProductCategoryPK getId() {
        return id;
    }

    public void setId(TCPartsCountryBidProductCategoryPK id) {
        this.id = id;
    }


    public TCParts getTCParts() {
        return tCParts;
    }

    public void setTCParts(TCParts tCParts) {
        this.tCParts = tCParts;
    }


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    public Requete getRequete() {
        return requete;
    }

    public void setRequete(Requete requete) {
        this.requete = requete;
    }


    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

}
