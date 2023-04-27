package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private String name;
    private LocalDate start, end;
    private ArrayList<Bestilling> bestillinger;

    public Forestilling(String name, LocalDate start, LocalDate end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return start;
    }

    public LocalDate getEndDate() {
        return end;
    }

    public Bestilling createBestilling(Forestilling forestilling, Kunde kunde, LocalDate date) {
        Bestilling bestilling = new Bestilling(date, forestilling, kunde);
        bestillinger.add(bestilling);
        return bestilling;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    @Override
    public String toString() {
        return "" + name +
                "\nStart dato: " + start +
                "\nSlut dato: " + end +
                "\n" + "\n";
    }
}
