package ee.karl.andmebaas_kodutoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class IsikController {

    @Autowired
    IsikRepository isikRepository;

    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1, "Urmas", "Urmaste", true
            )));


    @GetMapping("isikud")
    public List<Isik> getIsikud() {
        return isikRepository.findAll();
    }


    // POST localhost:8080/lisa-isik?id=1&eesnimi=Ees&perekonnanimi=Pere&aktiivne=true
    @PostMapping ("lisa-isik")
    public List<Isik> addIsik(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perekonnanimi,
            @RequestParam boolean aktiivne

    ) {
        isikRepository.save(new Isik(id, eesnimi, perekonnanimi, aktiivne));

        return isikRepository.findAll();
    }

    // DELETE localhost:8080/kustuta-isik/1
    @GetMapping("kustuta-isik/{id}")
    public String kustutaIsik(@PathVariable int id) {
        isikRepository.deleteById(id);
        return "Isik kustutatud!";

    }
}