package guifx;

import application.model.Bestilling;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class BestillingWindow extends Stage {
    Bestilling bestilling;

    public BestillingWindow(String title, Bestilling bestilling) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.bestilling = bestilling;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        if (bestilling != null) {
            Label lblDato = new Label("Dato");
            pane.add(lblDato, 0, 0);

            TextField txfDato = new TextField(bestilling.getDato().toString());
            txfDato.setEditable(false);
            pane.add(txfDato, 1, 0);

            Label lblForestilling = new Label("Forestilling");
            pane.add(lblForestilling, 0, 1);

            TextField txfForestilling = new TextField(bestilling.getForestilling().toString());
            txfForestilling.setEditable(false);
            pane.add(txfForestilling, 1, 1);

            Label lblKunde = new Label("Kunde");
            pane.add(lblKunde, 0, 2);

            TextField txfKunde = new TextField(bestilling.getKunde().toString());
            txfKunde.setEditable(false);
            pane.add(txfKunde, 1, 2);

            Label lblPladser = new Label("Pladser");
            pane.add(lblPladser, 0, 3);

            ComboBox cbbPladser = new ComboBox<>();
            pane.add(cbbPladser, 1, 3);
            cbbPladser.getItems().addAll(bestilling.getPladser());
            cbbPladser.getSelectionModel().select(0);

            Label lblPris = new Label("Samlet pris");
            pane.add(lblPris, 0, 4);

            TextField txfPris = new TextField("kr " + bestilling.samletPris());
            txfPris.setEditable(false);
            pane.add(txfPris, 1, 4);

            Label lblOprettet = new Label("Bestilling oprettet");
            lblOprettet.setStyle("-fx-text-fill: green");
            pane.add(lblOprettet, 0, 5);
        } else {
            Label lblError = new Label("Pladser ikke ledige på dagen");
            lblError.setStyle("-fx-text-fill: red");
            pane.add(lblError, 0, 0);
        }
    }
}
