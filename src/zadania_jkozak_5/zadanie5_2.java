package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_2 {
    public static int suma = 0;
    public static int liczba1 = 0;
    public static int liczba2 = 0;

    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.2");
        System.out.println("podaj liczbe ci¹gu ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println("iteracyjnie");
        System.out.println(liczba + " liczba ci¹gu fibonacciego to : " + fibonacciIntercyjnie(liczba));
        System.out.println("rekurencyjnie");
        System.out.println(liczba + " liczba ci¹gu fibonacciego to : " + fibonacciRekurencyjnie(liczba));
    }
///////////////////////CI¥G FIBONACIEGO 1.2.3.5.8.13.21.34.55.89///////////////
//  LICZBA TO WYRAZ CI¥GU interacja     0.1.2.3.4.5 .6 .7 .8 .9



    public static int fibonacciIntercyjnie(int liczba) {


        for (int i = 0; i <= liczba; i++) {
            if (i == 0)
                liczba2 = 1;
            suma = 1;
            if (i == 1) {
                liczba1 = 2;
                suma = 2;
            }
            if (i > 1) {
                suma = liczba1 + liczba2;
                liczba2 = liczba1;
                liczba1 = suma;
            }
        }
        return suma;
    }

    public static int fibonacciRekurencyjnie(int liczba) {
        if (liczba == 0) {

            return 1;
        }
        if (liczba == 1) {

            return 2;
        } else {
            return fibonacciRekurencyjnie(liczba - 1) + fibonacciRekurencyjnie(liczba - 2);
        }
    }
}
