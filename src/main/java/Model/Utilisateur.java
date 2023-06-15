package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable {
    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = 181450486423721993L;

    @Id
    @GeneratedValue(generator = "SEQ_CUSTOMER_ID", strategy = GenerationType.SEQUENCE)

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
