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

    public static Udflugt createUdflugt(String tidspunkt, String mødested, int pris) {
        Udflugt udflugt = new Udflugt(tidspunkt, mødested, pris);
        Konference.addUdflugt(udflugt);
        return udflugt;
    }

    public static Hotel createhotel(String name, String phone, int pricePerDay) {
        Hotel hotel = new Hotel(name, phone, pricePerDay);
        Konference.addHotel(hotel);
        return hotel;
    }

    public Konference createKonference(LocalDate start, LocalDate slut, String lokation, String navn) {
        Konference konference = new Konference(start, slut, lokation, navn);
        Storage.addKonference(konference);
        return konference;
    }
}
