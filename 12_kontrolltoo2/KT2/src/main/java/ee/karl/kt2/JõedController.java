package ee.karl.kt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class JõedController {

    Järv sihtjärv = new Järv(3, "Harku", 12.0, null);

    List<Jõed> jõed = new ArrayList<>(Arrays.asList(
            new Jõed(1, "Emajõgi", 1.0, 1.0, 5.0, 4.0, sihtjärv , 0.5),
            new Jõed(2, "Kohila", 15.0, 26.0, 47.0, 122.0, sihtjärv, 1.0)

    ));

    List<Järv> järved = new ArrayList<>(Arrays.asList(
            new Järv(1,"Peipsi", 10, jõed),
            new Järv(2, "Võrtsjärv", 3, jõed)

    ));

    //Järv sihtjärv = new Järv(1, "Peipsi", 10, jõed);

    @GetMapping("jõed")
    public List<Jõed> saaJõed(){
        return jõed;
    }

    @GetMapping("järved")
    public List<Järv> saaJärved(){
        return järved;
    }


    @GetMapping("/kaugus")
    public double leiaKaugus(@RequestParam int id) {
        for (Jõed jõed : jõed) {
            if (jõed.getId() == id) {
                return jõed.leiaKaugusPikslites();
            }
        }
        throw new IllegalArgumentException("Jõge ID-ga " + id + " ei leitud.");
    }


    @GetMapping("/jõed/reostus")
    public double jõeReostus(@RequestParam int id) {
        for (Jõed jõgi : jõed) {
            if (jõgi.getId() == id) {
                Järv sihtjärv = jõgi.getSihtjärv();
                if (sihtjärv != null) {
                    double reostusProtsent = sihtjärv.getReostusProtsent();
                    double suhe = jõgi.getSuhe();
                    return reostusProtsent * suhe;
                } else {
                    throw new IllegalArgumentException("Jõge ID-ga " + id + " ei suubu ühtegi sihtjärve.");
                }
            }
        }
        throw new IllegalArgumentException("Jõge ID-ga " + id + " ei leitud.");
    }
}












