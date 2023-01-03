package zadania_jkozak_5;


import java.util.Scanner;

public class zadanie5_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst");
        String text = scanner.nextLine();
        System.out.println("podaj kolejnosc");
        int[] tab = new int[text.length()];
        int pomocniczy;
        int licznik = 0;
        int jeden = 1;

        while (licznik <= text.length()) {
            for (int i = 0; i < text.length(); i++) {
                boolean isUsed = false;
                pomocniczy = scanner.nextInt();
                for (int used : tab) {
                    if (used == pomocniczy) {
                        isUsed = true;
                    }
                }
                if (pomocniczy <= text.length() && !isUsed) {
                    tab[i] = pomocniczy;

                    System.out.println("dobra liczba  " + jeden);
                    jeden++;
                } else if (pomocniczy > text.length() || isUsed) {
                    System.out.println("z�y nie liczy sie");
                    i--;
                    licznik--;
                }
                licznik++;
            }
            if (licznik == tab.length) {
                break;
            }
        }
        String[] tabS = text.split("");
        for (int i = 0; i < tabS.length; i++) {
            System.out.print(tabS[tab[i] - 1]);
        }
    }
}
