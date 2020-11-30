package algoritmische_mathe.Praktika.Praktikum3;

import java.util.Scanner;

public class BahnMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double km_preis = 0.3;

        /**
         * Einlesen der Daten
         */
        System.out.println("Farhpreisermittlung");
        System.out.println("Wieviele Reisende?");
        int num_travelers = sc.nextInt();
        if (num_travelers < 1) {
            System.out.println("Es muss mind 1 Fahrer sein");
            System.exit(1);
        }

        System.out.println("Wieviel Tage bis zum Fahrtantritt?");
        int num_days = sc.nextInt();

        System.out.println("Wieviele Kilometer?");
        int km = sc.nextInt();
        if (km < 1) {
            System.out.println("Es müssen KM gefahren werden");
            System.exit(1);
        }

        /**
         * Berechnung Einzelfahrpreis (mit Rabatt von Tage zur Fahrt)
         */
        double singlepreis = km * km_preis;
        if (num_days > 0 && num_days < 3) {
            singlepreis -= singlepreis * 0.1;
        } else if (num_days < 7) {
            singlepreis -= singlepreis * 0.25;
        } else if (num_days >= 7) {
            singlepreis -= singlepreis * 0.4;
        }

        /**
         * Berechnung des Gesamtpreis und abzug des Mitfahrer-Rabatt
         */
        double gesamtpreis = 0.0;
        for (int i = 0; i < num_travelers; i++) {

            double travelers_preis = singlepreis;

            if (i == 1) {

                travelers_preis -= singlepreis * 0.3;

            } else if (i > 1) {
                travelers_preis -= singlepreis * 0.5;
            }

            gesamtpreis += travelers_preis;

        }

        System.out.println("Der Fahrpreis beträgt " + Math.round(gesamtpreis * 100.00) / 100.00 + " Taler.");

    }
}