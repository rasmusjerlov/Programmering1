package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Konference {
    private LocalDate start, slut;
    private String lokation, navn;
    private int antalDeltagere;
    private ArrayList<Tilmelding> deltagere;
    private ArrayList<Udflugt> udflugter;
    private ArrayList<Hotel> hoteller;

    public Konference(LocalDate start, LocalDate slut, String lokation, String navn) {
        this.start = start;
        this.slut = slut;
        this.lokation = lokation;
        this.navn = navn;
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
        return deltagere;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return udflugter;
    }

    public ArrayList<Hotel> getHoteller() {
        return hoteller;
    }
}
