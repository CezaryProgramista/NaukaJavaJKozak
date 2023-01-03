package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_4 {
    public static void main(String[] args) {
        int liczba;
        int reszta;
        int[] tablica = new int[32];
        int i = 0;
        boolean pierwszy = true;
        int licznikPetli = 0;
        int bitZnaku;
        System.out.println("zadanie jkozak 3.4");
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();

        System.out.println("tu wyskakuja dzielenia i reszty z dzieleñ do pomocy");
        if (liczba < 0) {
            bitZnaku = 1;
        } else {
            bitZnaku = 0;
        }
        while (liczba >= 1) {

            if (pierwszy) {
                reszta = liczba % 2;
                tablica[i] = reszta;
                System.out.println(liczba + " " + reszta);
                pierwszy = false;
                i++;
                licznikPetli++;
            }
            if (liczba > 1) {
                liczba = liczba / 2;
                reszta = liczba % 2;
                tablica[i] = reszta;
                i++;
                licznikPetli++;
                System.out.println(liczba + " " + reszta);
            }

            if (liczba == 1) {
                break;
            }
        }
        if (liczba > 0) {
            tablica[i] = bitZnaku;
            i++;

        }

        while (liczba < 0) {

            if (pierwszy) {
                reszta = -liczba % 2;
                tablica[i] = reszta;
                System.out.println(liczba + " " + reszta);
                pierwszy = false;
                i++;
                licznikPetli++;
            }
            if (liczba < -1) {
                liczba = liczba / 2;
                reszta = -liczba % 2;
                tablica[i] = reszta;
                i++;
                licznikPetli++;
                System.out.println(liczba + " " + reszta);
            }

            if (liczba == -1) {
                break;
            }

        }
        if (liczba < 0) {
            tablica[i] = bitZnaku;
            i++;

        }
        if (liczba == 0) {
            tablica[i] = liczba;
            licznikPetli++;
        }
        System.out.println("gotowe rozwiazanie z wykorzystaniem tablicy ");
        if (liczba > 0) {
            for (i = licznikPetli; i >= 0; i--) {
                if (i == licznikPetli) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
        if (liczba < 0) {
            for (i = licznikPetli; i >= 0; i--) {
                if (i == licznikPetli) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
    }
}

//1100100
