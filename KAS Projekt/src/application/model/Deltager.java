package application.model;

import java.util.ArrayList;

public class Deltager {
    private String navn, telefon, nationalitet;
    private boolean firma, hasLedsager;
    private Rolle rolle;
    private ArrayList<Ledsager> ledsagere = new ArrayList<>();

    public Deltager(String navn, String telefon, String nationalitet, boolean firma, boolean ledsager, Rolle rolle) {
        this.navn = navn;
        this.telefon = telefon;
        this.nationalitet = nationalitet;
        this.firma = firma;
        this.hasLedsager = ledsager;
        this.rolle = rolle;
    }

    public Ledsager createLedsager(String navn, String telefon) {
        Ledsager ledsager = new Ledsager(navn, telefon);
        ledsagere.add(ledsager);
        return ledsager;
    }

    public ArrayList<Ledsager> getLedsager() {
        return new ArrayList<>(ledsagere);
    }

    public void addLedsager(Ledsager ledsager) {
        if (!ledsagere.contains(ledsager)) {
            ledsagere.add(ledsager);
        }
    }

    public void removeLedsager(Ledsager ledsager) {
        if (ledsagere.contains(ledsager)) {
            ledsagere.remove(ledsager);
        }
    }

    public String getNavn() {
        return navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getNationalitet() {
        return nationalitet;
    }

    public boolean isFirma() {
        return firma;
    }

    public boolean isHasLedsager() {
        return hasLedsager;
    }

    public Rolle getRolle() {
        return rolle;
    }

    @Override
    public String toString() {
        return "" + navn +
                "\nNationalitet: " + nationalitet +
                "\nTelefon: " + telefon +
                "\nRolle: " + rolle +
                "\nLedsager" + ledsagere + "\n";
    }
}
