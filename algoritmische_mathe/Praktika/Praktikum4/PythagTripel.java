package algoritmische_mathe.Praktika.Praktikum4;

import java.util.Scanner;

public class PythagTripel {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int a = 1; a < n; a++) {
            for (int b = a; b < n; b++) {
                for (int c = b; c < n; c++) {

                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {

                        System.out.println(a + "," + b + "," + c);

                    }
                }
            }

        }

    }

}
