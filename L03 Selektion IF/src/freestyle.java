import java.util.Scanner;

public class freestyle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvad giver 2+5?");
        int resultat = input.nextInt();
        if ( resultat % 2 == 0) {
            System.out.println(resultat + " er et lige tal.");
        }
        else {
            System.out.println(resultat + " er et ulige tal.");
            }
        }
    }
