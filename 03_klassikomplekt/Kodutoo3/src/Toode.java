public class Toode {
    String tootenimi;
    int kogus;
    double hind;
    String materjal;
    int kaal;


    public Toode(String tootenimi, int kogus, double hind, String materjal, int kaal) {
        this.tootenimi = tootenimi;
        this.kogus = kogus;
        this.hind = hind;
        this.materjal = materjal;
        this.kaal = kaal;
    }

    public String getTootenimi(){
        return tootenimi;
    }

    public int getKogus(){
        return kogus;
    }
}
