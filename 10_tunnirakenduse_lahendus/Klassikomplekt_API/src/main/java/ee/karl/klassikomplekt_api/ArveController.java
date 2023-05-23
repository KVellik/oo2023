package ee.karl.klassikomplekt_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ArveController {

    @Autowired
    EraisikController eraisikController;
    @Autowired
    LaenController laenController;

    //Eraisik laenaja1 = new Eraisik(1, "38712210248", "Toomas", "Toomingas");
    //Eraisik laenaja2 = new Eraisik(2, "38404220817", "Tõnu", "Mõnu");

    /*List<Arve> arved = new ArrayList<>(Arrays.asList(
            new Arve(1, laenaja1, "12345" ),
            new Arve(2, laenaja2, "67890")
    ));*/

    List<Laen> laenud = new ArrayList<>(Arrays.asList(
            new Laen(3,10000.0, "12345"),
            new Laen(4,1500.0, "67890")
    ));

    Eraisik laenaja = new Eraisik(5, "38812120123", "Madis", "Maalt");
    List<Arve> arved = new ArrayList<>(Arrays.asList(
            new Arve (5, laenaja, laenud)
            //new Arve (2, laenaja, uued_laenud)
    ));


    @GetMapping("arved")
    public List<Arve> saaKoikArved() {
        return arved;
    }

    @DeleteMapping("kustuta-arve/{id}")
    public String kustutaLaen(@PathVariable int id) {
        for (Arve arve : arved) {
            if (Objects.equals(arve.getId(), id)) {
                arved.remove(arve);
                return "Arve kustutatud!";
            }
        }
        return "Arvet ei leitud!";
    }

    // http://localhost:8080/lisa-arve?id=8&laenajaIndex=1&laenuIndex=4
    @PostMapping("lisa-arve")
    public List<Arve> lisaArve(
            @RequestParam int id,
            @RequestParam int laenajaIndex,
            @RequestParam int laenuIndex) {

        Eraisik laenaja = eraisikController.eraisikud.get(laenajaIndex);
        Laen võetud_laen = laenController.laenud.get(laenuIndex);
        List<Laen> võetud_laenud= new ArrayList<>(Arrays.asList(võetud_laen));

        arved.add(new Arve(id, laenaja, võetud_laenud));

        return arved;
    }

}