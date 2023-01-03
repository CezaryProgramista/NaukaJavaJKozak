package zadania_jkozak_5;


import java.util.Scanner;

public class zadanie5_7 {
    public static void main(String[] args) {
        System.out.println("zadanie 5.7 jkozak");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text");
        String what = scanner.nextLine();
        System.out.println("podaj co chcesz znalezc w tekscie");
        String where = scanner.nextLine();
        System.out.println(starFind(what, where));
        System.out.println(what.indexOf(where));
    }

    public static int starFind(String what, String where) {
        int positionIndex = 0;
        String zmieniony;
        boolean cont = what.contains(where);
        // ustawiam zmiany Stringa where na "!", wczesniej wycinam "!" z what wiec logika zachowana.
        if (what.contains("!")) {
            what = what.replace("!", "#");
        }

        if (where.equals("")) {
            return positionIndex;
        }
        if (cont) {

            String space = "!";
            zmieniony = what.replaceFirst(where, space);
            System.out.println(zmieniony);

            String[] tab = zmieniony.split("");
            for (int i = 0; i < zmieniony.length(); i++) {
                if (tab[i].matches(space)) {
                    positionIndex=i;

                }

            }

        } else {
            positionIndex = -1;
        }
        return positionIndex;

    }
}

//podaj text
//ala ma alaa
//podaj co chcesz znalezc w tekscie
//ala
//10

//znajdujesz ostatni znak w where taki jaki jest pierwszy w what

// w danym przypadku ala ma ala'a' <-

//do poprawy