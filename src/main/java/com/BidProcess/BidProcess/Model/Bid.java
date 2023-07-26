package com.BidProcess.BidProcess.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BID")
public class Bid implements Serializable {
    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = 181450486423721993L;

    @Id
    @GeneratedValue(generator = "SEQ_REQUETE_ID", strategy = GenerationType.SEQUENCE)

    private Long id;
    private String name;
    private String customerName;
    private String opportunityType;
    private Integer opportunityMargin;
    private Date contractStart;
    private Integer ContractDuration;
    private String pricingModel;
    private String scopeQuery;
    private Date bidAndTendersRead;
    private String additionalContent;
    private File attachements;



}
