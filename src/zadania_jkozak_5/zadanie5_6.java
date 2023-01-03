package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_6 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.6");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(stringToInt(text));
    }

    public static int stringToInt(String text) {
        StringBuilder bolid = new StringBuilder();
        StringBuilder bolid2 = new StringBuilder();
        int pusty;
        int pusty1;
        char[] tab = text.toCharArray();
        boolean eliczba = false;
        int mnoznik = 10;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 101 && tab[0] != 101) {
                if (tab[i + 1] > 47 && tab[i + 1] < 58) {
                    tab[i] = (char) mnoznik;
                    eliczba = true;
                }
                if (tab[i + 1] == 45) {
                    eliczba = false;
                }
            }
        }
        boolean isFirstNumber = true;
        int i = 0;
        for (char s : tab) {
            if (i == 0) {
                i++;
                if (s == 45) {
                    bolid.append(s);
                } else if(s > 47 && s < 58) {
                    bolid.append(s);
                }else {
                    break;
                }
            } else if (s > 47 && s < 58) {
                if (isFirstNumber) {
                    bolid.append(s);

                } else {
                    bolid2.append(s);

                }
            } else if (s == 10) {
                isFirstNumber = false;

            } else {
                break;
            }
        }
        pusty = Integer.parseInt(bolid.toString());
        pusty1 = Integer.parseInt(bolid2.toString());
        if (eliczba) {
            pusty = (int) (pusty * Math.pow(10, pusty1 - 1));
        }
        return pusty;
    }
}
