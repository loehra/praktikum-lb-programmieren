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
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream
                ("/Users/leopold.breitkopf/praktikum-lb-programmieren/text.txt"));

        int count = 0;
        String longestWord = "";

        while (sc.hasNext()){
            String word = sc.next();
            count++;

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Wörter: " + count);
        System.out.println("Längstes Wort: " + longestWord);
    }
}


* sollten Wörter: 1495 sein

### Aufgabe 2 ###
Erweitere dein Programm so, dass es rausfindet, wieviele Zeichen das längste Wort hat

*Längstes Wort: selbstverständlich


### Aufgabe 3 ###
Erweitere dein Programm so, dass es alle vorkommenden Einzelwörter in alphabetisch aufsteigender Reihenfolge ausgibt.
Wenn ein Wort zweimal, dreimal oder mehrfach vorkommt, dann soll die Ausgabe das Wort nur einmal enthalten.

*ich kann keine weiteren imports einfügen, die löschen sich selber raus 
