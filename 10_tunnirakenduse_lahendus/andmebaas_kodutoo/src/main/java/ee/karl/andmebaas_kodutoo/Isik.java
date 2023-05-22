package ee.karl.andmebaas_kodutoo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Isik {
    @Id
    private int id;
    private String eesnimi;
    private String perekonnanimi;
    private boolean aktiivne;
}