package Opgave3;

import java.util.ArrayList;

public class Rental {
    private int number, days;
    private String date;
    private ArrayList<Car> cars = new ArrayList<>();

    public Rental(int number, int days, String date) {
        this.number = number;
        this.days = days;
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        double price = 0;
        for (Car c : cars) {
            price += c.getPricePerDay() * getDays();
        }
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void addCars(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
        }
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
