package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.application.Application;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Deltager d1 = Controller.createDeltager("Rasmus", "128321", "Dansk", false,
                false, Rolle.PRIVAT);
        Hotel h1 = Controller.createHotel("Den Hvide Svane", "88888888", 1050);
        Hotel h2 = Controller.createHotel("Hotel Phønix", "88888888", 700);
        Hotel h3 = Controller.createHotel("Pension Tusindfryd", "88888888", 500);
        Konference k1 = Controller.createKonference(LocalDate.of(2023, 8, 4),
                LocalDate.of(2023, 8, 6), "Aarhus Universitet", "Miljø og forbrug", 1500);
        Udflugt udflugt = Controller.createUdflugt("Byrundtur i Odense", "I morgen", "Odense Rådhus", 250, k1);
        Tilmelding t1 = k1.createTilmelding(1, LocalDate.of(2023, 8, 3),
                LocalDate.of(2023, 8, 9), d1);
        k1.addHotel(h1);
        k1.addHotel(h2);
        k1.addHotel(h3);
        t1.setHotel(h1);

        Konference k2 = Controller.createKonference(LocalDate.of(2023, 5, 18),
                LocalDate.of(2023, 5, 20),
                "Odense Universitet", "Hav og Himmel", 1500);
        Udflugt u1 = Controller.createUdflugt("Egeskov", "19/5/2023", "Egeskov", 75, k2);
        Udflugt u2 = Controller.createUdflugt("Trapholt Museum, Kolding", "20/5/2023",
                "Trapholt Museum", 200, k2);
        Deltager d2 = Controller.createDeltager("Peter Sommer", "12312312", "Dansk", false,
                true, Rolle.PRIVAT);
        Tilmelding t2 = k2.createTilmelding(1, k2.getStart(), k2.getSlut(), d2);
        t2.addUdflugt(u1);
        t1.addUdflugt(u2);
        k2.addHotel(h2);
        h1.createTilkøb("WiFi", 50);
        h2.createTilkøb("Wifi", 75);
        h3.createTilkøb("Morgenmad", 100);

        Application.launch(GUI.class);
    }
}
