package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private LocalDate dato;
    private ArrayList<Plads> pladser = new ArrayList<>();
    private Kunde kunde;

    public Bestilling(LocalDate dato) {
        this.dato = dato;
    }

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public void addPlads(Plads plads) {
        pladser.add(plads);
    }

    public void removePlads(Plads plads) {
        if (pladser.contains(plads)) {
            pladser.remove(plads);
        }
    }
    // association --> 0..* Person

}
