package application.model;

public class Plads {
    private int række, nr, pris;
    private PladsType pladsType;

    public Plads(int række, int nr, int pris, PladsType pladsType) {
        this.række = række;
        this.nr = nr;
        this.pris = pris;
        this.pladsType = pladsType;
    }

    public int getRække() {
        return række;
    }

    public void setRække(int række) {
        this.række = række;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public PladsType getPladsType() {
        return pladsType;
    }

    public void setPladsType(PladsType pladsType) {
        this.pladsType = pladsType;
    }

    @Override
    public String toString() {
        return "Plads{" +
                "række=" + række +
                ", nr=" + nr +
                ", pris=" + pris +
                ", pladsType=" + pladsType +
                '}' + "\n";
    }
}
