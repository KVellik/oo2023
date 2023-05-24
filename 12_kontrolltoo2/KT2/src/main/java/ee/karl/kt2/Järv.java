package ee.karl.kt2;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Järv {
    @Id
    private int id;
    private String nimi;
    private double reostusProtsent;
    @OneToMany(mappedBy = "sihtjärv")
    private List<Jõed> jõed;

}