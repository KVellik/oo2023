package ee.karl.api_kodutoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RiidedController {
    Riided riided = new Riided(1,"Sokid", 15.99, 10, false );

    @GetMapping("riided")
    public Riided saaRiided() {
        return riided;
    }

    @GetMapping("kustuta-riided")
    public Riided eemaldaRiided() {
        riided = null;
        return riided;
    }

    @GetMapping("suurenda-riide-hinda")
    public Riided suurendaHinda() {
        riided.setHind( riided.getHind()+5.99);
        return riided;
    }

    @GetMapping("saa-riide-kogus")
    public Riided saaKogus(@PathVariable int id, @PathVariable int kogus) {
        riided.getKogus();
        return riided;
    }

    @GetMapping("muuda-allahindlus")
    public Riided muudaAllahindlust() {
        riided.setAllahindlus(!riided.isAllahindlus());
        return riided;
    }
}
