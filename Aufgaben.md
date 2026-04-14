## Arbeitsbereich für Programmieraufgaben ##

* verwende eine Programmiersprache deiner Wahl. Wenn du magst, gerne Java.
* die Tips sind gültig für die Programmiersprache Java

### Aufgabe 1 ###
Schreibe ein Programm, welches
* den Inhalt von `text.txt` einliest und
* die Anzahl der in `text.txt` enthaltenen Wörter ausgibt

Tips:
* das Einlesen einer Textdatei kannst du über einen `FileInputStream` realisieren (https://www.w3schools.com/java/java_fileinputstream.asp)
* einem `Scanner` (https://www.baeldung.com/java-scanner) kannst du einen `FileInputStream` auf eine Datei übergeben, der Scanner gibt dir dann auf Anforderung (Methode `next`) immer das nächste erkannte Wort
* versuche die Wörter in einer Schleife anzufordern


import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream
                ("/Users/leopold.breitkopf/praktikum-lb-programmieren/text.txt"));
        int count = 0;

        while (sc.hasNext()){
            sc.next();
            count++;
        }
        System.out.println("Wörter: " + count);
    }
}


* sollten Wörter: 1495 sein
