package algoritmische_mathe.Praktika.Praktikum1.Aufgabe1;
import java.util.Scanner;


public class fehler {
    public static void main(String[] args) {
        int a; // hier fehlte das ;
        int b;

        System.out.println("Geben Sie drei natürlichen Zahlen ein"); // System war klein

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();

        int d = a+b-c;

        System.out.println("a+b-c="+d);

    }

}