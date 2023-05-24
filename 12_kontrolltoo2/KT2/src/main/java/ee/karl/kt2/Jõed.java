package ee.karl.kt2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Jõed {
    @Id
    private int id;
    private String nimi;
    private double lähtme_x;
    private double lähtme_y;
    private double suudme_x;
    private double suudme_y;

   /* @ManyToOne
    private int järveID;
    private double suhe;*/

    @ManyToOne
    private Järv sihtjärv;

    private double suhe;


    public double leiaKaugusPikslites() {
        double kaugusX = Math.abs(lähtme_x - suudme_x);
        double kaugusY = Math.abs(lähtme_y - suudme_y);
        return Math.sqrt(Math.pow(kaugusX, 2) + Math.pow(kaugusY, 2));
    }


}