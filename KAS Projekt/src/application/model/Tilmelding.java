package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tilmelding {
    private Hotel hotel;
    private Udflugt udflugt;
    private int nummer;
    private LocalDate ankomst, afrejse;
    private Deltager deltager;
    private ArrayList<Udflugt> udflugter;

    public Tilmelding(Hotel hotel, Udflugt udflugt, int nummer, LocalDate ankomst, LocalDate afrejse,
                      Deltager deltager) {
        this.hotel = hotel;
        this.udflugt = udflugt;
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
        if (this.getDeltager().isHasLedsager() == true) {
            hotel.setPricePerDay(hotel.getPricePerDay() + 200);
            hotel.isDobbeltVærelse();
        }
    }

    public Udflugt getUdflugt() {
        return udflugt;
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

    /**
     * Sets the group as this person's group.
     */
}
