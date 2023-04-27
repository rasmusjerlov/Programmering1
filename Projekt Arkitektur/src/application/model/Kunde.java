package application.model;

import java.util.ArrayList;

public class Kunde {
    private String name, mobil;
    private ArrayList<Bestilling> bestillinger = new ArrayList<>();

    public Kunde(String name, String mobil) {
        this.name = name;
        this.mobil = mobil;
    }


    public String getName() {
        return name;
    }

    public String getMobil() {
        return mobil;
    }

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    void addBestilling(Bestilling bestilling) {
        if (!bestillinger.contains(bestilling)) {
            bestillinger.add(bestilling);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Mobile: " + mobil + "\n";
    }


}
