package application;

import application.model.*;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Deltager deltager = new Deltager("Rasmus", "128321", "Dansk", false, false, Rolle.PRIVAT);
        Hotel hotel = new Hotel("Dangleterre", "213123123", 1500);
        Konference konference = new Konference(LocalDate.of(2023, 8, 4),
                LocalDate.of(2023, 8, 6), "Din mor", "Fuck dig", 1500);
        Udflugt udflugt = new Udflugt("I morgen", "Din mor", 250);
        Tilmelding tilmelding = new Tilmelding(hotel, udflugt, 1, LocalDate.of(2023, 8, 3),
                LocalDate.of(2023, 8, 9), deltager);
        System.out.println(konference.beregnPris(tilmelding));

    }
}
