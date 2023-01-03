package zadania_jkozak_2;


import java.util.Scanner;

public class zadanie2_9 {
    public static void main(String[] args) {
        long suma = 0;
        long digit;
        long dzielne = 0;
        long nieDzielne = 0;
        double sumaDzielnych = 0;
        double sumaNieDzielnych = 0;

        System.out.println("zadanie 2.9 jkozak");
        System.out.println("daj liczbe");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int length = String.valueOf(number).length();

        for (int i = 0; i < length; i++)
        {
            digit = number % 10;
            number = number / 10;

            if (digit % 2 == 0)
            {
                dzielne++;
                sumaDzielnych = sumaDzielnych + digit;
            }
            else
            {
                nieDzielne++;
                sumaNieDzielnych = sumaNieDzielnych + digit;
            }
            suma = suma + digit;

        }
        double sredniaDzielnych;
        sredniaDzielnych = sumaDzielnych / dzielne;
        double sredniaNiedzielnych = sumaNieDzielnych / nieDzielne;
        double stosunekHueHue = sredniaDzielnych / sredniaNiedzielnych;
        System.out.println("suma cyfr w twojej liczbie to " + suma);
        System.out.println("srednie liczb podzielnych przez 2 i nie podzielnych przez 2 wynosi");
        System.out.println(sredniaDzielnych + " " + sredniaNiedzielnych);
        System.out.println("stosunek srednich parzysta do nie prarzystej wynosi");
        System.out.println(stosunekHueHue);
    }
}


