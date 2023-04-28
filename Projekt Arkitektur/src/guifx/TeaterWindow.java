package guifx;

import application.controller.Controller;
import application.model.Bestilling;
import application.model.Forestilling;
import application.model.Kunde;
import application.model.Plads;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import storage.Storage;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;


public class TeaterWindow extends Application {
    private ListView<Forestilling> lvwForestillinger;
    private ListView<Kunde> lvwKunder;
    private ListView<Plads> lvwPladser;
    private TextField txfNavn, txfStartDato, txfSlutDato, txfKundeNavn, txfKundeMobil, txfDato;
    private Label lblErrorForestilling, lblErrorKunde, lblErrorBestilling;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Teater Bestillinger");
        GridPane pane = new GridPane();
        initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblForestillinger = new Label("Forestillinger");
        pane.add(lblForestillinger, 0, 0);

        lvwForestillinger = new ListView<>();
        pane.add(lvwForestillinger, 0, 1, 2, 1);
        lvwForestillinger.setPrefHeight(200);
        lvwForestillinger.getItems().setAll(Storage.getForestillinger());

        Label lblNavn = new Label("Navn");
        pane.add(lblNavn, 0, 2);

        txfNavn = new TextField();
        pane.add(txfNavn, 1, 2);

        Label lblStartDato = new Label("Start dato");
        pane.add(lblStartDato, 0, 3);

        txfStartDato = new TextField();
        pane.add(txfStartDato, 1, 3);

        Label lblSlutDato = new Label("Slut dato");
        pane.add(lblSlutDato, 0, 4);

        txfSlutDato = new TextField();
        pane.add(txfSlutDato, 1, 4);

        Button btnOpretForestilling = new Button("Opret Forestilling");
        pane.add(btnOpretForestilling, 1, 5);
        btnOpretForestilling.setOnAction(event -> opretForestillingAction());

        lblErrorForestilling = new Label();
        pane.add(lblErrorForestilling, 1, 6);
        lblErrorForestilling.setStyle("-fx-text-fill: red");


        // -------------------------------------------------------------------------

        Label lblKunder = new Label("Kunder");
        pane.add(lblKunder, 2, 0);

        lvwKunder = new ListView<>();
        pane.add(lvwKunder, 2, 1, 2, 1);
        lvwKunder.setPrefHeight(200);
        lvwKunder.getItems().setAll(Storage.getKunder());


        Label lblKundeNavn = new Label("Kunde navn");
        pane.add(lblKundeNavn, 2, 2);

        txfKundeNavn = new TextField();
        pane.add(txfKundeNavn, 3, 2);

        Label lblKundeMobil = new Label("Kunde mobil");
        pane.add(lblKundeMobil, 2, 3);

        txfKundeMobil = new TextField();
        pane.add(txfKundeMobil, 3, 3);

        Button btnOpretKunde = new Button("Opret Kunde");
        pane.add(btnOpretKunde, 3, 4);
        btnOpretKunde.setOnAction(event -> opretKundeAction());

        lblErrorKunde = new Label();
        pane.add(lblErrorKunde, 3, 5);
        lblErrorKunde.setStyle("-fx-text-fill: red");

        // -------------------------------------------------------------------------

        Label lblPladser = new Label("Pladser");
        pane.add(lblPladser, 4, 0);

        lvwPladser = new ListView<>();
        pane.add(lvwPladser, 4, 1, 2, 1);
        lvwPladser.setPrefHeight(200);
        lvwPladser.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        lvwPladser.getItems().setAll(Storage.getPladser());

        Label lblDato = new Label("Dato");
        pane.add(lblDato, 4, 2);

        txfDato = new TextField();
        pane.add(txfDato, 5, 2);

        Button btnOpretBestilling = new Button("Opret bestilling");
        pane.add(btnOpretBestilling, 5, 3);
        btnOpretBestilling.setOnAction(event -> opretBestillingAction());

        lblErrorBestilling = new Label();
        pane.add(lblErrorBestilling, 5, 4);
        lblErrorBestilling.setStyle("-fx-text-fill: red");

    }

    private void opretForestillingAction() {
        String name = txfNavn.getText();
        String startDato = txfStartDato.getText();
        String slutDato = txfSlutDato.getText();
        if (name.isEmpty()) {
            lblErrorForestilling.setText("Mangler navn");
        } else if (startDato.isEmpty() || slutDato.isEmpty()) {
            lblErrorForestilling.setText("Mangler datoer");
        } else {
            try {
                LocalDate startDate = LocalDate.parse(startDato);
                LocalDate endDate = LocalDate.parse(slutDato);
                lblErrorForestilling.setText("");
                Controller.createForestilling(name, startDate, endDate);
                lvwForestillinger.getItems().setAll(Storage.getForestillinger());

                txfNavn.setText("");
                txfStartDato.setText("");
                txfSlutDato.setText("");
            } catch (DateTimeParseException dtpe) {
                lblErrorForestilling.setText("Datoformat: åååå-MM-dd");
            }
        }
    }

    private void opretKundeAction() {
        String name = txfKundeNavn.getText();
        String mobil = txfKundeMobil.getText();
        if (name.isEmpty()) {
            lblErrorKunde.setText("Mangler navn.");
        } else if (mobil.isEmpty()) {
            lblErrorKunde.setText("Mangler mobilnummer.");
        } else {
            try {
                int mobilNummer = Integer.parseInt(mobil);
                Controller.createKunde(name, mobil);
                lvwKunder.getItems().setAll(Storage.getKunder());

                txfKundeNavn.setText("");
                txfKundeMobil.setText("");
                lblErrorKunde.setText("");
            } catch (NumberFormatException nfe) {
                lblErrorKunde.setText("Ugyldigt mobilnummer.");
            }
        }
    }

    private void opretBestillingAction() {
        Forestilling forestilling = lvwForestillinger.getSelectionModel().getSelectedItem();
        Kunde kunde = lvwKunder.getSelectionModel().getSelectedItem();
        ArrayList<Plads> pladser = new ArrayList<>(lvwPladser.getSelectionModel().getSelectedItems());
        LocalDate dato = null;

        if (forestilling == null) {
            lblErrorBestilling.setText("Vælg forestilling");
        } else if (kunde == null) {
            lblErrorBestilling.setText("Vælg kunde");
        } else if (pladser.isEmpty()) {
            lblErrorBestilling.setText("Vælg pladser");
        } else {
            try {
                dato = LocalDate.parse(txfDato.getText());
            } catch (DateTimeParseException ex) {
                lblErrorBestilling.setText("Ugyldig dato");
            }
            if (dato != null) {
                Bestilling bestilling = Controller.opretBestillingMedPladser(forestilling, kunde, LocalDate.parse(txfDato.getText()), pladser);
                BestillingWindow dia = new BestillingWindow("Bestilling", bestilling);
                dia.showAndWait();
            }
        }
    }
}