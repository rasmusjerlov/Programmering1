import java.util.Scanner;

public class opgave3 {
    public static String sign(int num1, int num2, int num3) {
        Scanner input = new Scanner(System.in);
        int n1 = num1;
        int n2 = num2;
        int n3 = num3;
        String result = "";
        if (n1 < n2 && n2 < n3) {
            result = n1 + " " + n2 + " " + n3 + " er voksende";
        } else if (n1 > n2 && n2 > n3) {
            result = n1 + " " + n2 + " " + n3 + " er aftagende";
        } else {
            result = " er hverken eller";
//        if ((n1 > n2 && n3 > n2) || (n1 < n2 && n3 < n1 && n3 < n2)) {
//            result = n1 + " " + n2 + " " + n3 + " er hverken eller";
//        }
        }
            return result;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast første tal");
        int tal = input.nextInt();
        System.out.println("Indtast andet tal");
        int tal2 = input.nextInt();
        System.out.println("Indtast tredje tal");
        int tal3 = input.nextInt();
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        int n3 = input.nextInt();
        System.out.println(sign(tal, tal2, tal3));
//
//        if (n1 < n2 && n2 < n3) {
//            System.out.println(n1 + " " + n2 + " " + n3 + " er voksende");
//        }
//        if (n1 > n2 && n2 > n3) {
//            System.out.println(n1 + " " + n2 + " " + n3 + " er aftagende");
//        }
//        if ((n1 > n2 && n3 > n2) || (n1 < n2 && n3 < n1 && n3 < n2)) {
//            System.out.println(n1 + " " + n2 + " " + n3 + " er hverken eller");
//        }
        }
    }

