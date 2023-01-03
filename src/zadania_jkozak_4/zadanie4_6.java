package zadania_jkozak_4;

import java.util.Scanner;

public class zadanie4_6 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 4.6");
//        char[] tablicaZnakow = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'q', 'w',
//                'x', 'y', 'z'};
        System.out.println("podaj tekst");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        System.out.println("podaj przesuniecie");
        int szyfr = scanner.nextInt();
        char[] tablicaTekstu = tekst.toCharArray();

        System.out.print("tekst wprowadzony : " + tekst);
        System.out.println();
        for (int i = 0; i < tekst.length(); i++) {
            if (tablicaTekstu[i] == 32) {
                System.out.print(tablicaTekstu[i]);
            }
            if (tablicaTekstu[i] + szyfr > 122) {
                tablicaTekstu[i] = (char) (96 + (szyfr - 122 + tablicaTekstu[i]));
                System.out.print(tablicaTekstu[i]);
            }
            if (tablicaTekstu[i] + szyfr < 97) {
                tablicaTekstu[i] = (char) (123 -((-szyfr )+ ( tablicaTekstu[i]-97)));
                System.out.print(tablicaTekstu[i]);
            }
            // odejmuje od 97 -1 chce zeby to bylo 122.
            else {
                tablicaTekstu[i] = (char) (tablicaTekstu[i] + szyfr);
                System.out.print(tablicaTekstu[i]);
            }
        }
    }
}
