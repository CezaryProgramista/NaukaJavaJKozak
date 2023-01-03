package zadania_jkozak_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadanie6_1 {



    public static void main(String[] args) throws FileNotFoundException {

         String text = "";
         int[] tabInt = new int[3];

        System.out.println("zadanie j.kozak 6.1");
        File plik = new File("C:\\Users\\krzys\\Desktop\\test.txt");
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            text += scanner.nextLine();
        }

        int[] result = liczZnakiSlowa(text, tabInt);
        for(int a : result){
            System.out.println(a);
        }
    }

    public static int[] liczZnakiSlowa(String text, int[] tabInt) {
        //System.out.println(text);
        String text1 = text.trim();
        String[] tab = text1.split(" ");
        int dlugoscZnakow = text1.length() - tab.length + 1;
        tabInt[0] = dlugoscZnakow;

        int count = 1;
        String text2 = text.trim();
        if (text2.endsWith(".")) {
            count -= 1;
        }
        String[] spaces = text2.split("");

        for (String s : spaces) {

            boolean isWhiteSpace = s.matches("\\W");
            if (isWhiteSpace) {
                count++;
            }
        }
        tabInt[1] = count - 1;
        int wordy = 0;
        String text3 = text.trim();
        String[] words = text3.split("\\W");
        wordy += words.length;
//        for (String w : words) {
//            wordy++;
//        }
        tabInt[2] = wordy;
        return tabInt;
    }
}

