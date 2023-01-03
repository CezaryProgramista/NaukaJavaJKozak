package zadania_jkozak_6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie6_6 {
    public static void main(String[] args) throws IOException {
        System.out.println("zadanie j.kozak 6.6");
        String nazwaPlikuIn = "plik testowy.txt";
        String nazwaPlikuOut = "plik testowy.html";
        konwersja(nazwaPlikuIn, nazwaPlikuOut);
    }

    public static void konwersja(String nazwaPlikuIn, String nazwaPlikuOut) throws IOException {
        File plikWsadowy = new File(nazwaPlikuIn);
        int licznik;
        FileWriter zapisPliku = new FileWriter(nazwaPlikuOut);
        Scanner scanner = new Scanner(plikWsadowy);
        boolean isFirst = true;

        while (scanner.hasNext()) {
            String tekst = scanner.nextLine();
            String[] tabSprawdzenie = tekst.split(" ");
            licznik = tabSprawdzenie.length - 1;
            for (int i = 0; i < tabSprawdzenie.length; i++) {
                if (isFirst) {
                    zapisPliku.write("<html><body>\n" + "<table>\n" + "<tr><td>" + tabSprawdzenie[i] + "</td><td>");
                    isFirst = false;
                }
                else if (!scanner.hasNext() && i == tabSprawdzenie.length - 1) {
                    zapisPliku.write(tabSprawdzenie[i] + """
                            </td></tr>
                            </table>
                            </body></html>""");

                }  else if (i == licznik) {
                    zapisPliku.write(tabSprawdzenie[i] + "</td></tr>\n" +
                            "    <tr><td>");
                } else  {
                    zapisPliku.write(tabSprawdzenie[i] + "</td><td>");
                }
            }

        }
        zapisPliku.close();

    }
}
