import java.util.Scanner;

public class opgave2x23 {
    public static void main(String[] args){
        // Beder brugeren om at indtaste antal km
        System.out.println("Angiv turens distance i kilometer.");
        Scanner input = new Scanner(System.in);
        double kilometer = input.nextDouble();
        // Beder brugeren om at indtaste bilens brændstofforbrug i km/l
        System.out.println("Angiv bilens brændstofforbrug i km/l.");
        // kml betyder kilometer pr. liter
        double kml = input.nextDouble();
        // Beder brugeren om at indtast nuværende brændstofspris i pris pr. liter
        System.out.println("Angiv den nuværende pris i kr. pr. liter.");
        // ppl betyder pris pr liter
        double ppl = input.nextDouble();
        double liter = kilometer / kml;
        // pia betyder pris i alt
        double pia = liter * ppl;
        System.out.println("Den totale pris for rejsen vil være " + pia + " kr.");
    }
}
