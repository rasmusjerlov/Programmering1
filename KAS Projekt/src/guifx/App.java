package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.application.Application;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Deltager d1 = Controller.createDeltager("Rasmus", "128321", "Dansk", false, false, Rolle.PRIVAT);
        Hotel h1 = Controller.createHotel("Dangleterre", "213123123", 1500);
        Konference k1 = Controller.createKonference(LocalDate.of(2023, 8, 4),
                LocalDate.of(2023, 8, 6), "Din mor", "Fuck dig", 1500);
        Udflugt udflugt = Controller.createUdflugt("Byrundtur", "I morgen", "Din mor", 250);
        Tilmelding t1 = Konference.createTilmelding(1, LocalDate.of(2023, 8, 3),
                LocalDate.of(2023, 8, 9), d1);
        k1.addHotel(h1);
        t1.setHotel(h1);
        t1.addUdflugt(udflugt);

        Konference k2 = Controller.createKonference(LocalDate.of(2023, 5, 18), LocalDate.of(2023, 5, 20),
                "Odense Universitet", "Hav og Himmel", 1500);
        Hotel h2 = Controller.createHotel("Den Hvide Svane", "1231232", 1250);
        Udflugt u1 = Controller.createUdflugt("Egeskov", "19/5/2023", "Egeskov", 75);
        Udflugt u2 = Controller.createUdflugt("Trapholt Museum, Kolding", "20/5/2023", "Trapholt Museum", 200);
        Deltager d2 = Controller.createDeltager("Peter Sommer", "12312312", "Dansk", false, true, Rolle.PRIVAT);
        Tilmelding t2 = k2.createTilmelding(1, k2.getStart(), k2.getSlut(), d2);
        k2.addUdflugt(u1);
        t2.addUdflugt(u1);
        t2.addUdflugt(u2);
        t2.setHotel(h2);
        t2.getHotel().createTilkøb("Wifi", 50);
        Application.launch(GUI.class);
    }
}
