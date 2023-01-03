package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_7 {
    public static void main(String[] args) {
        System.out.println("zadanie 2.7");
        System.out.println("podaj znak wype³nienia");
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.nextLine().charAt(0);
        System.out.println("podaj lidzbe linni");
        int x = scanner.nextInt();
        System.out.println("podaj lidzbe spacji");
        int y = scanner.nextInt();
        System.out.println("podaj d³ugosc boku");
        int a = scanner.nextInt();
        System.out.println("podaj szerokosc boku");
        int b = scanner.nextInt();
        for (int l = 1; l < x; l++)
            System.out.println();
//            for (int k = 0; k < y; k++) {
//                System.out.print("_");
//            }

        for (int i = 0; i < a; i++) {
            if (i > 0)
                System.out.println(" ");
            for (int m = 0; m < y; m++) {
                System.out.print("_");
            }
            for (int j = 0; j < b; j++) {

                System.out.print(znak);
            }
        }
    }
}


// x to lidzba linni
// y to lidzba spacji
// a to d³ugosc boku po x
// b to szerokosc boku po y