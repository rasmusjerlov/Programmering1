import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {
        File file = new File("Opgave5.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indtast tal");
            int n = 0;
            while (n != -1) {
                n = scanner.nextInt();
                printWriter.println(n);
                System.out.println("Indtast næste tal. -1 for at stoppe");
            }
            printWriter.close();
            scanner.close();
            System.out.println("Filen er lavet");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
