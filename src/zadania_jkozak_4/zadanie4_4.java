package zadania_jkozak_4;

import java.util.Scanner;

public class zadanie4_4 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 4.4");
        int cyfry;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        String ciagZnakow = scanner.nextLine();
        String[] tablicaZnakow = ciagZnakow.split("");
        for (String znaki : tablicaZnakow) {
            if (znaki.matches("[0-9]")) {
                cyfry = Integer.parseInt(znaki);
                suma = cyfry + suma;
            }
        }
        System.out.println("suma cyfr w ci¹gu = " + suma);
    }
}
