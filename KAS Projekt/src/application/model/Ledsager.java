package application.model;

public class Ledsager {
    private String navn, telefon;

    public Ledsager(String navn, String telefon) {
        this.navn = navn;
        this.telefon = telefon;
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

    @Override
    public String toString() {
        return "" + navn +
                "\nTelefon: " + telefon;
    }
}
