package zadania_jkozak_6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie6_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("zadanie j.kozak 6.3");
        String nazwaPliku = "text2.txt";
        String nazwaPlikuWyj = "tekstwyjsciowy.txt";
        sumujIZapisz(nazwaPliku, nazwaPlikuWyj);

    }

    public static void sumujIZapisz(String nazwaPliku, String nazwaPlikuWyj) throws IOException {


        File plik = new File(nazwaPliku);
        File plikwyjs = new File(nazwaPlikuWyj);
        StringBuilder text = new StringBuilder();
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            text.append(scanner.nextLine());
        }
        String text2 = text.toString();
        int cyfry;
        int suma = 0;

        System.out.println(text2);
        String[] tablicaZnakow = text2.split("\\D");

        for (String znaki : tablicaZnakow) {
            if (znaki.isEmpty()) {
                znaki = "0";
            }
            cyfry = Integer.parseInt(znaki);
            suma = cyfry + suma;
        }
        suma = suma + 1;
        if (!plikwyjs.exists()) {
            PrintWriter zapis = new PrintWriter(nazwaPlikuWyj);
            zapis.println("suma liczb w tekscie wynosi : " + suma);
            zapis.close();
        } else {
            StringBuilder textwyj = new StringBuilder();
            scanner = new Scanner(plikwyjs);
            while (scanner.hasNext()) {
                textwyj.append(scanner.nextLine());
            }
            String znaki2 = "";
            String tekstwyjs = textwyj.toString();
            String[] tablicaZnakow2 = tekstwyjs.split("\\D");
            for (String znaki : tablicaZnakow2){
                znaki2 = znaki;
            }
            int znaki3 = Integer.parseInt(znaki2);
            suma = znaki3 + suma;
            PrintWriter zapis2 = new PrintWriter(nazwaPlikuWyj);
            zapis2.println("suma liczb w w tekscie wynosi : " + suma);
            zapis2.close();
        }
    }
}
