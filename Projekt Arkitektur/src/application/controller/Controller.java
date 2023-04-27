package application.controller;

import application.model.Forestilling;
import application.model.Kunde;
import application.model.Plads;
import application.model.PladsType;
import storage.Storage;

import java.time.LocalDate;

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
}
