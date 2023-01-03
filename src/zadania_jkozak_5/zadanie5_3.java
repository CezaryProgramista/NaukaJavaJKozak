package zadania_jkozak_5;

import java.util.Scanner;

public class zadanie5_3 {
    public static void main(String[] args) {
        System.out.println("zadanie j.kozak 5.3");
        System.out.println("podaj tekst");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char z = 'z';
        System.out.println(strpos(text , z));
    }
    public static int strpos (String text , char z){
    int znak = text.indexOf(z);
    return znak;
    }
}
