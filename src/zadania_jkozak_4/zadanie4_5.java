package zadania_jkozak_4;

import java.util.Scanner;

public class zadanie4_5 {
    public static void main(String[] args) {
        int nawiasOtwarty = 0;
        int nawiasZamkniety = 0;
        System.out.println("zadanie j.kozak 4.5");
        Scanner scanner = new Scanner(System.in);
        String ciag = scanner.nextLine();
        String[] tablicaCiagow = ciag.split("");
        for (int i = 0; i < ciag.length(); i++) {
            if (tablicaCiagow[i].matches("[(]")) {
                nawiasOtwarty++;
            }
            if (tablicaCiagow[i].matches("[)]")) {
                nawiasZamkniety++;
            }
        }
        if (nawiasOtwarty == nawiasZamkniety) {
            System.out.println("ok");
        } else {
            System.out.println("b³êdne sparowanie nawiasów");
        }
    }
}
