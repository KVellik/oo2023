/*Harmooniline keskmine

* Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu läbimise kiirused (km/h), väljundiks nende kahe kilomeetri läbimise keskmine kiirus.
* Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused kogumina (km/h). Väljasta kogu selle tee läbimise keskmine kiirus.
* Kilomeetriste lõikude läbimiste keskmised kiirused loetakse sisse failist, kogu teekonna läbimise keskmine kiirus salvestatakse faili.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        double kiirus1 = 22.0;
        double kiirus2 = 66.0;

        keskmineKiirus(kiirus1, kiirus2);

        double[] kiirused = {50.0, 70.0, 85.7, 123.0};
        double[] pikkused = {1.0, 1.0, 1.0, 1.0};

        double keskmine = keskmisedKiirused(kiirused, pikkused);
        System.out.println("Tee läbimiskiirus on " + keskmine + " km/h");


        File file = new File("C:\\Users\\marti\\Desktop\\oo2023\\oo2023\\05_kontrolltoo1\\KT1_1\\keskmised_kiirused.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<Double> fail_kiirused = new ArrayList<Double>();
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                fail_kiirused.add(scanner.nextDouble());
            } else {
                scanner.next();
            }
        }
        scanner.close();

        double sum = fail_kiirused.stream().mapToDouble(Double::doubleValue).sum();
        double keskmine2 = sum / fail_kiirused.size();
        //System.out.println("Failis olevate kiiruste keskmine on " + keskmine2);

        File uusFail = new File("uus_keskmised_kiirused.txt");
        PrintWriter printWriter = new PrintWriter(uusFail);
        printWriter.println("Uus keskmine on " + keskmine2 + " km/h");
        printWriter.close();
    }

    private static void keskmineKiirus(double kiirus1, double kiirus2) {
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

