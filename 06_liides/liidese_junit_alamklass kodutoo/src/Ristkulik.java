public class Ristkulik extends Varv implements Arvutused{
    double kylg1;
    double kylg2;
    double korgus;

    public Ristkulik(String varv, double kylg1, double kylg2, double korgus) {
        super(varv);
        this.kylg1 = kylg1;
        this.kylg2 = kylg2;
        this.korgus = korgus;

    }

    @Override
    public double arvutaPohjaUmbermoot() {
        return kylg1+kylg1+kylg2+kylg2;
    }

    @Override
    public double arvutaPindala() {
        return kylg1*kylg2*korgus;
    }
}
