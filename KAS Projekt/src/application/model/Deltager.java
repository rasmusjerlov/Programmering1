package application.model;

public class Deltager {
    private String navn, telefon, nationalitet;
    private boolean firma, ledsager;
    private Rolle rolle;

    public Deltager(String navn, String telefon, String nationalitet, boolean firma, boolean ledsager, Rolle rolle) {
        this.navn = navn;
        this.telefon = telefon;
        this.nationalitet = nationalitet;
        this.firma = firma;
        this.ledsager = ledsager;
        this.rolle = rolle;
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

    public boolean isLedsager() {
        return ledsager;
    }

    public Rolle getRolle() {
        return rolle;
    }
}
