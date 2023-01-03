package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_4 {

    public static void main(String[] args) {
        System.out.println("zadanie jvkozak 2.4");
        int suma = 0;
        boolean zeroFound = true;
        while (zeroFound) {

            Scanner scanner = new Scanner(System.in);
            int lidzby = scanner.nextInt();

            suma= suma+lidzby;

            if (lidzby == 0) {


                zeroFound = false;
                System.out.println(suma);
            }

        }
    }
}

