package model;

public class Plads {
    private int række, nummer, pris;
    private PladsType pladsType;

    public Plads(int række, int nummer, int pris, PladsType pladsType) {
        this.række = række;
        this.nummer = nummer;
        this.pris = pris;
        this.pladsType = pladsType;
    }

    public int getRække() {
        return række;
    }

    public int getNummer() {
        return nummer;
    }

    public int getPris() {
        return pris;
    }

    public PladsType getPladsType() {
        return pladsType;
    }
}
