package ee.karl.klassikomplekt_api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Eraisik {
    private int id;
    private String isikukood;
    private String eesnimi;
    private String perekonnanimi;
}