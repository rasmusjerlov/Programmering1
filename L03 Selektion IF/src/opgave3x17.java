import java.util.Scanner;
import java.util.Random;

public class opgave3x17 {

    public static String rockPaperScissors(int number) {
        String cpuS = "";
        String pS = "";
        Random random = new Random();
        int cpuNumber = random.nextInt(3);
        if (cpuNumber == 0) {
            cpuS = "rock";
        }
        if (cpuNumber == 1) {
            cpuS = "paper";
        }
        if (cpuNumber == 2) {
            cpuS = "scissors";
        }

        if (number == 0) {
            pS = "rock";
        }
        if (number == 1) {
            pS = "paper";
        }
        if (number == 2) {
            pS = "scissors";
        }


        if (cpuS.equals(pS)) {
            return "You and CPU both chose " + pS + " It's a draw.";
        } else if (pS.equals("rock") && cpuS.equals("scissors")) {
            return "You chose rock and CPU chose scissors. You won!";
        } else if ((pS.equals("paper") && cpuS.equals("rock"))) {
            return "You chose paper and CPU chose rock. You won!";
        } else if (pS.equals("scissors") && cpuS.equals("paper")) {
            return "You chose scissors and CPU chose paper. You won!";
        } else if (cpuS.equals("rock") && pS.equals("scissors")) {
            return "You chose scissors and CPU chose rock. You lost";
        } else if (cpuS.equals("paper") && pS.equals("rock")){
            return "You chose rock and CPU chose paper. You lost";
        } else if (cpuS.equals("scissors") && pS.equals("paper")) {
            return "You chose paper and CPU chose scissors. You lost";
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pick 0 for rock, 1 for paper or 2 for scissors: ");
        int number = input.nextInt();
        System.out.println(rockPaperScissors(number));


    }


}
