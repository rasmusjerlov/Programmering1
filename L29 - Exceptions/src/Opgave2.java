import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Opgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        File fileIn = new File("/Users/rasmusjerlov/Desktop/Opgave2.txt");

        try {
            Scanner scan = new Scanner(fileIn);
            while (scan.hasNext()) {
                int n = Integer.parseInt(scan.nextLine());
                ints.add(n);
            }
            Collections.reverse(ints);
            System.out.println(ints);
            scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
