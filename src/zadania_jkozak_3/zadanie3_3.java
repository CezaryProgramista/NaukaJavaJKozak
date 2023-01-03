package zadania_jkozak_3;

import java.util.Random;

public class zadanie3_3 {
    public static void main(String[] args) {
        System.out.println("Zadanie jkozak TABLICE");
        int max = 0;
        int min = 0;
        int[] tablicaMax = new int[5];
        int[] tablicaMin = new int[5];
        int[][] tablica = new int[5][5];
        Random lidzby = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                tablica[i][j] = lidzby.nextInt(11) - 5;

                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {

                if (i == 0) {
                    tablicaMax[j] = tablica[j][i];
                    tablicaMin[j] = tablica[j][i];
                }
                if (tablica[i][j] < tablicaMin[j]) {
                    tablicaMin[j] = tablica[i][j];
                }
                if (tablica[i][j] > tablicaMax[j]) {
                    tablicaMax[j] = tablica[i][j];
                }
            }
        }
        for (int i = 0; i < tablicaMin.length; i++) {
            System.out.println(tablicaMin[i] + " " + tablicaMax[i]);
        }
    }}



