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
@Table(name = "CREDENTIAL")
public class Credential implements Serializable {
    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = 181450486423721993L;

    @Id
    @GeneratedValue(generator = "SEQ_ROLE_ID", strategy = GenerationType.SEQUENCE)

    private Long id;
    private String Password;
}
