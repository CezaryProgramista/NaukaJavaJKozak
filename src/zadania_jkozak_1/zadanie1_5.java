package zadania_jkozak_1;

import java.util.Scanner;

public class zadanie1_5 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 1.5 zakupy ratalne");
        boolean dane = true;
        while (dane) {
            System.out.println("wprowadz cene produktu ");


            Scanner scanner = new Scanner(System.in);
            double productPrice = scanner.nextDouble();
            double productPrice1 = productPrice * 1.025;
            double productPrice2 = productPrice * 1.05;
            double productPrice3 = productPrice * 1.1;
            double productPriceMin = 100;
            double productPriceMax = 10000;
            System.out.println("wprowadz lidzbe rat");
            int numberRate = scanner.nextInt();
            int numberRateMin = 6;
            int numberRateMax = 48;
            int i = 0;
            if (numberRate > numberRateMax || numberRate < numberRateMin) {
                System.out.println("niepoprawne dane");
            }
            if (numberRate >= 13 && numberRate <= 24)
//            for (i = 13; i <= 24; i++)
//                if (numberRate == i)
            {

                double finalPrice2 = Math.round(productPrice2 / numberRate * 100.0) / 100.0;
                System.out.println(finalPrice2);
                dane = false;
            }
            if (numberRate > 25 && numberRate <= numberRateMax) {
                double finalPrice3 = Math.round(productPrice3 / numberRate * 100.0) / 100.0;
                System.out.println(finalPrice3);
                dane = false;
            }
            if (numberRate < 13 && numberRate >= numberRateMin) {
                double finalPrice1 = Math.round(productPrice1 / numberRate * 100.0) / 100.0;
                System.out.println(finalPrice1);
                dane = false;
            }

        }
    }
}

