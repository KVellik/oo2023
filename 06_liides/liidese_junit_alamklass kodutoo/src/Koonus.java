public class Koonus extends Varv implements Arvutused{
    double korgus;
    double raadius;

    public Koonus(String varv, double korgus, double raadius) {
        super(varv);
        this.korgus = korgus;
        this.raadius = raadius;
    }

    @Override
    public double arvutaPohjaUmbermoot() {
        return 2 * Math.PI * raadius;
    }

    @Override
    public double arvutaPindala() {
        return Math.PI * raadius * (raadius + Math.sqrt(raadius*raadius + korgus*korgus));
    }
}
