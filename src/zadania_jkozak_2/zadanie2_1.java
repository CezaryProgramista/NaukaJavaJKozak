package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_1 {
    public static void main(String[] args) {
        System.out.println("zadanie jvkozak 2.1");
        Scanner scanner = new Scanner(System.in);
        boolean goNext = true;
        while (goNext) {
            int a = scanner.nextInt();
            if (a < 0) {
                System.out.println("podaj lidzbe wieksz¹ niz zero");
                goNext = false;
            }
            for (int i = 1; i <= a; i = i + 2) {

                System.out.println(i);
            }
        }
    }
}
// petla while nadmiarowa