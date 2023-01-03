package zadania_jkozak_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie6_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("zadanie j.kozak 6.2");
        String nazwaPlikWe = "test.txt";
        String nazwaPlikWy = "twojStara.txt";
        String slowo = "egzamin";
        szukaj(nazwaPlikWe, nazwaPlikWy, slowo);
    }

    private static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws FileNotFoundException {

        File plik = new File(nazwaPlikWe);
        PrintWriter zapis = new PrintWriter(nazwaPlikWy);
        String text;
        Scanner scanner = new Scanner(plik);

        for (int i = 1; scanner.hasNext(); i++) {
            text = scanner.nextLine();
            if (text.contains(slowo)) {
                zapis.println(i + ": " + text);

            }
        }
        zapis.close();
    }
}
