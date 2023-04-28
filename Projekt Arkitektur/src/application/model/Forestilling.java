package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forestilling {
    private final ArrayList<Bestilling> bestillinger = new ArrayList<>();
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    public Forestilling(String navn, LocalDate startDato, LocalDate slutDato) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public String getNavn() {
        return navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    @Override
    public String toString() {
        return navn +
                " (fra=" + startDato +
                " til " + slutDato +
                ')';
    }

    public ArrayList<Bestilling> getBestillinger() {
        return new ArrayList<>(bestillinger);
    }

    public Bestilling createBestilling(LocalDate dato, Kunde kunde) {
        Bestilling bestilling = new Bestilling(dato, this, kunde);
        bestillinger.add(bestilling);
        return bestilling;
    }

    public boolean erPladsLedig(int række, int nr, LocalDate dato) {
        boolean ledig = true;

        for (Bestilling bestilling : this.getBestillinger()) {
            if (bestilling.getDato().equals(dato)) {
                for (Plads plads : bestilling.getPladser()) {
                    if (plads.getRække() == række && plads.getNr() == nr)
                        ledig = false;
                }
            }
        }
        return ledig;
    }

    public int antalBestiltePladserPåDag(LocalDate dato) {

        int antal = 0;
        for (Bestilling bestilling : this.getBestillinger()) {
            if (bestilling.getDato().equals(dato)) {
                antal += bestilling.getPladser().size();
            }
        }
        return antal;
    }

    public LocalDate succesDato() {
        LocalDate succesDato = null;
        int maxAntal = 0;

        LocalDate start = this.getStartDato();
        LocalDate slut = this.getSlutDato();

        LocalDate dato = start;
        while (!dato.equals(slut.plusDays(1))) {
            int antalBestilte = antalBestiltePladserPåDag(dato);

            if (antalBestilte > maxAntal) {
                maxAntal = antalBestilte;
                succesDato = dato;
            }

        }
        return succesDato;
    }
}
