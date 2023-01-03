package zadania_jkozak_1;

import java.util.Scanner;

public class zadanie1_4 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1.4 jkozak PODATKI");
        System.out.println("wpisz dochód");
        double progPodatkowy = 85528.00;

        Scanner scanner = new Scanner(System.in);
        double dochod = scanner.nextDouble();
        double nadwyzkaPodatku = dochod - progPodatkowy;
        double podatek1 = dochod * 0.18- 556.02;
        double podatek2 = 14839.02 + nadwyzkaPodatku * 0.32;

        if (dochod<progPodatkowy){
            System.out.println( "podatek do zaplaty : " + podatek1);
        }
        else {
            System.out.println("podatek do zap³aty : " + podatek2);
        }

    }
}