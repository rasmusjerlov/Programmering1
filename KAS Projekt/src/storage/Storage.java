package storage;

import application.model.*;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Konference> konferencer = new ArrayList<>();
    private static ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();
    private static ArrayList<Deltager> deltagere = new ArrayList<>();
    private static ArrayList<Hotel> hoteller = new ArrayList<>();
    private static ArrayList<Udflugt> udflugter = new ArrayList<>();
    private static ArrayList<Ledsager> ledsagere = new ArrayList<>();


    public static void addKonference(Konference konference) {
        konferencer.add(konference);
    }

    public static void addTilmelding(Tilmelding tilmelding) {
        tilmeldinger.add(tilmelding);
    }

    public static void addDeltager(Deltager deltager) {
        deltagere.add(deltager);
    }

    public static void addLedsager(Ledsager ledsager) {
        ledsagere.add(ledsager);
    }

    public static void addHotel(Hotel hotel) {
        hoteller.add(hotel);
    }

    public static ArrayList<Hotel> getHoteller() {
        return hoteller;
    }

    public static void addUdflugt(Udflugt udflugt) {
        udflugter.add(udflugt);
    }

    public static ArrayList<Konference> getKonferencer() {
        return konferencer;
    }

    public static ArrayList<Tilmelding> getTilmeldinger() {
        return tilmeldinger;
    }

    public static ArrayList<Deltager> getDeltagere() {
        return deltagere;
    }

    public static ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }
}
