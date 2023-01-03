package zadania_jkozak_1;

import java.util.Scanner;

public class zadanie1_2 {
    public static void main(String[] args) {
        System.out.println("zadanie 1.2 jkozak podaj 3 lidzby ca³kowite");
        System.out.println("podaj 1 lidzbê");
        Scanner scanner = new Scanner(System.in);
        int lidzbaWprowadzana = scanner.nextInt();
        System.out.println("podaj 2 lidzbê");
        int lidzbaWprowadzana2 = scanner.nextInt();
        System.out.println("podaj 3 lidzbe");
        int lidzbaWprowadzana3 = scanner.nextInt();
        int[] tablica = new int[3];

        tablica[0] = lidzbaWprowadzana;
        tablica[1] = lidzbaWprowadzana2;
        tablica[2] = lidzbaWprowadzana3;
        int i1 = lidzbaWprowadzana + lidzbaWprowadzana2 + lidzbaWprowadzana3;
        int i2 = lidzbaWprowadzana - lidzbaWprowadzana2 - lidzbaWprowadzana3;
        int lidzbaMax = 0;
        int lidzbaMin = 0;

        for (int i = 0; i < tablica.length; i++) {
            if (i == 0) {
                lidzbaMax = tablica[i];
                lidzbaMin = tablica[i];
            }
            if (tablica[i] < lidzbaMax) {
                lidzbaMax = tablica[i];
            }
            if (tablica[i] > lidzbaMin) {
                lidzbaMin = tablica[i];

            }


        }
        System.out.println(lidzbaMax + " " + lidzbaMin);
    }
}
