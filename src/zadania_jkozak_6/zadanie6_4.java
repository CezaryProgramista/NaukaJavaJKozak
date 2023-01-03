package zadania_jkozak_6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie6_4 {


    public static void main(String[] args) throws IOException {
        System.out.println("zadanie j.kozak 6.4");
        System.out.println("podaj szyfr");
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        String fileToEncrypt = "dane.txt";
        String fileEncrypted = "_dane.txt";
        encrypting(fileToEncrypt, move);
        decrypting(fileEncrypted, move);
    }

    public static void encrypting(String fileToEncrypt, int move) throws IOException {
        int zero;
        File file = new File(fileToEncrypt);

        FileReader readingFile = new FileReader(file);
        StringBuilder chainText = new StringBuilder();
        String fileEncrypted = "_dane.txt";
        FileWriter fileWrite = new FileWriter(fileEncrypted);
        while ((zero = readingFile.read()) != -1) {
            if (zero == 32 || zero == 13 || zero == 10) {
                char character = (char) zero;
                chainText.append(character);
            } else if (zero + move > 122) {
                char character = (char) (96 + (move - 122 + zero));
                chainText.append(character);
            } else if (zero + move < 97) {
                char character = (char) (123 - ((-move) + (zero - 97)));
                chainText.append(character);
            } else {
                char character = (char) (zero + move);
                chainText.append(character);
            }
        }
        fileWrite.write(chainText.toString());
        fileWrite.close();
    }

    public static void decrypting(String fileEncrypted, int move) throws IOException {

        int zero;
        File file = new File(fileEncrypted);
        move = -move;
        String fileDecrypted2 = "dane_test.txt";
        FileReader readingFile = new FileReader(file);
        StringBuilder chainText = new StringBuilder();
        FileWriter fileWrite = new FileWriter(fileDecrypted2);
        while ((zero = readingFile.read()) != -1) {
            if (zero == 32 || zero == 13 || zero == 10) {
                char character = (char) zero;
                chainText.append(character);
            } else if (zero + move > 122) {
                char character = (char) (96 + (move - 122 + zero));
                chainText.append(character);
            } else if (zero + move < 97) {
                char character = (char) (125 - ((-move) + (zero - 97)));
                chainText.append(character);
            } else {
                char character = (char) (zero + move);
                chainText.append(character);
            }
        }
        fileWrite.write(chainText.toString());
        fileWrite.close();
    }
}



