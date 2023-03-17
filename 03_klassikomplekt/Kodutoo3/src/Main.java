public class Main {
    public static void main(String[] args) {

        Klient klient1 = new Klient(546434342,"klient1@email.com", 56.20);

        Toode toode1 = new Toode("Laud", 20, 49.99, "puit", 20);

        Tellimus tellimus1 = new Tellimus(klient1, toode1);


        tellimus1.annaKliendiAndmed();
        tellimus1.annaTooteAndmed();
    }
}