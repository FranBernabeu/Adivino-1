package adivino;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Adivino {

    public static void main(String[] args) {
        int n = 0, cont = 0;
        int x =ThreadLocalRandom.current().nextInt(10, 50);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x) {
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: " + cont);
        sc.close();
    }

}
