package model;

import java.util.Scanner;

public  class StuderendeApp {
    public static String arbejde(int alder) {
        String result = "";
        if (alder < 16) {
            result = "Gå i skole - du er jo kun et barn";
        } else if (alder < 20) {
            result = "Nyd din ungdom - og lær at studer";
        } else if (alder == 20) {
            result = "Tag et sabbatår";
        } else if (alder <= 23) {
            result = "Kom igang med datamatikerudannelsen";
        } else if (alder < 30) {
            result = "Tag nu dit studie seriøst";
        } else {
            result = "Arbejd hårdt";
        }
        return result;
    }

    public static String arbejde2(int alder) {
        String result ="Arbejd hårdt";
        if (alder < 16) {
            result = "Gå i skole - du er jo kun et barn";
        }
        if (alder >=16 && alder < 20) {
            result = "Nyd din ungdom - og lær at studer";
        }
        if (alder == 20) {
            result = "Tag et sabbatår";
        }
        if (alder > 20 && alder <= 23) {
            result = "Kom igang med datamatikerudannelsen";
        }
        if (alder >23 && alder < 30) {
            result = "Tag nu dit studie seriøst";
        }
        return result;
    }

    public static String studieAktiv(boolean aktiv, int alder) {
        String result = "";
        if (aktiv) {
            result = "Flittig ";
            if (alder >= 68) {
                result = result + "pensionist";
            }
            else if(alder < 18) {
                result = result + "elev";
            }
        }
        else {
            result = "Ikke aktiv";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Når du er 17 skal du: "+ arbejde(17) );
        System.out.println( "Når du er 20 skal du: "+arbejde(20) );
        System.out.println("Når du er 45 skal du: "+ arbejde(45) );

        System.out.println( "Når du er 17 og aktiv er du: "+studieAktiv(true,17) );
        System.out.println( "Når du er 20 og ikke aktiv er du: "+studieAktiv(false,20) );
        System.out.println("Når du er 45 og aktiv er du: "+ studieAktiv(true, 45) );

        // Kald med input fra tastaturet
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
//        System.out.print("Angiv alder på person: ");
//        int years = input.nextInt();
//
//        System.out.print("Er personen aktiv: ");
//        boolean active = input.nextBoolean();
//
//        System.out.println("Når du er " + years + " skal du: "+ arbejde(years) );
//        System.out.println("Når du er " + years + " og "+ active + " er du: "+studieAktiv(active,years) );

    }
}
