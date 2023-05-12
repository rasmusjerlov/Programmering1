package application.model;

import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class Konference {
    private static ArrayList<Tilmelding> tilmeldinger;
    private static ArrayList<Udflugt> udflugter;
    private static ArrayList<Hotel> hoteller;
    private LocalDate start, slut;
    private String lokation, navn;
    private int antalDeltagere, pris;

    public Konference(LocalDate start, LocalDate slut, String lokation, String navn, int pris) {
        this.start = start;
        this.slut = slut;
        this.lokation = lokation;
        this.navn = navn;
        this.pris = pris;
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

    public int getPris() {
        return pris;
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

    public int beregnPris(Tilmelding tilmelding) {
        int konferenceDage = (int) DAYS.between(this.getStart(), this.getSlut());
        System.out.println(konferenceDage);
        int hotelDage = (int) DAYS.between(tilmelding.getAnkomst(), tilmelding.getAfrejse());
        System.out.println(hotelDage);
        int konferencePris = this.pris * konferenceDage;
        int hotelPris = tilmelding.getHotel().getPricePerDay() * hotelDage;
        int udflugtPris = tilmelding.getUdflugt().getPris();
        if (tilmelding.getDeltager().isFirma() == true) {
            hotelPris = 0;
            udflugtPris = 0;
            konferencePris = 0;
        }
        if (tilmelding.getDeltager().getRolle() == Rolle.FOREDRAGSHOLDER) {
            konferencePris = 0;
        }
        if (tilmelding.getDeltager().isHasLedsager() == false) {
            udflugtPris = 0;
        }
        int samletPris = konferencePris + hotelPris + udflugtPris;

        return samletPris;
    }
}
