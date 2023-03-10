import java.util.Scanner;

public class Ladu {
    String tootenimi;
    int kogus;
    double hind;
    String materjal;
    String värvus;


    public Ladu(String tootenimi, int kogus, double hind, String materjal, String värvus) {
        this.kogus = kogus;
        this.hind = hind;
        this.materjal = materjal;
        this.värvus = värvus;
    }

    public void lisaToode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mitu toodet soovite lisada ?");
        int lisaKogus = scanner.nextInt();
        this.kogus = this.kogus + lisaKogus;
        System.out.println("Laos on nüüd " + this.kogus + " toodet.");
    }

    public void eemaldaToode() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Mitu toodet soovite eemaldada ?");
        int eemaldaKogus = scanner2.nextInt();
        if (this.kogus == eemaldaKogus) {
            this.kogus = this.kogus - eemaldaKogus;
            System.out.println("Laos on nüüd 0 toodet");
        } else if (this.kogus < eemaldaKogus) {
                System.out.println("Toode on otsas või laos ei ole piisavalt toodet");
        } else {
            this.kogus = this.kogus - eemaldaKogus;
            System.out.println("Laos on nüüd " + this.kogus + " toodet.");
        }

    }
}