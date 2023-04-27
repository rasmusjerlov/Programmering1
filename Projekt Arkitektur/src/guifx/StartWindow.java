package guifx;

import application.controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import storage.Storage;

import java.time.LocalDate;

public class StartWindow extends Application {
    private ListView lvwForestillinger, lvwKunder;
    private Label lblForestillinger, lblKunder;
    private TextField forestillingNavnTXF, forestillingStartTXF, forestillingSlutTXF;
    private TextField kundeNavnTXF, kundeMobilTXF;
    private Button opretForestilling, opretKunde;
    private String startDate, endDate;
    private LocalDate dateStart, dateEnd;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Teateer bestillinger");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    public void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setMinSize(400, 600);
        pane.setHgap(10);
        pane.setVgap(10);

        lvwForestillinger = new ListView();
        lvwForestillinger.setEditable(false);
        lvwForestillinger.setPrefWidth(250);
        pane.add(lvwForestillinger, 0, 1);

        lvwKunder = new ListView<>();
        lvwKunder.setEditable(false);
        lvwKunder.setPrefWidth(250);
        pane.add(lvwKunder, 1, 1);

        lblKunder = new Label("Kunder");
        pane.add(lblKunder, 1, 0);
        lblForestillinger = new Label("Forestillinger");
        pane.add(lblForestillinger, 0, 0);

        lvwForestillinger.getItems().setAll(Storage.getForestillinger());
        lvwKunder.getItems().setAll(Storage.getKunder());

        VBox vbForestillingLBL = new VBox(20);
        vbForestillingLBL.setPadding(new Insets(2, 0, 0, 0));
        VBox vbForestillingTXF = new VBox(10);
        vbForestillingTXF.setPadding(new Insets(0, 0, 0, 40));
        pane.add(vbForestillingLBL, 0, 2);
        pane.add(vbForestillingTXF, 0, 2);

        Label forestillingNavnLBL = new Label("Navn: ");
        Label forestillingStartLBL = new Label("Start: ");
        Label forestillingSlutLBL = new Label("Slut: ");
        vbForestillingLBL.getChildren().add(forestillingNavnLBL);
        vbForestillingLBL.getChildren().add(forestillingStartLBL);
        vbForestillingLBL.getChildren().add(forestillingSlutLBL);

        forestillingNavnTXF = new TextField();
        forestillingStartTXF = new TextField();
        forestillingSlutTXF = new TextField();
        vbForestillingTXF.getChildren().add(forestillingNavnTXF);
        vbForestillingTXF.getChildren().add(forestillingStartTXF);
        vbForestillingTXF.getChildren().add(forestillingSlutTXF);

        VBox vbKundeLBL = new VBox(20);
        VBox vbKundeTXF = new VBox(10);

        Label kundeNavnLBL = new Label("Kunde navn: ");
        Label kundeMobilLBL = new Label("Kunde mobil: ");

        kundeNavnTXF = new TextField();
        kundeMobilTXF = new TextField();

        vbKundeLBL.getChildren().add(kundeNavnLBL);
        vbKundeLBL.getChildren().add(kundeMobilLBL);
        vbKundeTXF.getChildren().add(kundeNavnTXF);
        vbKundeTXF.getChildren().add(kundeMobilTXF);
        vbKundeTXF.setPadding(new Insets(0, 0, 0, 80));

        pane.add(vbKundeLBL, 1, 2);
        pane.add(vbKundeTXF, 1, 2);

        VBox opretF = new VBox();
        opretForestilling = new Button("Opret forestilling");
        opretF.getChildren().add(opretForestilling);

        VBox opretK = new VBox();
        opretKunde = new Button("Opret kunde");
        opretK.getChildren().add(opretKunde);

        pane.add(opretF, 0, 3);
        pane.add(opretK, 1, 3);
        opretF.setPadding(new Insets(0, 0, 0, 40));
        opretK.setPadding(new Insets(0, 0, 0, 80));

        opretForestilling.setOnAction(event -> createForestilling());
        opretKunde.setOnAction(event -> createKunde());

    }

    public void createForestilling() {
        String name = forestillingNavnTXF.getText();
        LocalDate dateStart = LocalDate.parse((CharSequence) forestillingStartTXF.getText());
        LocalDate dateEnd = LocalDate.parse((CharSequence) forestillingSlutTXF.getText());
        Controller.createForestilling(name, dateStart, dateEnd);
        lvwForestillinger.getItems().setAll(Storage.getForestillinger());
    }


    public void createKunde() {
        String name = kundeNavnTXF.getText();
        String mobile = kundeMobilTXF.getText();
        Controller.createKunde(name, mobile);
        lvwKunder.getItems().setAll(Storage.getKunder());
        kundeNavnTXF.clear();
        kundeMobilTXF.clear();
    }

}