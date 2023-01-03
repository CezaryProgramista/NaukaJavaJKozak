package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_11 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.11");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text");
        String text = scanner.nextLine();
        System.out.println("podaj pocz¹tek wyciêcia");
        int start = scanner.nextInt();
        System.out.println("podaj koniec wyciêcia");
        int end = scanner.nextInt();
        System.out.println(strcut(text, start, end));
    }

    public static String strcut(String text, int start, int end) {
        end = start + end ;
        String zmieniony = text.substring(start, end);
        return text.replaceFirst(zmieniony, "");
    }
}
