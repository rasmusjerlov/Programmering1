package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tilmelding {
    private Hotel hotel;
    private int nummer;
    private LocalDate ankomst, afrejse;
    private Deltager deltager;
    private ArrayList<Udflugt> udflugter = new ArrayList<>();
    private ArrayList<Konference> konferencer = new ArrayList<>();

    public Tilmelding(int nummer, LocalDate ankomst, LocalDate afrejse,
                      Deltager deltager) {
        this.nummer = nummer;
        this.ankomst = ankomst;
        this.afrejse = afrejse;
        this.deltager = deltager;
    }

    public ArrayList<Udflugt> getUdflugter() {
        return new ArrayList<Udflugt>(udflugter);
    }


    public void addUdflugt(Udflugt udflugt) {
        if (!udflugter.contains(udflugt)) {
            udflugter.add(udflugt);
            udflugt.addTilmelding(this);
        }
    }

    public void removeUdflugt(Udflugt udflugt) {
        if (udflugter.contains(udflugt)) {
            udflugter.remove(udflugt);
            udflugt.removeTilmelding(this);
        }
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        if (this.hotel != hotel) {
            Hotel oldHotel = this.hotel;
            if (oldHotel != null) {
                oldHotel.removeTilmelding(this);
            }
            this.hotel = hotel;
            if (hotel != null) {
                hotel.addTilmelding(this);
            }
        }
    }


    public int getNummer() {
        return nummer;
    }

    public LocalDate getAnkomst() {
        return ankomst;
    }

    public LocalDate getAfrejse() {
        return afrejse;
    }

    public Deltager getDeltager() {
        return deltager;
    }

    @Override
    public String toString() {
        return "\nDeltager: " + deltager +
                "\nNummer: " + nummer +
                "\nAnkomst: " + ankomst +
                "\nAfrejse: " + afrejse +
                "\nHotel: " + hotel +
                "\nUdflugt: \n" + udflugter;
    }
    /**
     * Sets the group as this person's group.
     */
}
