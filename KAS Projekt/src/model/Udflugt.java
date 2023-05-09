package model;

import java.util.ArrayList;

public class Udflugt {
    private String tidspunkt, mødested;
    private int pris;
    private ArrayList<Ledsager> ledsagere;

    public Udflugt(String tidspunkt, String mødested, int pris) {
        this.tidspunkt = tidspunkt;
        this.mødested = mødested;
        this.pris = pris;
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
}
