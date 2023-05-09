package application.model;

import java.time.LocalDate;

public class Tilmelding {
    private Hotel hotel;
    private Udflugt udflugt;
    private int nummer;
    private LocalDate ankomst, afrejse;
    private Deltager deltager;

    public Tilmelding(Hotel hotel, Udflugt udflugt, int nummer, LocalDate ankomst, LocalDate afrejse, Deltager deltager) {
        this.hotel = hotel;
        this.udflugt = udflugt;
        this.nummer = nummer;
        this.ankomst = ankomst;
        this.afrejse = afrejse;
        this.deltager = deltager;
    }

    public Hotel getHotel() {
        return hotel;
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
}
