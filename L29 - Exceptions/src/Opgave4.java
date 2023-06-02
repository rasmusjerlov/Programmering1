import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Opgave4 {
    public static void main(String[] args) {
        File file = new File("Opgave4.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int n = 0; n < 100; n++) {
                if (n % 2 == 1 && n > 0 && n < 100) {
                    int tal = n;
                    printWriter.println(n);
                }
            }
            printWriter.close();
            System.out.println("Filen er lavet");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
