package application.model;

import java.util.ArrayList;

public class Hotel {
    private String navn, telefon;
    private int prisPerDag;
    private ArrayList<Deltager> reservationer = new ArrayList<>();
    private ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();
    private ArrayList<Tilkøb> tilkøbt = new ArrayList<>();
    private boolean dobbeltVærelse;

    public Hotel(String name, String phone, int prisPerDag) {
        this.navn = name;
        this.telefon = phone;
        this.prisPerDag = prisPerDag;
    }

    public void addTilmelding(Tilmelding tilmelding) {
        if (!tilmeldinger.contains(tilmelding)) {
            tilmeldinger.add(tilmelding);
            tilmelding.setHotel(this);
        }
    }

    public void removeTilmelding(Tilmelding tilmelding) {
        if (tilmeldinger.contains(tilmelding)) {
            tilmeldinger.remove(tilmelding);
            tilmelding.setHotel(this);
        }
    }

    public String getNavn() {
        return navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public int getPrisPerDag() {
        return prisPerDag;
    }

    public void setPrisPerDag(int prisPerDag) {
        this.prisPerDag = prisPerDag;
    }

    public ArrayList<Deltager> getReservationer() {
        return reservationer;
    }

    public boolean isDobbeltVærelse() {
        return dobbeltVærelse;
    }

    public Tilkøb createTilkøb(String navn, int pris) {
        Tilkøb tilkøb = new Tilkøb(navn, pris);
        tilkøbt.add(tilkøb);
        return tilkøb;
    }

    public ArrayList<Tilkøb> getTilkøbt() {
        return tilkøbt;
    }

    @Override
    public String toString() {
        return "" + navn +
                "\nPris pr. dag: " + prisPerDag + "\n";
    }
}
