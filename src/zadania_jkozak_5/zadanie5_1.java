package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_1 {
    public static int silnia = 1;

    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.1");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println("Iteracyjnie");
        System.out.println(funkcjaIteracyjna(liczba));
        System.out.println("Rekurencyjnie");
        System.out.println(funkcjaRekurencyjna(liczba));
    }

    //-------------------------wersja iteracyjna-------------------------------
    private static int funkcjaIteracyjna(int liczba) {

        for (int i = 1; i <= liczba; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    //--------------------------wersja rekurencyjna-------------------------------
    public static int funkcjaRekurencyjna(int liczba) {
        if (liczba <= 1) {
            return 1;
        }
        else {
            return liczba *= funkcjaRekurencyjna(liczba - 1);

        }
    }
}



