package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_4 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 5.4");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println();
        String wynik = flipCase(text);
        System.out.println(wynik);

    }

    private static String flipCase(String text) {
        char[] znaki = text.toCharArray();
        StringBuilder test = new StringBuilder();
        for (char znak : znaki) {
            //System.out.println((int) znak);
            if (znak > 96 && znak < 123) {
                znak -= 32;
            } else if (znak > 64 && znak < 91) {
                znak += 32;
            }
            test.append(znak);
        }
        return test.toString();
    }
}
