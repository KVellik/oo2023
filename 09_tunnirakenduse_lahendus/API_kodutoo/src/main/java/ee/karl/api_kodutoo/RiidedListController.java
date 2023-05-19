package ee.karl.api_kodutoo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class RiidedListController {
    List<Riided> riided = new ArrayList<>(Arrays.asList(
            new Riided(1, "Kampsun", 40.0, 5, false),
            new Riided(2, "Teksad", 99.99, 7, false),
            new Riided(3, "Müts", 10.0, 10, true),
            new Riided(4, "Sall", 19.99, 20, false)
    ));

    @GetMapping("riided")
    public List<Riided> saaRiided() {
        return riided;
    }

    @DeleteMapping("kustuta-riided/{index}")
    public List<Riided> kustutaRiided(@PathVariable int index) {
        riided.remove(index);
        return riided;
    }

    @PatchMapping("muuda-hinda/{hind}")
    public List<Riided> muudaHinda(@PathVariable double hind){
        for (Riided riided : riided) {
            double vanahind = riided.getHind();
            double uushind = vanahind + 5;
            riided.setHind(uushind);
        }
        return riided;
    }

    @PostMapping("lisa-toode/{id}/{nimi}/{hind}/{kogus}/{allahindlus}")
    public List<Riided> lisaRiided(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable int kogus,
            @PathVariable boolean allahindlus) {
        riided.add(new Riided(id, nimi, hind, kogus, allahindlus));
        return riided;
    }
}

