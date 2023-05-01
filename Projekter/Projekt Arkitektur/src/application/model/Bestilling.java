package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private final ArrayList<Plads> pladser = new ArrayList<>();
    private LocalDate dato;
    private Forestilling forestilling;
    private Kunde kunde;

    public Bestilling(LocalDate dato, Forestilling forestilling, Kunde kunde) {
        this.dato = dato;
        this.forestilling = forestilling;
        this.kunde = kunde;
        kunde.addBestilling(this);
    }

    public LocalDate getDato() {
        return dato;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public void addPlads(Plads plads) {
        if (!pladser.contains(plads)) {
            pladser.add(plads);
        }
    }

    public int samletPris() {
        int samlet = 0;
        for (Plads s : getPladser()) {
            samlet += s.getPris();
        }
        return samlet;
    }
}
