package ee.karl.klassikomplekt_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("laenud")
public class LaenController {

    @Autowired
    EraisikController eraisikController;
    @Autowired
    ArveController arveController;


    List<Laen> laenud = new ArrayList<>(Arrays.asList(
            new Laen(5, 10000.0, new Date()),
            new Laen(6, 1500.0, new Date())
    ));


    @GetMapping
    public List<Laen> saaKoikLaenud() {
        return laenud;
    }

    @GetMapping("saa-laen/{id}")
    public Laen saaLaen(@PathVariable int id) {
        for (Laen laen : laenud) {
            if (laen.getId() == id) {
                return laen;
            }
        }
        return null;
    }

    @DeleteMapping("kustuta-laen/{id}")
    public String kustutaLaen(@PathVariable int id) {
        for (Laen laen : laenud) {
            if (laen.getId() == id) {
                laenud.remove(laen);
                return "Laen kustutatud!";
            }
        }
        return "Laenu ei leitud!";
    }
}