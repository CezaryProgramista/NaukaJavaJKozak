package zadania_jkozak_1;

import java.util.Scanner;

public class zadanie1_1 {
    public static void main(String[] args) {

        System.out.println("zadanie 1.1 konwersja celsjisza na farenhajty");
        System.out.println("podaj temperature");
        Scanner daneUzytkownika = new Scanner(System.in);
        double tempCelsjusz = daneUzytkownika.nextDouble();
        System.out.println(tempCelsjusz);
        double tempFarenheit =  tempCelsjusz* 1.8 + 32;
        System.out.println("temperatura w farenhajtach bedzie:");
        System.out.println(tempFarenheit);

    }
}