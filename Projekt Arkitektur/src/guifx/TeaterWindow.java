package guifx;

import application.controller.Controller;
import application.model.Bestilling;
import application.model.Forestilling;
import application.model.Kunde;
import application.model.Plads;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
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
    ComboBox cbbDatoer;
    private ListView<Forestilling> lvwForestillinger;
    private ListView<Kunde> lvwKunder;
    private ListView<Plads> lvwPladser, lvwDagPladser;
    private ListView<Bestilling> lvwBestillinger;
    private TextField txfNavn, txfStartDato, txfSlutDato, txfKundeNavn, txfKundeMobil, txfDato, txfBedsteDato, txfBestiltePladser;
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
        GridPane bestillingPane = new GridPane();
        pane.setGridLinesVisible(true);

        pane.add(bestillingPane, 0, 0);
        bestillingPane.setPadding(new Insets(20));
        bestillingPane.setHgap(20);
        bestillingPane.setVgap(10);
        bestillingPane.setGridLinesVisible(false);

        Label lblForestillinger = new Label("Forestillinger");
        bestillingPane.add(lblForestillinger, 0, 0);

        lvwForestillinger = new ListView<>();
        bestillingPane.add(lvwForestillinger, 0, 1, 2, 1);
        lvwForestillinger.setPrefHeight(200);
        lvwForestillinger.getItems().setAll(Storage.getForestillinger());

        ChangeListener<Forestilling> listener = (ov, oldForestilling, newForestilling) -> this.updateStat();
        lvwForestillinger.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblNavn = new Label("Navn");
        bestillingPane.add(lblNavn, 0, 2);

        txfNavn = new TextField();
        bestillingPane.add(txfNavn, 1, 2);

        Label lblStartDato = new Label("Start dato");
        bestillingPane.add(lblStartDato, 0, 3);

        txfStartDato = new TextField();
        bestillingPane.add(txfStartDato, 1, 3);

        Label lblSlutDato = new Label("Slut dato");
        bestillingPane.add(lblSlutDato, 0, 4);

        txfSlutDato = new TextField();
        bestillingPane.add(txfSlutDato, 1, 4);

        Button btnOpretForestilling = new Button("Opret Forestilling");
        bestillingPane.add(btnOpretForestilling, 1, 5);
        btnOpretForestilling.setOnAction(event -> opretForestillingAction());

        lblErrorForestilling = new Label();
        bestillingPane.add(lblErrorForestilling, 1, 6);
        lblErrorForestilling.setStyle("-fx-text-fill: red");

        // -------------------------------------------------------------------------

        Label lblKunder = new Label("Kunder");
        bestillingPane.add(lblKunder, 2, 0);

        lvwKunder = new ListView<>();
        bestillingPane.add(lvwKunder, 2, 1, 2, 1);
        lvwKunder.setPrefHeight(200);
        lvwKunder.getItems().setAll(Storage.getKunder());

        ChangeListener<Kunde> listenerKunde = (ov, oldKunde, newKunde) -> this.updateStat();
        lvwKunder.getSelectionModel().selectedItemProperty().addListener(listenerKunde);

        Label lblKundeNavn = new Label("Kunde navn");
        bestillingPane.add(lblKundeNavn, 2, 2);

        txfKundeNavn = new TextField();
        bestillingPane.add(txfKundeNavn, 3, 2);

        Label lblKundeMobil = new Label("Kunde mobil");
        bestillingPane.add(lblKundeMobil, 2, 3);

        txfKundeMobil = new TextField();
        bestillingPane.add(txfKundeMobil, 3, 3);

        Button btnOpretKunde = new Button("Opret Kunde");
        bestillingPane.add(btnOpretKunde, 3, 4);
        btnOpretKunde.setOnAction(event -> opretKundeAction());

        lblErrorKunde = new Label();
        bestillingPane.add(lblErrorKunde, 3, 5);
        lblErrorKunde.setStyle("-fx-text-fill: red");

        // -------------------------------------------------------------------------

        Label lblPladser = new Label("Pladser");
        bestillingPane.add(lblPladser, 4, 0);

        lvwPladser = new ListView<>();
        bestillingPane.add(lvwPladser, 4, 1, 2, 1);
        lvwPladser.setPrefHeight(200);
        lvwPladser.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        lvwPladser.getItems().setAll(Storage.getPladser());

        Label lblDato = new Label("Dato");
        bestillingPane.add(lblDato, 4, 2);

        txfDato = new TextField();
        bestillingPane.add(txfDato, 5, 2);

        Button btnOpretBestilling = new Button("Opret bestilling");
        bestillingPane.add(btnOpretBestilling, 5, 3);
        btnOpretBestilling.setOnAction(event -> opretBestillingAction());

        lblErrorBestilling = new Label();
        bestillingPane.add(lblErrorBestilling, 5, 4);
        lblErrorBestilling.setStyle("-fx-text-fill: red");

        // -------------------------------------------------------------------------

        GridPane statistikPane = new GridPane();

        pane.add(statistikPane, 0, 1);
        statistikPane.setPadding(new Insets(20));
        statistikPane.setHgap(20);
        statistikPane.setVgap(10);
        statistikPane.setGridLinesVisible(false);

        Label lblStatistik = new Label("Statistik");
        statistikPane.add(lblStatistik, 0, 0);

        Label lblBedsteDato = new Label("Mest bookede");
        statistikPane.add(lblBedsteDato, 0, 1);

        txfBedsteDato = new TextField();
        txfBedsteDato.setEditable(false);
        statistikPane.add(txfBedsteDato, 1, 1);

        Label lblStatDato = new Label("Dato");
        statistikPane.add(lblDato, 0, 2);

        cbbDatoer = new ComboBox<>();
        statistikPane.add(cbbDatoer, 1, 2);
        cbbDatoer.setOnAction(event -> updateStat());

        txfBestiltePladser = new TextField();
        txfBestiltePladser.setEditable(false);
        statistikPane.add(txfBestiltePladser, 1, 3);

        // -------------------------------------------------------------------------

        Label lblBestillinger = new Label("Bestillinger");
        statistikPane.add(lblBestillinger, 2, 0);

        lvwBestillinger = new ListView<>();
        statistikPane.add(lvwBestillinger, 2, 1, 2, 4);
        lvwBestillinger.setPrefHeight(100);

        // -------------------------------------------------------------------------

        Label lblBestiltePladser = new Label("Bestilte pladser på dag");
        statistikPane.add(lblBestiltePladser, 4, 0);

        lvwDagPladser = new ListView<>();
        statistikPane.add(lvwDagPladser, 4, 1, 2, 4);
        lvwDagPladser.setPrefHeight(100);

        if (lvwForestillinger.getItems().size() > 0 && lvwKunder.getItems().size() > 0) {
            initControls();
            updateStat();
        }
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

                int selectIndex = lvwForestillinger.getSelectionModel().getSelectedIndex();
                lvwForestillinger.getItems().setAll(Storage.getForestillinger());
                lvwForestillinger.getSelectionModel().select(selectIndex);

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

                int selectIndex = lvwKunder.getSelectionModel().getSelectedIndex();
                lvwKunder.getItems().setAll(Storage.getKunder());
                lvwKunder.getSelectionModel().select(selectIndex);

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
                updateStat();
                dia.showAndWait();
            }
        }
    }

    private void initControls() {
        lvwForestillinger.getSelectionModel().select(0);
        lvwKunder.getSelectionModel().select(0);
    }

    private void updateStat() {
        if (lvwForestillinger.getSelectionModel().getSelectedItem() == null || lvwKunder.getSelectionModel().getSelectedItem() == null)
            initControls();

        Forestilling forestilling = lvwForestillinger.getSelectionModel().getSelectedItem();
        Kunde kunde = lvwKunder.getSelectionModel().getSelectedItem();

        if (forestilling.succesDato() != null) {
            txfBedsteDato.setText(forestilling.succesDato().toString());
        } else {
            txfBedsteDato.setText("Ingen pladser solgte");
        }

        if (cbbDatoer.getSelectionModel().getSelectedItem() == null || !forestilling.getDatoer().containsAll(cbbDatoer.getItems())) {
            cbbDatoer.getItems().setAll(forestilling.getDatoer());
            cbbDatoer.getSelectionModel().select(0);
        }
        txfBestiltePladser.setText(String.valueOf(forestilling.antalBestiltePladserPåDag((LocalDate) cbbDatoer.getSelectionModel().getSelectedItem())));

        // -------------------------------------------------------------------------

        if (kunde != null) {
            lvwBestillinger.getItems().setAll(kunde.getBestillinger());
            lvwDagPladser.getItems().setAll(kunde.bestiltePladserTilForestillingPåDag(forestilling, (LocalDate) cbbDatoer.getSelectionModel().getSelectedItem()));
        }
    }
}