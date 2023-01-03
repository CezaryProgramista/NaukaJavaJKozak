package zadania_jkozak_5;


import java.util.Arrays;
import java.util.Scanner;

public class zadanie5_15 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 5.15");
        System.out.println("wprowadz tekst");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        System.out.println((Arrays.toString(htmlColor(color))));
    }

    public static int[] htmlColor(String color) {
        int[] tabdziesietne = new int[6];
        int[] tablicaszesnast = new int[3];
        int a = 10;
        int b = 11;
        int c = 12;
        int d = 13;
        int e = 14;
        int f = 15;
        int pomocniczy;
        char[] tab = color.toCharArray();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 65) {
                tabdziesietne[i] = a;
            }
            if (tab[i] == 66) {
                tabdziesietne[i] = b;
            }
            if (tab[i] == 67) {
                tabdziesietne[i] = c;
            }
            if (tab[i] == 68) {
                tabdziesietne[i] = d;
            }
            if (tab[i] == 69) {
                tabdziesietne[i] = e;
            }
            if (tab[i] == 70) {
                tabdziesietne[i] = f;
            }
            if (tab[i] > 47 && tab[i] < 58) {
                pomocniczy = Integer.parseInt(String.valueOf(tab[i]));
                tabdziesietne[i] = pomocniczy;
            }
        }
        pomocniczy = 0;
        for (int i = 0; i < tabdziesietne.length; i++) {
            if (i == 0 || i == 2 || i == 4 ) {
                pomocniczy = tabdziesietne[i] * 16;
            }
            if (i == 1) {
                pomocniczy = pomocniczy + tabdziesietne[i];
                tablicaszesnast[0] = pomocniczy;
                pomocniczy = 0;
            }
            if (i == 3 ) {
                pomocniczy = pomocniczy + tabdziesietne[i];
                tablicaszesnast[1] = pomocniczy;
                pomocniczy = 0;
            }
            if (i==5){
                pomocniczy = pomocniczy + tabdziesietne[i];
                tablicaszesnast[2] = pomocniczy;
                pomocniczy = 0;
            }
        }


        return tablicaszesnast;
    }
}
