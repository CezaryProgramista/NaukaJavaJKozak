package zadania_jkozak_5;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie5_14 {
    public static void main(String[] args) {
        System.out.println("zadanie jkozak 5.14");
        System.out.println("podaj text");
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        System.out.println("podaj text 2 ");
        String text2 = scanner.nextLine();
        System.out.println(isAnagram(text1, text2));
    }

    public static boolean isAnagram(String text1, String text2) {

        boolean anagram = false;
        text1 = text1.replaceAll("\\s", "");
        text2 = text2.replaceAll("\\s", "");
        if (text1.length() != text2.length()) {
            return anagram;
        }
        char[] tab1 = text1.toLowerCase().toCharArray();
        char[] tab2 = text2.toLowerCase().toCharArray();
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        String tekstsort1 = new String(tab1);
        String tekstsort2 = new String(tab2);
        if (tekstsort1.equals(tekstsort2)){
            anagram = true;
        }
        return anagram;
    }
}
