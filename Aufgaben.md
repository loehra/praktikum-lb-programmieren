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
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream
                ("/Users/leopold.breitkopf/praktikum-lb-programmieren/text.txt"));

        int count = 0;
        double tl = 0;
        String lw = "";

        Set<String> words = new TreeSet<>(Collections.reverseOrder());

        while (sc.hasNext()){
            String word = sc.next().replaceAll("[\\p{Punct}„““”»«'']", "");
            if (word.isEmpty()) continue;

            count++;
            tl += word.length();

            if (word.length() > lw .length()) {
                lw  = word;
            }
            words.add(word);
        }

        double dl = (count > 0) ? (tl / count) : 0;

        System.out.println("Wörter: " + count);

        System.out.println("Durchschnittslänge: " + String.format("%.2f", dl));

        System.out.println("Längstes Wort: " + lw );

        System.out.println("Liste:");
        for ( String w : words) {
            System.out.println(w);
        }
    }

}

* sollten Wörter: 1495 sein

### Aufgabe 2 ###
Erweitere dein Programm so, dass es rausfindet, wieviele Zeichen das längste Wort hat

*Längstes Wort: selbstverständlich


### Aufgabe 3 ###
Erweitere dein Programm so, dass es alle vorkommenden Einzelwörter in alphabetisch aufsteigender Reihenfolge ausgibt.
Wenn ein Wort zweimal, dreimal oder mehrfach vorkommt, dann soll die Ausgabe das Wort nur einmal enthalten.

* es kommt zwar eine Liste raus aber Wörter doppeln sich wenn sie Satzzeihen hinter dann haben, dass bekomme ich nicht weg, alles andere macht den Code kaputt

### Aufgabe 4 ###
Basis ist der Stand aus Aufgabe 3. Ändere das Programm so, dass die Liste der Wörter in absteigender Reihenfolge ausgibt.

*Set<String> words = new TreeSet<>(Collections.reverseOrder());


### Aufgabe 5 ###
Ändere dein Programm so ab, dass es alle vorkommenden Zeichenlängen von Einzelwörtern - nicht die Einzelwörter selbst - in alphabetisch aufsteigender Reihenfolge ausgibt.

### Aufgabe 6 ###
Berechne die durchschnittliche Länge alle vorkommenden Wörter.

*Code oben


