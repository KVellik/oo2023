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
        int kiirus_hetkel = scanner.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Distant sihtkohta (km): ");
        int distants = scanner.nextInt();
        float Teekond = (distants / kiirus_hetkel);
        System.out.println("Sihtkohta jõudmiseks kulub " + Teekond + " tundi.");

    }

    private static String Kiiruskaamera(int kiirus) {
        if (kiirus > 50) {
            return "Ületab kiirust";
        } else {
            return "Lubatud";
        }
    }
}


