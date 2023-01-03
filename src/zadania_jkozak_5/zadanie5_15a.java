package zadania_jkozak_5;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie5_15a {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 5.15");
        System.out.println("wprowadz tekst");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        System.out.println((Arrays.toString(htmlColor(color))));
    }

    public static int[] htmlColor(String color) {
        int bufor=0;
        int bufor1;
        int decimal;
        int[] tab1 = new int[3];
        String[] tab = color.split("");
        for (int i = 0; i < tab.length; i++) {
            if (i == 0 || i == 2 | i == 4) {
                bufor = Integer.parseInt(tab[i], 16);
                if (bufor > 0) {
                    bufor = bufor * 16;
                }
            }
            if (i == 1) {
                bufor1 = Integer.parseInt(tab[i], 16);
                decimal = bufor + bufor1;
                tab1[0] = decimal;

            }
            if (i == 3) {
                bufor1 = Integer.parseInt(tab[i], 16);
                decimal = bufor + bufor1;
                tab1[1] = decimal;

            }
            if (i == 5) {
                bufor1 = Integer.parseInt(tab[i], 16);
                decimal = bufor + bufor1;
                tab1[2] = decimal;

            }
            decimal = 0;
        }
        return tab1;
    }
}