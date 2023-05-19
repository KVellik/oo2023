package ee.karl.klassikomplekt_api;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EraisikController {
    List<Eraisik> eraisikud = new ArrayList<>(Arrays.asList(
            new Eraisik(1, "38712210248", "Toomas", "Toomingas" ),
            new Eraisik(2, "38404220817", "Tõnu", "Mõnu" ),
            new Eraisik(3, "38811210222", "Urmas", "Mõmm" )
    ));

    @GetMapping("eraisikud")
    public List<Eraisik> saaEraisikud() {
        return eraisikud;
    }

    @DeleteMapping("kustuta-eraisik/{index}")
    public String kustutaEraisik(@PathVariable int index) {
        eraisikud.remove(index);
        return "Eraisik kustutatud!";
    }

    @PostMapping("lisa-eraisik")
    public List<Eraisik> lisaEraisik(
            @RequestParam int id,
            @RequestParam String isikukood,
            @RequestParam String eesnimi,
            @RequestParam String perekonnanimi) {
        eraisikud.add(new Eraisik(id, "isikukood", "eesnimi", "perekonnanimi"));
        return eraisikud;
    }
}