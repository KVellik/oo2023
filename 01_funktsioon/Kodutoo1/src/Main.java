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

        int a = 3;
        int b = 100;
        int c = 5;
        int arvutus = arvutus();
        System.out.println(arvutus());


    }

    private static int arvutus() {
        return a*b/c;
    }

    private static String Kiiruskaamera(int kiirus) {
        if (kiirus > 50) {
            return "Ületab kiirust";
        } else {
            return "Lubatud";
        }
    }
}


