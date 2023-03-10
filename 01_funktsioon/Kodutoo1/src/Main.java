import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sõna pikkus
        Scanner scanner= new Scanner(System.in);
        System.out.println("Sisesta sõna: ");
        String sõna = scanner.nextLine();

        int length = sõna.length();
        System.out.println(" Sõna pikkus on " + length + " tähemärki.");

        // Sõiduki kiirus
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Auto kiirus oli: ");
        int kiirus = scanner.nextInt();
        String Hinnang = Kiiruskaamera(kiirus);
        System.out.println(Hinnang);

        // Sõiduaeg
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Hetkene sõidukiirus (km/h): ");
        double kiirus_hetkel = scanner.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Distant sihtkohta (km): ");
        double distants = scanner.nextInt();
        double Teekond = (distants / kiirus_hetkel);
        System.out.println("Sihtkohta jõudmiseks kulub " + df.format(Teekond) + " tundi.");

        // Palgakalkulaator
        double neto = arvutaNetopalk(2000);
        System.out.println("Netopalk on " + neto);

        // Tankimine
        double summa = arvutaKütuseHind(40);
        System.out.println("Kütuse maksumus oli " + summa + " eurot");

        // Valuutakalkulaator
        double raha = arvutaNaelteks(150);
        System.out.println("150 eurot Suurbritannia naeltest on " + raha + " naela");
    }

    private static double arvutaNaelteks(double eurod) {
        double kurss = 0.88;
        return eurod * kurss;
    }

    private static double arvutaNetopalk(double bruto){
        double tulumaksuvabamin = 654;
        double töötuskindlustus = bruto * 0.016;
        double kogumispension = bruto * 0.02;
        double tulumaks = bruto - tulumaksuvabamin - töötuskindlustus - kogumispension;
        return (bruto - töötuskindlustus - kogumispension - tulumaks);
    }

    private static double arvutaKütuseHind(double liitrid) {
        double kütuseHind = 1.72;
        return kütuseHind * liitrid;
    }

    private static String Kiiruskaamera(int kiirus) {
        if (kiirus > 50) {
            return "Ületab kiirust";
        } else {
            return "Lubatud";
        }
    }

    private static final DecimalFormat df = new DecimalFormat("0.0");
}


