package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_10 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 2.10");
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println("dzielnik liczby : ");
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {

                System.out.println(i);
            }

        }

    }
}
