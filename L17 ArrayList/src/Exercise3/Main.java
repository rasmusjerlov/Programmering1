package Exercise3;

public class Main {
    public static void main(String[] args) {
        Team t1 = new Team("A");
        Player player1 = new Player("Esben", 28);
        Player player2 = new Player("Kasper", 30);
        Player player3 = new Player("Emil", 34);
        Player player4 = new Player("Tully", 26);
        t1.addPlayer(player1);
        t1.addPlayer(player2);
        t1.addPlayer(player3);
        t1.addPlayer(player4);
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());
        System.out.println(player4.toString());
        System.out.println("Average team age is: " + t1.calcAverageAge());
        System.out.println("Max score is: " + t1.maxScore());
        System.out.println("Best player(s) is: " + t1.bestPlayers());
        System.out.println("The sum of the score of players above 30 is: " + t1.oldPlayerScore(30));
        System.out.println("The average score of players above 30 is: " + t1.oldPlayerAverage(30));


    }
}
