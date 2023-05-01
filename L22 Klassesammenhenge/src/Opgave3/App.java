package Opgave3;

public class App {
    public static void main(String[] args) {
        Car c1 = new Car("AA12345", 500, 2013);
        Car c2 = new Car("AB54321", 600, 2010);
        Car c3 = new Car("AC12385", 750, 2011);
        Car c4 = new Car("AU12039", 300, 2009);
        Car c5 = new Car("BE21394", 475, 2015);
        Rental r1 = new Rental(1, 7, "31. Maj, 2022");
        Rental r2 = new Rental(r1.getNumber() + 1, 10, "15. April, 2023");

        r1.addCars(c1);
        r1.addCars(c2);
        r1.addCars(c3);
        r2.addCars(c4);
        System.out.println(r1.getPrice());
    }
}
