package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_2 {
    public static void main(String[] args) {
        System.out.println("zadanie2.2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsz¹ lidzbe");
        int a = scanner.nextInt();
        System.out.println("podaj druga lidzbe");
        int b = scanner.nextInt();
        int c = a;
        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma = suma +i;
        }
        System.out.println(suma);
        suma = 0;
        {
            while (a <= b) {
                suma = suma + a;
                a++;
            }
            System.out.println(suma);
            suma = 0;
        }
        do {
            suma = suma +c;
            c++;
        } while (c<=b);
        System.out.println(suma);

    }
}


