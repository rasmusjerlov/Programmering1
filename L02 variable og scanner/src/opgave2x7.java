import java.util.Scanner;

public class opgave2x7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //bed brugeren om input
        System.out.println("Indtast antal minutter: ");
        int minutter = input.nextInt();
//        System.out.println("På " + minutter);
        int minutterPerDag = 60 * 24;
        int minutterPerÅr = minutterPerDag * 365;
        int dageTilbage = minutter % minutterPerÅr;
        int år = minutter / minutterPerÅr;
        int dage = dageTilbage / minutterPerDag;
        System.out.println("Minutterne " + minutter + " giver " + år + " år og " + dage + " dage");
    }
}
