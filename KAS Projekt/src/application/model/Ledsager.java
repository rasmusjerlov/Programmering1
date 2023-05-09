package application.model;

public class Ledsager {
    private String navn, telefon;
    private Deltager deltager;

    public Ledsager(String navn, String telefon, Deltager deltager) {
        this.navn = navn;
        this.telefon = telefon;
        this.deltager = deltager;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Deltager getDeltager() {
        return deltager;
    }

    public void setDeltager(Deltager deltager) {
        this.deltager = deltager;
    }
}
