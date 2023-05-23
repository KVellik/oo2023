package ee.karl.klassikomplekt_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class LaenController {

   // Eraisik laenaja1 = new Eraisik(1, "38712210248", "Toomas", "Toomingas");
   // Eraisik laenaja2 = new Eraisik(2, "38404220817", "Tõnu", "Mõnu");


    /*List<Arve> arved = new ArrayList<>(Arrays.asList(
            new Arve(1, laenaja1, "12345"),
            new Arve(2, laenaja2, "67890")
    ));*/

    List<Laen> laenud = new ArrayList<>(Arrays.asList(
            new Laen(5,10000.0, "12345"),
            new Laen(6,15000.0, "67890")
    ));

    @GetMapping("laenud")
    public List<Laen> saaLaenud() {
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

    // localhost:8080/lisa-laen?id=10&summa=20000.0&arveNr="66666"
    @PostMapping("lisa-laen/{id}/{summa}/{arveNr}")
    public List<Laen> lisaLaen(
            @RequestParam int id,
            @RequestParam double summa,
            @RequestParam String arveNr) {
        laenud.add(new Laen(id, summa, arveNr));
        return laenud;
    }

}