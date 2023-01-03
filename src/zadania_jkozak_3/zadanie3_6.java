package zadania_jkozak_3;

import java.util.Scanner;

public class zadanie3_6 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak3.6 [zapis znaku modu³u przedstawiony " +
                "jest przed kropk¹ dla lepszej czytelnosci tak jak w przyk³adzie jkozak]");
        System.out.println("modu³ 1 liczby musi byc wiekszy od drugiego");
        int liczba1;
        int znakLiczby1;
        int znakLiczby2;
        int liczba2;
        int cyfraLiczby1;
        int cyfraLiczby2;
        int licznikPetli = 0;
        int znakSumy = 0;
        int dlugoscWiekszejLiczby;
        int[] tablica = new int[32];
        int[] tablica2 = new int[32];
        int[] tablicaSuma = new int[32];
        Scanner scanner = new Scanner(System.in);
        System.out.println("dej znak liczby 1 = liczba ujemna 0 = liczba dodatnia");
        znakLiczby1 = scanner.nextInt();
        System.out.println("dej 1 liczbe binarno zapis ZM");
        liczba1 = scanner.nextInt();
        int liczba1length = String.valueOf(liczba1).length();
        for (int i = 0; i < liczba1length; i++) {
            cyfraLiczby1 = liczba1 % 10;
            liczba1 = liczba1 / 10;
            tablica[i] = cyfraLiczby1;
        }
        for (int i = 0; i < liczba1length; i++) {
            System.out.print(tablica[i]);
        }
        System.out.println();
        System.out.println("dej znak 2 liczby");
        znakLiczby2 = scanner.nextInt();
        System.out.println("dej 2 liczbe binarno zapis ZM");
        liczba2 = scanner.nextInt();
        int liczba2length = String.valueOf(liczba2).length();
        for (int j = 0; j < liczba2length; j++) {
            cyfraLiczby2 = liczba2 % 10;
            liczba2 = liczba2 / 10;
            tablica2[j] = cyfraLiczby2;
        }
        for (int j = 0; j < liczba2length; j++) {
            System.out.print(tablica2[j]);
        }
        System.out.println();
        System.out.println();
        //        ------------------------------------------DODAWANIE-------------------------------------
        if (znakLiczby1 == 1 && znakLiczby2 == 1 || znakLiczby1 == 0 & znakLiczby2 == 0) {
            dlugoscWiekszejLiczby = Math.max(liczba1length, liczba2length);
            for (int i = 0; i < dlugoscWiekszejLiczby; i++) {

                if (tablica[i] == 0 && tablica2[i] == 0) {
                    tablicaSuma[i] = 0;
                }
                if (tablica[i] == 1 && tablica2[i] == 0) {
                    tablicaSuma[i] = 1;
                }
                if (tablica2[i] == 1 && tablica[i] == 0) {
                    tablicaSuma[i] = 1;
                }
                if (tablica[i] == 1 && tablica2[i] == 1) {
                    tablicaSuma[i] = 0;
                    i++;
                    tablicaSuma[i] = 1;
                    licznikPetli++;
                }
                licznikPetli++;
            }
            if (znakLiczby1 == 0 && znakLiczby2 == 0) {
                System.out.print(znakSumy + ".");
            }
            if (znakLiczby1 == 1 && znakLiczby2 == 1) {
                System.out.print(znakSumy + 1 + ".");
            }
            if (znakLiczby1 == 1 && znakLiczby2 == 0) {
                System.out.print(znakLiczby1 + ".");
            }
            for (int i = licznikPetli - 1; i >= 0; i--) {
                System.out.print(tablicaSuma[i]);
            }
        }
        if (znakLiczby1 == 0 && znakLiczby2 == 1) {
            System.out.print(znakSumy + ".");
            dlugoscWiekszejLiczby = Math.max(liczba1length, liczba2length);
            for (int i = 0; i < liczba2length; i++) {
                tablicaSuma[i] = tablica[i] - tablica2[i];
                if (tablica[i] == 0 && tablica2[i] == 1) {
                    tablicaSuma[i] = 1;
                    tablicaSuma[i]++;
                }
                if (tablica[i] == 1 && tablica2[i] == 0) {
                    tablicaSuma[i] = 0;
                    tablicaSuma[i]++;
                }
            }
            for (int i =0; i<dlugoscWiekszejLiczby; i++){
                System.out.print(tablicaSuma[i]);
            }
        }
    }
}
//wpisaæ elementy liczb do tablicy a i b
// dodawac po iteracji petli
//jak przeniesieniesc bit
// znaki modu³u nie biora udzia³u w dzia³aniach
//0+0 to 0
//1+0 = 1
// 1+1= 0 z przeniesieniem na nastepny bit +1
// tablica [i]
// i0 i1 i2 i3 i4 i5 i6 i7 i8 i9
// [1][0][1][0]
// tablica2 [j]
// i0 i1 i2 i3 i4 i5 i6 i7 i8 i9
// [1][0][1][1][1]