package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_3 {
    public static void main(String[] args) {
        System.out.println("zadanie jvkozak2.3");
        System.out.println("daj dodatnia lidzbe bedziem potegowac");
        Scanner szukajka = new Scanner(System.in);
        int liczbaMax = szukajka.nextInt();
        for (int i = 0; i < liczbaMax; i++ ) {
            int potega = (int) Math.pow(2, i);

            if (potega < liczbaMax) {

            }
            if (potega>=liczbaMax){
                break;
            }
            System.out.println(potega);
        }
        }
    }


// lidzby potegi czy dla 2 do potegi zeby wyszlo 2 wychodzi 2do1
// 2do 2=i4
//2do 3=i8
//2do4=16
//2do5=32
//2 do 6 = 64

//Niepotrzebne dodanie miliona wywo³añ, a printowanie tylko tego co trzeba.. brak jakieœ brake czy coœ