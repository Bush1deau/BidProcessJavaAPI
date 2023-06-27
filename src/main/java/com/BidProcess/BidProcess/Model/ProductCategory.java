package com.BidProcess.BidProcess.Model;

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
@Table(name = "PRODUCTCATEGORY")
public class ProductCategory implements Serializable {
    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = 181450486423721993L;

    @Id
    @GeneratedValue(generator = "SEQ_PRODUCTCATEGORY_ID", strategy = GenerationType.SEQUENCE)

    private Long id;
    private String name;



}
