package guifx;

import application.controller.Controller;
import application.model.Company;
import javafx.application.Application;

public class App {

    public static void main(String[] args) {
        initStorage();
        Application.launch(StartWindow.class);
        System.out.println(Controller.getCustomers());
        System.out.println(Controller.getCompanies());
    }

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        Company c1 = Controller.createCompany("IBM", 37);
        Company c2 = Controller.createCompany("AMD", 40);
        Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Controller.createEmployee("Bob Dole", 210, 2008, c2);
        Controller.createEmployee("Alice Schmidt", 250, 2010, c1);
        Controller.createEmployee("George Down", 150, 1990, c2);

        Controller.createEmployee("Rita Uphill", 300);

        Controller.createCustomer("Klark", c1);
        Controller.createCustomer("Anders", c1);
        Controller.createCustomer("Faggel", c1);
        Controller.createCustomer("Emilio", c2);
        Controller.createCustomer("Patte", c2);


    }


}
