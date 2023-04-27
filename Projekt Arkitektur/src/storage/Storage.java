package storage;

import application.model.Forestilling;
import application.model.Kunde;
import application.model.Plads;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Kunde> kunder = new ArrayList<Kunde>();
    private static ArrayList<Forestilling> forestillinger = new ArrayList<Forestilling>();
    private static ArrayList<Plads> pladser = new ArrayList<Plads>();

    public static ArrayList<Kunde> getKunder() {
        return new ArrayList<Kunde>(kunder);
    }

    public static void addKunde(Kunde kunde) {
        kunder.add(kunde);
    }

    public static ArrayList<Forestilling> getForestillinger() {
        return new ArrayList<Forestilling>(forestillinger);
    }

    public static void addForestilling(Forestilling forestilling) {
        forestillinger.add(forestilling);
    }

    public static ArrayList<Plads> getPladser() {
        return new ArrayList<Plads>(pladser);
    }

    public static void addPlads(Plads plads) {
        pladser.add(plads);
    }

}
