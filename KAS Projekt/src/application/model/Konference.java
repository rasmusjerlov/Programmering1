package application.model;

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

    public static void addDeltager(Tilmelding tilmelding) {
        tilmeldinger.add(tilmelding);
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

    public ArrayList<Tilmelding> getDeltagere() {
        return tilmeldinger;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }

    public ArrayList<Hotel> getHoteller() {
        return hoteller;
    }
}
