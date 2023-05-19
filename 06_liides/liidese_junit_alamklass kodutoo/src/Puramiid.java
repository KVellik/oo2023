public class Puramiid extends Varv implements Arvutused {
    double kylg1;
    double korgus;

    public Puramiid(String varv, double kylg1, double korgus) {
        super(varv);
        this.kylg1 = kylg1;
        this.korgus = korgus;
    }

    @Override
    public double arvutaPohjaUmbermoot() {
        return kylg1 * 4;
    }

    @Override
    public double arvutaPindala() {
        return (kylg1*4) + (kylg1*4*(Math.sqrt(korgus*korgus + (kylg1/2)*(kylg1/2)))/2);
    }
}
