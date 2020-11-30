package algoritmische_mathe.Praktika.Praktikum3;

import java.util.Scanner;

public class GanzeZahlen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("a");
        int a = sc.nextInt();

        System.out.println("b");
        int b = sc.nextInt();

        int r = a % b;
        int k = a / b;

        System.out.println(r);
        System.out.println(k);

        System.out.println(k * b + r);

    }

}
