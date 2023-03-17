/*Harmooniline keskmine

* Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu läbimise kiirused (km/h), väljundiks nende kahe kilomeetri läbimise keskmine kiirus.
* Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused kogumina (km/h). Väljasta kogu selle tee läbimise keskmine kiirus.
* Kilomeetriste lõikude läbimiste keskmised kiirused loetakse sisse failist, kogu teekonna läbimise keskmine kiirus salvestatakse faili.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        keskmineKiirus();

        double[] kiirused = {50.0, 70.0, 85.7, 123.0};
        double[] pikkused = {1.0, 1.0, 1.0, 1.0};

        double keskmine = keskmisedKiirused(kiirused, pikkused);
        System.out.println("Tee läbimiskiirus on " + keskmine + " km/h");


        File file = new File("C:\\Users\\marti\\Desktop\\oo2023\\oo2023\\05_kontrolltoo1\\KT1_1\\keskmised_kiirused.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
        
    }

    private static void keskmineKiirus() {
        double kiirus1 = 22.0;
        double kiirus2 = 66.0;
        int distants = 2;
        double keskmine = (kiirus1 + kiirus2) / distants;
        System.out.println("Kaks kilomeetrit läbitakse keskmiselt " + keskmine + " km/h");
    }

    private static double keskmisedKiirused(double[] kiirused, double[] pikkused) {

        double summa1 = 0.0;
        double summa2= 0.0;
        double keskmised = 0.0;

        for (int i = 0; i < kiirused.length; i++) {
            summa1 += kiirused[i] * pikkused[i];
            summa2 += pikkused[i];
        }
        return summa1 / summa2;
    }
}