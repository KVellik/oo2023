public class Tellimus {
    Klient klient;
    Toode toode;

    public Tellimus(Klient klient, Toode toode) {
        this.klient = klient;
        this.toode = toode;
    }

    public void annaKliendiAndmed(){
        System.out.println(klient.getIsikukood());
        System.out.println(klient.getEmail());
    }

    public void annaTooteAndmed(){
        System.out.println(toode.getTootenimi());
        System.out.println(toode.getKogus());

    }
}
