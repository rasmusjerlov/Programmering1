import java.util.Scanner;

public class opgave2 {
    public static String sign(int tal) {
        String result = "";
        if (tal > 0) {
            result = tal + " er positivt";
        } else if (tal == 0) {
            result = tal + "er 0";
        } else if (tal < 0) {
            result = tal + " er negativt";
        }

        return result;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast vilkårligt tal: ");
        int tal = input.nextInt();
        System.out.println(sign(tal));

    }
}
