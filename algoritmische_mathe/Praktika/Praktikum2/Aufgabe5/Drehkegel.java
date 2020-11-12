package algoritmische_mathe.Praktika.Praktikum2.Aufgabe5;

import java.util.Scanner;

public class Drehkegel {

    private static double calc_r(double d) {
        return d / 2;
    }

    private static double calc_s(double r, double h) {
        return Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
    }

    private static double calc_G(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    private static double calc_M(double r, double s) {
        return Math.PI * r * s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kegelhöhe h=");
        double kegelhöhe = sc.nextDouble();

        System.out.print("Durchmesser der Grundfläche d=");
        double durchmesser = sc.nextDouble();

        // Flächeninhalt der Kegeloberfläche

        double radius = calc_r(durchmesser);
        double O = calc_M(radius, calc_s(radius, kegelhöhe)) + calc_G(radius);

        System.out.println("Flächeninhalt der Kegeloberfläche= " + O);

        // Kegelvolumen

        double V = (calc_G(radius) * kegelhöhe) / 3;

        System.out.println("Kegelvolumen= " + V);

    }

}
