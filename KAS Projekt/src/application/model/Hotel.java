package application.model;

import java.util.ArrayList;

public class Hotel {
    private String name, phone;
    private int pricePerDay;
    private ArrayList<Deltager> reservationer;
    private boolean dobbeltVærelse;

    public Hotel(String name, String phone, int pricePerDay) {
        this.name = name;
        this.phone = phone;
        this.pricePerDay = pricePerDay;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public ArrayList<Deltager> getReservationer() {
        return reservationer;
    }

    public boolean isDobbeltVærelse() {
        return dobbeltVærelse;
    }
}
