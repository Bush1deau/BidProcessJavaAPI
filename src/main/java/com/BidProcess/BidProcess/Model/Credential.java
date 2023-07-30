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
    public String email;
    public String password;
    @Id
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
