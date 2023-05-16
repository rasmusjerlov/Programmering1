package application.model;

import java.util.ArrayList;

public class Udflugt {
    private String tidspunkt, mødested, navn;
    private int pris;
    private ArrayList<Ledsager> ledsagere = new ArrayList<>();
    private ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();

    public Udflugt(String navn, String tidspunkt, String mødested, int pris) {
        this.navn = navn;
        this.tidspunkt = tidspunkt;
        this.mødested = mødested;
        this.pris = pris;
    }

    public ArrayList<Tilmelding> getTilmeldinger() {
        return new ArrayList<>(tilmeldinger);
    }

    public void addTilmelding(Tilmelding tilmelding) {
        if (!tilmeldinger.contains(tilmelding)) {
            tilmeldinger.add(tilmelding);
            tilmelding.addUdflugt(this);
        }
    }

    public String getNavn() {
        return navn;
    }

    public void removeTilmelding(Tilmelding tilmelding) {
        if (tilmeldinger.contains(tilmelding)) {
            tilmeldinger.remove(tilmelding);
            tilmelding.removeUdflugt(this);
        }
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public String getMødested() {
        return mødested;
    }

    public int getPris() {
        return pris;
    }

    public ArrayList<Ledsager> getLedsagere() {
        return ledsagere;
    }

    @Override
    public String toString() {
        return "" + navn + "\nMødested: " + mødested +
                "\nTidspunkt: " + tidspunkt + "\n";
    }
}
