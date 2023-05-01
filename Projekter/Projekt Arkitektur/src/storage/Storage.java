package storage;

import application.model.Bestilling;
import application.model.Forestilling;
import application.model.Kunde;
import application.model.Plads;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Forestilling> forestillinger = new ArrayList<>();
    private static ArrayList<Kunde> kunder = new ArrayList<>();
    private static ArrayList<Plads> pladser = new ArrayList<>();
    private static ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<>(forestillinger);
    }

    public static void addForestiling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

    public static void addKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public static ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public static void addPlads(Plads plads) {
        pladser.add(plads);
    }

    public static void addBestilling(Bestilling bestilling) {
        bestillinger.add(bestilling);
    }

}
