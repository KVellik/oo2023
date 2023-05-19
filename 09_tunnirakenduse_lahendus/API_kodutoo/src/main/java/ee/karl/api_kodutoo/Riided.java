package ee.karl.api_kodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Riided {
    private int id;
    private String nimi;
    private double hind;
    private int kogus;
    private boolean allahindlus;

}