package zadania_jkozak_5;


import java.util.Scanner;

public class zadanie5_8 {
    public static void main(String[] args) {
        System.out.println("zadanie 5.8 j.kozak");
        Scanner scanner = new Scanner(System.in);
        String chain = scanner.nextLine();
        System.out.println(wordCount(chain));

    }

    public static int wordCount(String chain) {

        int count = 1;
        chain = chain.trim();
        if (chain.endsWith(".")) {
            count -= 1;
        }
        String[] spaces = chain.split("");

        for (String s : spaces) {

            boolean isWhiteSpace = s.matches("\\W");
            if (isWhiteSpace) {
                count++;
            }
        }
        return count;
    }

}
