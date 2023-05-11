package application.model;

import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Konference {
    private static LocalDate start, slut;
    private static String lokation, navn;
    private static int antalDeltagere;
    private static ArrayList<Tilmelding> tilmeldinger;
    private static ArrayList<Udflugt> udflugter;
    private static ArrayList<Hotel> hoteller;

    public Konference(LocalDate start, LocalDate slut, String lokation, String navn) {
        this.start = start;
        this.slut = slut;
        this.lokation = lokation;
        this.navn = navn;
    }

    public static void addHotel(Hotel hotel) {
        if (!hoteller.contains(hotel)) {
            hoteller.add(hotel);
        }
    }

    public static void addUdflugt(Udflugt udflugt) {
        if (!udflugter.contains(udflugt)) {
            udflugter.add(udflugt);
        }
    }

    public void addTilmelding(Tilmelding tilmelding) {
        if (!tilmeldinger.contains(tilmelding)) {
            tilmeldinger.add(tilmelding);
        }
    }

    public Tilmelding createTilmelding(Hotel hotel, Udflugt udflugt, int nummer, LocalDate ankomst, LocalDate afrejse,
                                       Deltager deltager) {
        Tilmelding tilmelding = new Tilmelding(hotel, udflugt, nummer, ankomst, afrejse, deltager);
        tilmeldinger.add(tilmelding);
        Storage.addTilmelding(tilmelding);
        return tilmelding;
    }

    public Udflugt createUdflugt(String tidspunkt, String mødested, int pris) {
        Udflugt udflugt = new Udflugt(tidspunkt, mødested, pris);
        udflugter.add(udflugt);
        return udflugt;
    }

    public Hotel createHotel(String name, String phone, int pricePerDay) {
        Hotel hotel = new Hotel(name, phone, pricePerDay);
        hoteller.add(hotel);
        return hotel;
    }

    public void removeUdflugt(Udflugt udflugt) {
        if (udflugter.contains(udflugt)) {
            udflugter.remove(udflugt);
        }
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getSlut() {
        return slut;
    }

    public String getLokation() {
        return lokation;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntalDeltagere() {
        return antalDeltagere;
    }

    public ArrayList<Tilmelding> getTilmeldinger() {
        return tilmeldinger;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return new ArrayList<>(udflugter);
    }

    public ArrayList<Hotel> getHoteller() {
        return hoteller;
    }
}
