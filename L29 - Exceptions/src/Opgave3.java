import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Opgave3 {
    private ArrayList<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        File fileIn = new File("/Users/rasmusjerlov/Desktop/Opgave2.txt");

        try {
            Scanner scan = new Scanner(fileIn);
            while (scan.hasNext()) {
                int n = Integer.parseInt(scan.nextLine()) * 2;
                System.out.println(n);
            }
            scan.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
