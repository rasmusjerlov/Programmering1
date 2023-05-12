package storage;

import application.model.Deltager;
import application.model.Konference;
import application.model.Tilmelding;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Konference> konferencer = new ArrayList<>();
    private static ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();
    private static ArrayList<Deltager> deltagere = new ArrayList<>();

    public static void addKonference(Konference konference) {
        konferencer.add(konference);
    }

    public static void addTilmelding(Tilmelding tilmelding) {
        tilmeldinger.add(tilmelding);
    }

    public static void addDeltager(Deltager deltager) {
        deltagere.add(deltager);
    }
}
