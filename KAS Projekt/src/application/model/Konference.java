package application.model;

import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class Konference {
    private ArrayList<Udflugt> udflugter = new ArrayList<>();
    private ArrayList<Hotel> hoteller = new ArrayList<>();
    private ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();
    private LocalDate start, slut;
    private String lokation, navn;
    private int antalDeltagere, pris;
    private Tilmelding tilmelding;

    public Konference(LocalDate start, LocalDate slut, String lokation, String navn, int pris) {
        this.start = start;
        this.slut = slut;
        this.lokation = lokation;
        this.navn = navn;
        this.pris = pris;
    }

    public ArrayList<Hotel> getHoteller() {
        return hoteller;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }

    public ArrayList<Tilmelding> getTilmeldinger() {
        return tilmeldinger;
    }

    public void addTilmelding(Tilmelding tilmelding) {
        tilmeldinger.add(tilmelding);
    }

    public Tilmelding createTilmelding(int nummer, LocalDate ankomst, LocalDate afrejse,
                                       Deltager deltager) {
        Tilmelding tilmelding = new Tilmelding(nummer, ankomst, afrejse, deltager);
        tilmeldinger.add(tilmelding);
        Storage.addTilmelding(tilmelding);
        return tilmelding;
    }

    public void addUdflugt(Udflugt udflugt) {
        if (!udflugter.contains(udflugt)) {
            udflugter.add(udflugt);
        }
    }

    public void addHotel(Hotel hotel) {
        if (!hoteller.contains(hotel)) {
            hoteller.add(hotel);
        }
    }

    public Udflugt createUdflugt(String navn, String tidspunkt, String mødested, int pris, Konference konference) {
        Udflugt udflugt = new Udflugt(navn, tidspunkt, mødested, pris, konference);
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

    @Override
    public String toString() {
        return "Navn: " + navn +
                "\nStart: " + start +
                "\nSlut: " + slut +
                "\nLokation: " + lokation +
                "\nPris: " + pris + "\n";
    }

    public int beregnPris(Tilmelding tilmelding) {
        int konferenceDage = (int) DAYS.between(this.getStart(), this.getSlut()) + 1;
        int hotelNætter = (int) DAYS.between(tilmelding.getAnkomst(), tilmelding.getAfrejse());
        int konferencePris = this.pris * konferenceDage;
        int hotelPris = tilmelding.getHotel().getPrisPerDag() * hotelNætter;
        int udflugtPris = 0;
        for (Udflugt u : tilmelding.getUdflugter()) {
            udflugtPris += u.getPris();
        }
        int tilkøbPris = 0;
        for (Tilkøb t : tilmelding.getHotel().getTilkøbt()) {
            tilkøbPris += t.getPris() * hotelNætter;
        }
        if (tilmelding.getDeltager().getRolle() == Rolle.FIRMADELTAGER) {
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
        int samletPris = konferencePris + hotelPris + udflugtPris + tilkøbPris;

        return samletPris;
    }
}
