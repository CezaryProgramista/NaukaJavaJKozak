package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_5 {
    public static void main(String[] args) {
        int liczbaZU1;
        int liczbaZU2;
        int reszta;
        int[] tablica = new int[32];
        int[] tablica2 = new int[32];
        int i = 0;
        int j = 0;
        boolean pierwszy = true;
        boolean drugi = true;
        int licznikPetli = 0;
        int licznikPetli2 = 0;
        int bitZnaku;
        System.out.println("zadanie jkozak 3.5");
        System.out.println("kropka po bicie znaku jest umowna dla lepszego odczytu");
        Scanner scanner = new Scanner(System.in);
        liczbaZU1 = scanner.nextInt();
        liczbaZU2 = liczbaZU1 + 1;
        if (liczbaZU1 < 0) {
            bitZnaku = 1;
        } else {
            bitZnaku = 0;
        }
        System.out.println("to sa dzielniki dla sprawdzenia");
        while (liczbaZU1 >= 1) {

            if (pierwszy) {
                reszta = liczbaZU1 % 2;
                tablica[i] = reszta;
                System.out.println(liczbaZU1 + " " + reszta);
                pierwszy = false;
                i++;
                licznikPetli++;
            }
            if (liczbaZU1 > 1) {
                liczbaZU1 = liczbaZU1 / 2;
                reszta = liczbaZU1 % 2;
                tablica[i] = reszta;
                i++;
                licznikPetli++;
                System.out.println(liczbaZU1 + " " + reszta);
            }
            if (liczbaZU1 == 1) {
                break;
            }
        }
        if (liczbaZU1 > 0) {
            tablica[i] = bitZnaku;
            i++;
        }
        while (liczbaZU1 < 0) {

            if (pierwszy) {
                reszta = -liczbaZU1 % 2;
                if (reszta == 0) {
                    reszta = reszta + 1;
                } else {
                    reszta = 0;
                }
                tablica[i] = reszta;
                System.out.println(liczbaZU1 + " " + reszta);
                pierwszy = false;
                i++;
                licznikPetli++;
            }
            if (liczbaZU1 < -1) {
                liczbaZU1 = liczbaZU1 / 2;
                reszta = -liczbaZU1 % 2;
                if (reszta == 0) {
                    reszta = reszta + 1;
                } else {
                    reszta = 0;
                }
                tablica[i] = reszta;
                i++;
                licznikPetli++;
                System.out.println(liczbaZU1 + " " + reszta);
            }

            if (liczbaZU1 == -1) {
                break;
            }
        }
        // ----------------------------------------------------------ZAPIS ZU2--------------------------------------
        while (liczbaZU2 < 0) {

            if (drugi) {
                reszta = -liczbaZU2 % 2;
                if (reszta == 0) {
                    reszta = reszta + 1;
                } else {
                    reszta = 0;
                }
                tablica2[j] = reszta;
                System.out.println(liczbaZU2 + " " + reszta);
                drugi = false;
                j++;
                licznikPetli2++;
            }
            if (liczbaZU2 < -1) {
                liczbaZU2 = liczbaZU2 / 2;
                reszta = -liczbaZU2 % 2;
                if (reszta == 0) {
                    reszta = reszta + 1;
                } else {
                    reszta = 0;
                }
                tablica2[j] = reszta;
                j++;
                licznikPetli2++;
                System.out.println(liczbaZU2 + " " + reszta);
            }

            if (liczbaZU2 == -1) {
                break;
            }
        }
//// ----------------------------------------------------------------------------------------ZAPIS ZU2--------------


        if (liczbaZU1 < 0 || liczbaZU2 <0) {
            tablica[i] = bitZnaku;
            tablica2[j] = bitZnaku;
            j++;
            i++;

        }
        if (liczbaZU1 == 0 || liczbaZU2 ==0) {
            tablica[i] = liczbaZU1;
            tablica2[j] = liczbaZU1;
            licznikPetli2++;
            licznikPetli++;
        }

        System.out.println("gotowe rozwiazanie z wykorzystaniem tablicy  zapis ZU1");
        if (liczbaZU1 > 0) {
            for (i = licznikPetli; i >= 0; i--) {
                if (i == licznikPetli) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
        if (liczbaZU1 < 0) {
            for (i = licznikPetli; i >= 0; i--) {
                if (i == licznikPetli) {
                    System.out.print(tablica[i] + ".");
                } else {
                    System.out.print(tablica[i]);
                }
            }
        }
        System.out.println();
        System.out.println("zapis ZU2");
        if (liczbaZU2 < 0) {
            for (j = licznikPetli2; j >= 0; j--) {
                if (j == licznikPetli2) {
                    System.out.print(tablica2[j] + ".");
                } else {
                    System.out.print(tablica2[j]);
                }
            }
        }

    }
}
//zapis uzupe³nienie do jednego to
//dla liczb dodatnich taki sam jak w binarnych
//dla liczb ujemnych negacja liczby dodatniej
// negacja to zamienienie bitu o wartosci 0 na 1
// a bitu o wartosci 1 na 0.
// 5 = 0.101
// -5 = 1.010
//-99 = 0011100
//99 = 1100011
//-6 = 1.001
// zapis zu2
//-5 = 1.010 + 1
//-5 = 1.011
// -6 = 1.010
// -7 = 1.001
// dodawanie zu2
//1+1 = 0 z przeniesieniem na nastêpny bit
// 1+0 = 1
// 0+1 = 1
// do ostatniego i w petli dodaje 1