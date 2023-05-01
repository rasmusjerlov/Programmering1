package guifx;

import application.controller.Controller;
import application.model.Forestilling;
import application.model.Kunde;
import application.model.PladsType;
import javafx.application.Application;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        initStorage();
        Application.launch(TeaterWindow.class);
    }

    public static void initStorage() {
        Forestilling f1 = Controller.createForestilling("Evita", LocalDate.of(2023, 8, 10), LocalDate.of(2023, 8, 20));
        Forestilling f2 = Controller.createForestilling("Lykke per", LocalDate.of(2023, 9, 1), LocalDate.of(2023, 9, 10));
        Forestilling f3 = Controller.createForestilling("Chess", LocalDate.of(2023, 8, 21), LocalDate.of(2023, 8, 30));

        Kunde k1 = Controller.createKunde("Anders Hansen", "11223344");
        Kunde k2 = Controller.createKunde("Peter Jensen", "12345678");
        Kunde k3 = Controller.createKunde("Niels Madsen", "12341234");

        int pris;
        PladsType type = PladsType.STANDARD;

        int rækkeTred;
        int nrTiDel;

        for (int række = 0; række < 15; række++) {
            rækkeTred = række / 5;
            for (int nr = 0; nr < 20; nr++) {
                nrTiDel = nr / 2;
                if (rækkeTred == 0) {
                    pris = 500;
                    if (nrTiDel == 0 || nrTiDel == 9)
                        pris = 450;
                } else if (rækkeTred == 1) {
                    pris = 450;
                    if (nrTiDel == 0 || nrTiDel == 9)
                        pris = 400;
                } else
                    pris = 400;

                if (række == 9 && nr > 6 && nr < 12)
                    type = PladsType.KØRESTOL;
                else if (række == 10 && nr > 6 && nr < 12)
                    type = PladsType.EKSTRABEN;
                else
                    type = PladsType.STANDARD;

                Controller.createPlads(række + 1, nr + 1, pris, type);
            }
        }
    }
}
