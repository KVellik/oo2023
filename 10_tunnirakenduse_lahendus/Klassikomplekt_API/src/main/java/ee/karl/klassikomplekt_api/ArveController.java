package ee.karl.klassikomplekt_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ArveController {

    List<Arve> arved = new ArrayList<>(Arrays.asList(
            new Arve("48759"),
            new Arve("79985")
    ));


    @GetMapping
    public List<Arve> saaKoikArved() {
        return arved;
    }

    @DeleteMapping("kustuta-arve/{arveNR}")
    public String kustutaLaen(@PathVariable String arveNR) {
        for (Arve arve : arved) {
            if (Objects.equals(arve.getArveNr(), arveNR)) {
                arved.remove(arve);
                return "Arve kustutatud!";
            }
        }
        return "Arvet ei leitud!";
    }
}