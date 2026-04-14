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

