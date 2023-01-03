package zadania_jkozak_5;

import java.util.Scanner;


public class zadanie5_9 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.9");
        Scanner scanner = new Scanner(System.in);
        String chain = scanner.nextLine();
        for (int i = 0; i < tab(chain).length; i++) {
            System.out.println(tab(chain)[i]);
        }
    }

    public static String[] tab(String chain) {
        String[] tabs = chain.split("\\W");
        return tabs;
    }
}
