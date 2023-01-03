package zadania_jkozak_4;

import java.util.Scanner;

public class zadanie4_3 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 4.3");
        System.out.println("wielkosc liter nie ma znaczenia w tym zadaniu");
        Scanner scanner = new Scanner(System.in);
        String ciag = scanner.nextLine();
        ciag = ciag.replace(" ", "");
        System.out.println(ciag);
        String pusty = "";
        for (int i = ciag.length() - 1; i >= 0; i--) {
            pusty = pusty + ciag.charAt(i);
        }
        System.out.println(pusty);
        if (ciag.equalsIgnoreCase(pusty)){
            System.out.println("to jest palindrom");
        }
        else {
            System.out.println("to nie jest palindrom");
        }
    }
}

