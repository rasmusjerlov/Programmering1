package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestilling {
    private Forestilling forestilling;
    private Kunde kunde;
    private LocalDate date;
    private ArrayList<Plads> pladser = new ArrayList<>();

    public Bestilling(LocalDate date, Forestilling forestilling, Kunde kunde) {
        this.forestilling = forestilling;
        this.date = date;
        this.kunde = kunde;
        kunde.addBestilling(this);
    }

    public LocalDate getDate() {
        return date;
    }

    public Forestilling getForestilling() {
        return forestilling;
    }

    public ArrayList<Plads> getPladser() {
        return new ArrayList<>(pladser);
    }

    public Kunde getKunde() {
        return kunde;
    }

}
