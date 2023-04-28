package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    public static Forestilling createForestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        Forestilling forestilling = new Forestilling(navn, startDato, slutDato);
        Storage.addForestiling(forestilling);
        return forestilling;
    }

    public static Kunde createKunde(String navn, String mobil) {
        Kunde kunde = new Kunde(navn, mobil);
        Storage.addKunde(kunde);
        return kunde;
    }

    public static Plads createPlads(int række, int nr, int pris, PladsType pladsType) {
        Plads plads = new Plads(række, nr, pris ,pladsType);
        Storage.addPlads(plads);
        return plads;
    }

    public static Bestilling opretBestillingMedPladser(Forestilling forestilling, Kunde kunde, LocalDate dato, ArrayList<Plads> pladser) {
        Bestilling bestilling = null;
        LocalDate startDato = forestilling.getStartDato();
        LocalDate slutDato = forestilling.getSlutDato();

        if (dato.isEqual(startDato) || dato.isEqual(slutDato) || (dato.isAfter(startDato) && dato.isBefore(slutDato))) {
            boolean alleLedige = true;
            for (Plads plads : pladser) {
                if (!forestilling.erPladsLedig(plads.getRække(), plads.getNr(), dato))
                    alleLedige = false;
            }
            if (alleLedige) {
                bestilling = forestilling.createBestilling(dato, kunde);
                for (Plads plads : pladser) {
                    bestilling.addPlads(plads);
                }
            }
        }

        return bestilling;
    }
}
