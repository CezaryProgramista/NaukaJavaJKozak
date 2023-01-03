package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_11 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 2.10");
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                System.out.println("to jest liczba z³ozona");
            } else {
                System.out.println("to jest liczba pierwsza");
            }
        }
    }
}

