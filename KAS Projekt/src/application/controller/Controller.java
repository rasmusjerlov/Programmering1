package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;

public class Controller {
    public static Konference createKonference(LocalDate start, LocalDate slut, String lokation, String navn) {
        Konference konference = new Konference(start, slut, lokation, navn);
        Storage.addKonference(konference);
        return konference;
    }

    public static Tilmelding createTilmelding(Hotel hotel, Udflugt udflugt, int nummer, LocalDate ankomst, LocalDate afrejse, Deltager deltager) {
        Tilmelding tilmelding = new Tilmelding(hotel, udflugt, nummer, ankomst, afrejse, deltager);
        Storage.addTilmelding(tilmelding);
        return tilmelding;
    }

    public static void createDeltager(String navn, String telefon, String nationalitet, boolean firma, boolean ledsager, Rolle rolle) {
        Deltager deltager = new Deltager(navn, telefon, nationalitet, firma, ledsager, rolle);
    }
}
