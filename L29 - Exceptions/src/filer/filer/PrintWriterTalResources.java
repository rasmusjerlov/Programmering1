package filer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class PrintWriterTalResources {

    public static void main(String[] args) {

        String fileName = "tal.txt";
		//	String fileName = "C:/MAD/Ud/tal7.txt";
		//	String fileName = "C:\\MAD\\Workspace\\IntelliJJava\\PRO1_22S\\tal.txt";

        try (Scanner scan = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(fileName)) {

            // indlaes antal tal i filen
            System.out.print("Antal tal der skal skrives i filen: ");
            int antal = scan.nextInt();

            // skab tilfældige tal generator Random
            Random rnd = new Random();

            // generer og skriv de tilfældige tal
            for (int n = 1; n <= antal; n++) {
                int tal = rnd.nextInt(10000);
                printWriter.println(tal);
            }

            System.out.println("Filen er lavet");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
