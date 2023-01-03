package zadania_jkozak_3;

import java.util.Random;

public class zadanie3_1 {
    public static void main(String[] args) {

        int lidzbaNajmniejsza = 0;
        int libdzaNajwieksza = 0;
        int sumaTablicy =0;
        int sredniaArytmetyczna;
        int lidzbaZmiennychNiejszychOdSredniej = 0;
        int lidzbaZmiennychWiekszychOdSredniej = 0;


        System.out.println("zadanie 2.3");
        int[] tablica = new int[10];
        Random lidzbaLosowa = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = lidzbaLosowa.nextInt(20) - 10;

        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Intex " + i + ": " + tablica[i]);
        }


        for (int i = 0; i < tablica.length; i++) {
            if (i ==0){
                lidzbaNajmniejsza = tablica[i];
                libdzaNajwieksza = tablica[i];
            }
            if (tablica[i] < lidzbaNajmniejsza) {
                lidzbaNajmniejsza = tablica[i];
            }
            if (tablica[i] > libdzaNajwieksza) {
                libdzaNajwieksza = tablica[i];
            }

        }
        System.out.println("MIN :" + lidzbaNajmniejsza + " " +"MAX :" + libdzaNajwieksza);
        for (int i =0; i < tablica.length; i++){

            sumaTablicy = tablica[i] + sumaTablicy;

        }
        System.out.println(sumaTablicy);
        sredniaArytmetyczna = sumaTablicy / tablica.length;
        System.out.println( "srednia wynosi : " + sredniaArytmetyczna);
        for (int i =0; i < tablica.length; i++){
            if (tablica[i]<sredniaArytmetyczna){
                lidzbaZmiennychNiejszychOdSredniej ++;
            }
            if (tablica[i]>sredniaArytmetyczna){
                lidzbaZmiennychWiekszychOdSredniej ++;
            }
        }
        System.out.println("wiêksze" + " " + lidzbaZmiennychNiejszychOdSredniej);
        System.out.println("mniejsze" + " " + lidzbaZmiennychWiekszychOdSredniej);

        for (int i =tablica.length -1 ; i >= 0; i--){
            System.out.println(tablica[i]);
        }

    }
}


