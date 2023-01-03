package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_9 {
    public static void main(String[] args) {
        boolean wzgledniePierwszy;
        int liczba;
        int nwd ;
        int liczbaA;
        int liczbaB;
        int resztaDzielenia;
        int[] resztaTab = new int[2];
        System.out.println("zadanie jkozak3.9");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe naturaln¹ wieksz¹ od 0");
        liczba = scanner.nextInt();
        boolean[][] tablica = new boolean[liczba][liczba];
        for (int i = 1; i <= liczba; i++) {
            for (int j = 1; j <= liczba; j++) {
                if (i > j) {
                    liczbaA = i;
                    liczbaB = j;
                } else {
                    liczbaA = j;
                    liczbaB = i;
                }
                resztaDzielenia = liczbaA % liczbaB;
                resztaTab[0] = resztaDzielenia;
                if (resztaDzielenia == 0) {
                    nwd = liczbaB;
                    if (nwd == 1) {
                        wzgledniePierwszy = true;
                        tablica[i-1][j-1] = wzgledniePierwszy;
                    }
                    if (nwd > 1) {
                        wzgledniePierwszy = false;
                        tablica[i-1][j-1] = wzgledniePierwszy;
                    }
                } else {
                    while (resztaDzielenia != 0) {
                        liczbaA = liczbaB;
                        liczbaB = resztaDzielenia;
                        resztaDzielenia = liczbaA % liczbaB;
                        nwd = resztaDzielenia;
                        resztaTab[1] = resztaTab[0];
                        resztaTab[0] = nwd;
                        if (resztaTab[1] == 1) {
                            wzgledniePierwszy = true;
                            tablica[i-1][j-1] = wzgledniePierwszy;

                        }
                        else{
                            wzgledniePierwszy = false;
                            tablica[i-1][j-1] = wzgledniePierwszy;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < liczba; i++) {
            if (i>0){
                System.out.println();
            }
            for (int j = 0;j <liczba; j++){

                if(tablica[i][j] == true){
                    System.out.print("+");
                }else {
                    System.out.print(".");
                }
            }
        }
    }
}


//najwiekszy wspólny dzielnik
//dzielimy liczbe A/B z reszt¹
//jesli reszta =0 to NWD = b
//        jesli reszta != 0
//        to B=A
//        reszta =B
//        i dzielimy do póki reszta nie bedzie 0
//        ostatne nie zerowe dzielenie jego reszta bedzie dzielnikiem
//jesli NWD jest wieksze od 1 to false"."
//jesli = 1 to true "+"
//
