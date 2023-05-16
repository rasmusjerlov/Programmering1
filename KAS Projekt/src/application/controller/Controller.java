package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;

public class Controller {
    public static Deltager createDeltager(String navn, String telefon, String nationalitet, boolean firma,
                                          boolean ledsager, Rolle rolle) {
        Deltager deltager = new Deltager(navn, telefon, nationalitet, firma, ledsager, rolle);
        Storage.addDeltager(deltager);
        return deltager;
    }

    public static Udflugt createUdflugt(String navn, String tidspunkt, String mødested, int pris) {
        Udflugt udflugt = new Udflugt(navn, tidspunkt, mødested, pris);
        Storage.addUdflugt(udflugt);
        return udflugt;
    }

    public static Hotel createHotel(String name, String phone, int pricePerDay) {
        Hotel hotel = new Hotel(name, phone, pricePerDay);
        Storage.addHotel(hotel);
        return hotel;
    }

    public static Ledsager createLedsager(String navn, String telefon) {
        Ledsager ledsager = new Ledsager(navn, telefon);
        Storage.addLedsager(ledsager);
        return ledsager;
    }

    public static Konference createKonference(LocalDate start, LocalDate slut, String lokation, String navn, int pris) {
        Konference konference = new Konference(start, slut, lokation, navn, pris);
        Storage.addKonference(konference);
        return konference;
    }
}
