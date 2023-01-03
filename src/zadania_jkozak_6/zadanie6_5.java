package zadania_jkozak_6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie6_5 {
    public static void main(String[] args) throws IOException {
        System.out.println("zadanie j.kozak6.5");
        String emeryci = "emeryciwsad.txt";
        emetytura(emeryci);

    }

    public static void emetytura(String emeryci) throws IOException {
        int wiekEmerytalnyM = 65;
        int wiekEmerytalnyK = 60;
        String emeryciK = "kobiety.txt";
        String emeryciM = "mezczyzni.txt";
        String[] tablica;
        File plik = new File(emeryci);
        FileWriter zapisK = new FileWriter(emeryciK);
        FileWriter zapisM = new FileWriter(emeryciM);
        Scanner scanner = new Scanner(plik);
        while (scanner.hasNext()) {
            String daneEmeryta = scanner.nextLine();
            tablica = daneEmeryta.split(" ");
            if (tablica[2].equals("M")) {
                int wiekM = Integer.parseInt(tablica[3]);
                int emerytura = wiekEmerytalnyM - wiekM;
                if (wiekM > wiekEmerytalnyM) {
                    zapisM.write(tablica[1] + " " + tablica[0] + " jest na emeryturze");
                } else {
                    zapisM.write(tablica[1] + " " + tablica[0] + " " + emerytura);
                    zapisM.write("\n");
                }
            } else {
                int wiekK = Integer.parseInt(tablica[3]);
                int emerytura = wiekEmerytalnyK - wiekK;
                if (wiekK > wiekEmerytalnyK) {
                    zapisK.write(tablica[1] + " " + tablica[0] + " jest na emeryturze");
                } else {
                    zapisK.write(tablica[1] + " " + tablica[0] + " " + emerytura);
                    zapisK.write("\n");
                }
            }
        }
        zapisM.close();
        zapisK.close();
    }
}
