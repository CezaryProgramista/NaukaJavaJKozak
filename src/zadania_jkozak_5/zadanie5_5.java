package zadania_jkozak_5;


import java.util.Scanner;

public class zadanie5_5 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak5.5");
        System.out.println();
        System.out.println("podaj tekst");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("podaj prefix");
        String prefix = scanner.nextLine();
        System.out.println(startsWith(text, prefix));
    }

    static public boolean startsWith(String text, String prefix) {
        boolean included;
        if (text.startsWith(prefix))
            included = true;
        else
            included = false;
        return included;
    }

}
