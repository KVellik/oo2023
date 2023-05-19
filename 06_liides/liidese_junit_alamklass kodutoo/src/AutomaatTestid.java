import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTestid {
    @Test
    public void kontrolli_koonuse_pohjaumbermoot(){
        Koonus koonus = new Koonus("must", 5, 3);
        assertEquals(18.8, koonus.arvutaPohjaUmbermoot(), 0.1);
    }
    public void kontrolli_koonuse_pindala(){
        Koonus koonus = new Koonus("must", 5, 3);
        assertEquals(83.2, koonus.arvutaPindala(), 0.1);
    }
    public void kontrolli_ristkuliku_pohjaumbermoot(){
        Ristkulik ristkulik = new Ristkulik("punane", 10, 5, 5);
        assertEquals(40.0, ristkulik.arvutaPohjaUmbermoot(), 0.1);
    }
    public void kontrolli_ristkuliku_pindala(){
        Ristkulik ristkulik = new Ristkulik("punane", 10, 5, 5);
        assertEquals(250.0, ristkulik.arvutaPindala(), 0.1);
    }
    public void kontrolli_puramiidi_pohjaümbermoot(){
        Puramiid puramiid = new Puramiid("sinine", 7, 7);
        assertEquals(28.0, puramiid.arvutaPohjaUmbermoot(), 0.1);
    }
    public void kontrolli_puramiidi_pindala(){
        Puramiid puramiid = new Puramiid("sinine", 7, 7);
        assertEquals(158.6, puramiid.arvutaPindala(), 0.1);
    }
}
