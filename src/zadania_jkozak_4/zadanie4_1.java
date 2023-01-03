package zadania_jkozak_4;

import java.util.Scanner;

public class zadanie4_1 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 4.1");
        Scanner scanner = new Scanner(System.in);
        String ciagZnakow = scanner.nextLine();
        int dlugoscZnaku = ciagZnakow.length();
        char ostatniZnak = ciagZnakow.charAt(dlugoscZnaku - 1);
        String[] tabicaZnakow = ciagZnakow.split(String.valueOf(ostatniZnak));
        System.out.println("liczb¹ ostatniego znaku w podanym ci¹gu jest : " + tabicaZnakow.length);
    }
}
