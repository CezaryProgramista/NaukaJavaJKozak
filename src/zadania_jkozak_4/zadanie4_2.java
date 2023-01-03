package zadania_jkozak_4;

import java.util.Scanner;

public class zadanie4_2 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 4.2");
        Scanner scanner = new Scanner(System.in);
        String ciag = scanner.nextLine();
        String pusty = "";
        for (int i = ciag.length() - 1; i >= 0; i--) {
            pusty = pusty + ciag.charAt(i);
        }
        System.out.println(pusty);
    }
}