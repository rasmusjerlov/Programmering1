package application;

import application.model.*;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Konference konference = new Konference(LocalDate.of(2023, 5, 18), LocalDate.of(2023, 5, 20),
                "Odense Universitet", "Hav og Himmel", 1500);
        Hotel hotel = new Hotel("Den Hvide Svane", "1231232", 1250);
        Udflugt udflugt1 = new Udflugt("Egeskov", "19/5/2023", "Egeskov", 75);
        Udflugt udflugt2 = new Udflugt("Trapholt Museum, Kolding", "20/5/2023", "Trapholt Museum", 200);
        Deltager deltager = new Deltager("Peter Sommer", "12312312", "Dansk", false, true, Rolle.PRIVAT);
        Tilmelding tilmelding = new Tilmelding(1, konference.getStart(), konference.getSlut(), deltager);
        tilmelding.setHotel(hotel);
        tilmelding.addUdflugt(udflugt2);
        tilmelding.addUdflugt(udflugt1);
        tilmelding.getHotel().createTilkøb("Wifi", 50);
        konference.addTilmelding(tilmelding);
        System.out.println(konference.getTilmeldinger());
        System.out.println(konference.beregnPris(tilmelding));

    }
}
