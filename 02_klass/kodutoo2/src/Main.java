public class Main {
    public static void main(String[] args) {

        Ladu toode1 = new Ladu("Teksad", 10, 79.99, "denim", "must");
        Ladu toode2 = new Ladu("Talvejope", 25, 129.99, "polüester", "sinine");
        Ladu toode3 = new Ladu("Sokid", 50, 19.99, "puuvill", "valge");
        Ladu toode4 = new Ladu("Saapad", 8, 99.99, "nahk", "pruun");

        toode2.lisaToode();

        toode4.eemaldaToode();
    }
}