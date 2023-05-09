package storage;

import application.model.Deltager;
import application.model.Konference;
import application.model.Tilmelding;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Konference> konferencer;
    private static ArrayList<Tilmelding> tilmeldinger;
    private static ArrayList<Deltager> deltagere;

    public static void addKonference(Konference konference) {
        konferencer.add(konference);
    }

    public static void addTilmelding(Tilmelding tilmelding) {
        tilmeldinger.add(tilmelding);
    }
}
