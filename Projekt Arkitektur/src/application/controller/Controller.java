package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    public static Kunde createKunde(String name, String mobil) {
        Kunde kunde = new Kunde(name, mobil);
        Storage.addKunde(kunde);
        return kunde;
    }

    public static Forestilling createForestilling(String name, LocalDate start, LocalDate end) {
        Forestilling forestilling = new Forestilling(name, start, end);
        Storage.addForestilling(forestilling);
        return forestilling;
    }

    public static Plads createPlads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris, pladsType);
        Storage.addPlads(plads);
        return plads;
    }

    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate date, ArrayList<Plads> pladser) {
        Bestilling bestilling = new Bestilling(forestilling, kunde, date, pladser);
        Storage.addBestilling(bestilling);
        return bestilling;
    }
}
