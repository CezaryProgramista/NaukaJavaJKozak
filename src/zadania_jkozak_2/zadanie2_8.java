package zadania_jkozak_2;

import java.util.Scanner;

public class zadanie2_8 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 2.8");
        System.out.println("dej liczbe ga³ezi choinki");
        Scanner scanner = new Scanner(System.in);
        int floors = scanner.nextInt();
        int a = floors ;
        for (int i = 0; i < floors; i++) {

            if (i > 0) {
                System.out.println();

            }

            for (int l = 0; l <= a; l++) {
                if (l==0){
                    a--;
                }
                System.out.print(" ");

            }


            for (int j = 0; j < i + 1; j++) {
                if (j == 0) System.out.print("*");

                else {
                    System.out.print("*" + "*");
                }


            }
        }
    }
}


// w pierwszym przejsciu pêtli rysuj 1 *;
// dodawaj 2 gwiazdki w kazdym kolejnym przejsciu petli int i
//problemacja jest w pierwszym przejsciu petli l tj. l=0 w ostatnim przejsciu pêtli i tj i =floors -1 gdzie
//niechce by drukowa³o spacje a drukuje.