import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Opgave6 {

//    public static void main(String[] args) {
//        max();
//    }

    public static void randomtal() {
        String file = "Opgave6.txt";
        try {
            PrintWriter printWriter = new PrintWriter(file);

            // indlaes antal tal i filen
            Scanner scan = new Scanner(System.in);
            System.out.print("Antal tal der skal skrives i filen: ");
            int antal = scan.nextInt();

            // skab tilfældige tal generator Random
            Random rnd = new Random();

            // generer og skriv de tilfældige tal
            for (int n = 1; n <= antal; n++) {
                int tal = rnd.nextInt(10000);
                printWriter.println(tal);
            }

            // skriv filen
            printWriter.close();
            scan.close();

            System.out.println("Filen er lavet");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int max() throws IOException {
        String file = "Opgave 6.txt";
        try {
            PrintWriter printWriter = new PrintWriter(file);
            Scanner scan = new Scanner(System.in);
            System.out.print("Antal tal der skal skrives i filen: ");
            int antal = scan.nextInt();

            // skab tilfældige tal generator Random
            Random rnd = new Random();

            // generer og skriv de tilfældige tal
            for (int n = 1; n <= antal; n++) {
                int tal = rnd.nextInt(10000);
                printWriter.println(tal);
            }

            // skriv filen
            printWriter.close();
            scan.close();

            System.out.println("Filen er lavet");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        int max = Integer.MIN_VALUE;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                int n = scanner.nextInt();
                if (n > max) {
                    max = n;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Number is wrong format");
        } finally {
            return max;
        }
    }
}

