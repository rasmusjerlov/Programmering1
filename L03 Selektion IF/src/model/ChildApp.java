package model;

public class ChildApp {

   // Metoden skal returenre en tekststreng der beskriver hvilken institution et barn skal gå i, afhængig af barnets alder.
   // Reglerne for dette kan ses på opgavedsedlen

   // OPGAVE 4
    public static String institution(int age) {
        String result ="";
        if (age == 0){
            result = "Barnet burde fortsat være derhjemme.";
        }
        else if (age <=2){
            result = " i vuggestue.";
        }
        else if (age <=5){
            result = " i børnehave.";
        }
        else if (age <=16){
            result = " i folkeskole.";
        }
        else if (age > 17){
            result = " være gået ud af folkeskolen.";
        }
        return result;
    }


    // Metoden skal returenre en tekststreng der beskriver hvilket gymnastikhold et barn skal gå på, afhængig af barnets alder og køn.
    // Reglerne for dette kan ses på opgavedsedlen

    // OPGAVE 5
    public static String team(boolean isBoy, int age) {
        String result = "";
        if (isBoy == false && age < 8) {
            result = "on the Tumbling Girls team";
        }
        if (isBoy == false && age >= 8) {
            result = "on the Springy Girls team";
        }
        if (isBoy == true && age < 8){
            result = "on the Young Cubs team";
        }
        if (isBoy == true && age >= 8){
            result = "on the Cool Boys team";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Et barn på 5 skal" + institution(5));
        System.out.println("En dreng på 8 skal" + team(true,8) + institution(8));
        System.out.println("En pige på 14 skal" + team(false, 14) + institution(14));
        System.out.println("En pige på 3 skal" + team(false, 3) + institution(3));
        System.out.println("En dreng på 19 skal" + team(false, 19) + institution(19));
        System.out.println("A girl at the age of 3 should be " + team(false, 3));
        System.out.println("A girl at the age of 12 should be " + team(false, 12));
        System.out.println("A boy at the age of 6 should be " + team(true, 6));
        System.out.println("A boy at the age of 14 should be " + team(true, 14));

    }
}
