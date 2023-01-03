package zadania_jkozak_6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie6_3a {
    public static void main(String[] args) throws IOException {
        System.out.println("zadanie j.kozak6.3a");
        String nazwaPliku = "tekst.txt";
        sumujIZapisz(nazwaPliku);
    }

    public static void sumujIZapisz(String nazwaPliku) throws IOException {
        int suma = 0;
        if (!new File(nazwaPliku).exists()) {
            PrintWriter zapis = new PrintWriter(nazwaPliku);
            zapis.println(1);
            zapis.close();
        }
        Scanner scanner = new Scanner(new File(nazwaPliku));
        while (scanner.hasNext()) {
            String tekst = scanner.nextLine();
            int liczby = Integer.parseInt(tekst);
            suma = suma + liczby;
        }
        System.out.println(suma);
    }
}
