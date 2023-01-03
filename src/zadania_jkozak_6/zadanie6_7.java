package zadania_jkozak_6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class zadanie6_7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Zadanie j.kozak6.7");
        String nazwaPlikuWsad = "plik wsadowy.txt";
//        String nazwaPlikuWsad = "alfabet.txt";
        czytaniePliku(nazwaPlikuWsad);
    }

    public static void czytaniePliku(String nazwaPlikuWsad) throws IOException {
        File plikWsad = new File(nazwaPlikuWsad);
        FileReader odczyt = new FileReader(plikWsad);
        char znak;
        int[] tab = new int[26];
        int gwiazdek = 50;

        int max = 0;

        while (odczyt.ready()) {
            znak = (char) Character.toLowerCase(odczyt.read());
            int a = znak;
            if (a > 96 && a < 123) {
                tab[a - 97]++;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        for (int i = 0; i < tab.length; i++) {
            char letter = (char) (i + 97);
            int liczbaGwiazdek = tab[i] * gwiazdek / max;
            int liczbaSpacji = gwiazdek - liczbaGwiazdek;
            System.out.print(letter + " :");
            for (int j = 0; j < liczbaGwiazdek; j++) {
                System.out.print("*");
            }
            if (tab[i] == max) {
                System.out.println(" " + tab[i]);
            } else {
                for (int l = 0; l < liczbaSpacji; l++) {
                    System.out.print(" ");
                }
                System.out.println(" " + tab[i]);
            }
            System.out.println();
        }
    }
}

