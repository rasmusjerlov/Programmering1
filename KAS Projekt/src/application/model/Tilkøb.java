package application.model;

public class Tilkøb {
    private String navn;
    private int pris;

    public Tilkøb(String navn, int pris) {
        this.navn = navn;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public int getPris() {
        return pris;
    }
}
