package zadania_jkozak_1;

import java.util.Scanner;

public class zadanie1_3 {


    public static void main(String[] args) {
        double minBmi = 18.5;
        double maxBmi = 24.9;
        System.out.println("zadanie jkozak 1.3 wspó³czynnik BMI");
        Scanner userData = new Scanner(System.in);
        System.out.println("podaj wage w kg");
        double wage = userData.nextDouble();
        System.out.println("podaj wzrost w metrach");
        double hight = userData.nextDouble();
        double hight2 = hight * hight;

        double bmi = (wage / hight2);
        double finalBmi = Math.round(bmi * 100.0) / 100.0;
        System.out.println("twoje Bmi wynosi: " + finalBmi);



        if (finalBmi >minBmi && finalBmi <maxBmi) {
            System.out.println("waga prawid³owa");
        }
        if (finalBmi < minBmi) {
            System.out.println("masz niedowage");
        } if (finalBmi >maxBmi){
            System.out.println("masz nadwage");
        }


    }}
