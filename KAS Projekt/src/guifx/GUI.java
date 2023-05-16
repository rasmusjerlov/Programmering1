package guifx;

import application.controller.Controller;
import application.model.Deltager;
import application.model.Konference;
import application.model.Ledsager;
import application.model.Rolle;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import storage.Storage;

import java.time.LocalDate;


public class GUI extends Application {


    private HBox hbLedsagerNavn = new HBox();
    private HBox hbledsagerTelefon = new HBox();
    private TextField ledsagerNavnTxf = new TextField();
    private TextField ledsagerTelefonTxf = new TextField();
    private HBox hbFirmaNavn = new HBox();
    private HBox hbFirmaTelefon = new HBox();
    private TextField firmanavnTxf = new TextField();
    private TextField firmaTelefonTxf = new TextField();
    private Konference konference;
    private ListView konferencerLV;
    private ListView udflugterLV;
    private ListView hotellerLV;

    public static void visTilmeldingOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Tilmeldinger");
        stage.setScene(scene);
        ListView tilmeldinger = new ListView<>();
        pane.add(tilmeldinger, 2, 15);
        tilmeldinger.getItems().setAll(Konference.getTilmeldinger());
        stage.show();
    }

    public static void visHotellerOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Hoteller");
        stage.setScene(scene);
        ListView hoteller = new ListView<>();
        pane.add(hoteller, 2, 15);
        hoteller.getItems().setAll(Konference.getHoteller());
        stage.show();
    }

    public static void visUdflugterOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Udflugter");
        stage.setScene(scene);
        ListView udflugter = new ListView<>();
        pane.add(udflugter, 2, 15);
        udflugter.getItems().setAll(Konference.getUdflugter());
        stage.show();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("KAS - Konference Administrationssystem");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setHeight(400);
        stage.setWidth(500);
        stage.show();
    }

    public void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        HBox buttonOversigt = new HBox(20);
        Button visTilmeldinger = new Button("Vis tilmeldinger");
        Button visKonferencer = new Button("Vis konferencer");
        Button visHoteller = new Button("Vis hoteller");
        Button visUdflugter = new Button("Vis udflugter");
        buttonOversigt.getChildren().add(visTilmeldinger);
        buttonOversigt.getChildren().add(visKonferencer);
        buttonOversigt.getChildren().add(visHoteller);
        buttonOversigt.getChildren().add(visUdflugter);
        pane.add(buttonOversigt, 2, 15);
        visTilmeldinger.setOnAction(e -> visTilmeldingOnAction());
        visKonferencer.setOnAction(e -> visKonferencerOnAction());
        visHoteller.setOnAction(e -> visHotellerOnAction());
        visUdflugter.setOnAction(e -> visUdflugterOnAction());

        HBox buttonCreate = new HBox(25);
        Button opretTilmelding = new Button("Opret tilmelding");
        Button opretKonference = new Button("Opret konference");
        Button opretHotel = new Button("Opret hotel");
        Button opretUdflugt = new Button("Opret udflugt");
        buttonCreate.getChildren().add(opretTilmelding);
        buttonCreate.getChildren().add(opretKonference);
        buttonCreate.getChildren().add(opretHotel);
        buttonCreate.getChildren().add(opretUdflugt);
        pane.add(buttonCreate, 2, 25);
        opretTilmelding.setOnAction(e -> opretTilmeldingOnAction());
        opretKonference.setOnAction(e -> opretKonferenceOnAction());
        opretHotel.setOnAction(e -> opretHotelOnAction());
        opretUdflugt.setOnAction(e -> opretUdflugtOnAction());


    }

    public void visKonferencerOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Konferencer");
        stage.setScene(scene);
        ListView konferencer = new ListView<>();
        pane.add(konferencer, 2, 15);
        konferencer.getItems().setAll(Storage.getKonferencer());
        stage.show();
    }

    public void opretTilmeldingOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        pane.setGridLinesVisible(false);
        stage.setHeight(600);
        stage.setWidth(800);
        stage.setTitle("Tilmelding");
        stage.setScene(scene);

        Label konferencerLbl = new Label("Vælg konference");
        Label udflugterLbl = new Label("Vælg udflugt");
        Label hotellerLbl = new Label("Vælg hotel");
        pane.add(konferencerLbl, 1, 1);
        pane.add(udflugterLbl, 2, 1);
        pane.add(hotellerLbl, 3, 1);
        konferencerLbl.setAlignment(Pos.BASELINE_CENTER);
        udflugterLbl.setAlignment(Pos.BASELINE_CENTER);
        hotellerLbl.setAlignment(Pos.BASELINE_CENTER);
        konferencerLbl.setPadding(new Insets(20, 20, 20, 50));
        udflugterLbl.setPadding(new Insets(20, 20, 20, 50));
        hotellerLbl.setPadding(new Insets(20, 20, 20, 50));

//        HBox listviewsHB = new HBox(20);

        konferencerLV = new ListView<>();
        udflugterLV = new ListView<>();
        hotellerLV = new ListView<>();
//        listviewsHB.getChildren().addAll(konferencerLV, udflugterLV, hotellerLV);
        pane.add(konferencerLV, 1, 2);
        pane.add(udflugterLV, 2, 2);
        pane.add(hotellerLV, 3, 2);

        konferencerLV.setPadding(new Insets(10, 10, 10, 10));
        udflugterLV.setPadding(new Insets(10, 10, 10, 10));
        hotellerLV.setPadding(new Insets(10, 10, 10, 10));

        konferencerLV.getItems().setAll(Storage.getKonferencer());

        udflugterLV.getItems().setAll(Konference.getUdflugter());
        hotellerLV.getItems().setAll(Konference.getHoteller());

        VBox vbDeltagerTxf = new VBox(10);
        TextField deltagerNavnTxf = new TextField("Deltagerens navn");
        TextField deltagerTelefonTxf = new TextField("Telefonnummer");
        TextField deltagerAdresseTxf = new TextField("Adresse");
        TextField deltagerLandTxf = new TextField("Land");
        DatePicker dpAnkomst = new DatePicker(LocalDate.of(2023, 5, 17));
        DatePicker dpAfrejse = new DatePicker(LocalDate.of(2023, 5, 18));

        RadioButton deltagerPrivat = new RadioButton("Privat");
        RadioButton deltagerForedragsholder = new RadioButton("Foredragsholder");
        RadioButton deltagerAnsat = new RadioButton("Ansat i firma");

        ToggleGroup deltagerRolle = new ToggleGroup();
        deltagerPrivat.setToggleGroup(deltagerRolle);
        deltagerForedragsholder.setToggleGroup(deltagerRolle);
        deltagerAnsat.setToggleGroup(deltagerRolle);

        HBox hbRadio = new HBox(10);
        hbRadio.getChildren().addAll(deltagerPrivat, deltagerForedragsholder, deltagerAnsat);
        vbDeltagerTxf.getChildren().addAll(deltagerNavnTxf, deltagerTelefonTxf, deltagerAdresseTxf,
                deltagerLandTxf, dpAnkomst, dpAfrejse, hbRadio);
        pane.add(vbDeltagerTxf, 1, 3);
        vbDeltagerTxf.setPadding(new Insets(10, 10, 10, 10));

        VBox vbLedsagerTxf = new VBox(10);
        TextField ledsagerNavnTxf = new TextField("Ledsagerens navn");
        TextField ledsagerTelefonTxf = new TextField("Ledsagerens telefonnummer");
        vbLedsagerTxf.getChildren().addAll(ledsagerNavnTxf, ledsagerTelefonTxf);
        pane.add(vbLedsagerTxf, 2, 3);
        vbLedsagerTxf.setPadding(new Insets(10, 10, 10, 10));

        Button buttonOpret = new Button("Opret tilmelding");
        pane.add(buttonOpret, 2, 4);
        buttonOpret.setPadding(new Insets(5, 5, 5, 5));

        VBox vbFirmaTxf = new VBox(10);
        TextField firmaNavnTxf = new TextField("Firmanavn");
        TextField firmaTelefonTxf = new TextField("Firma telefonnummer");
        vbFirmaTxf.getChildren().addAll(firmaNavnTxf, firmaTelefonTxf, buttonOpret);
        pane.add(vbFirmaTxf, 3, 3);
        vbFirmaTxf.setPadding(new Insets(10, 10, 10, 10));
        stage.show();
        buttonOpret.setOnAction(e -> {
            String deltagerNavn = deltagerNavnTxf.getText();
            String deltagerTelefon = deltagerTelefonTxf.getText();
            String nationalitet = deltagerLandTxf.getText();
            boolean firma = false;
            if (firmaNavnTxf.getText().length() > 0 && firmaTelefonTxf.getText().length() > 0) {
                firma = true;
            }
            boolean hasLedsager = false;
            if (ledsagerNavnTxf.getText().length() > 0 && ledsagerTelefonTxf.getText().length() > 0) {
                hasLedsager = true;
            }
            Rolle rolle = Rolle.PRIVAT;
            if (deltagerPrivat.isSelected()) {
                rolle = Rolle.PRIVAT;
            } else if (deltagerForedragsholder.isSelected()) {
                rolle = Rolle.FOREDRAGSHOLDER;
            } else if (deltagerAnsat.isSelected()) {
                rolle = Rolle.FIRMADELTAGER;
            }
            Deltager deltager = Controller.createDeltager(deltagerNavn, deltagerTelefon, nationalitet, firma,
                    hasLedsager, rolle);
            if (hasLedsager == true) {
                Ledsager ledsager = Controller.createLedsager(ledsagerNavnTxf.getText(), ledsagerTelefonTxf.getText());
                deltager.addLedsager(ledsager);
            }
            System.out.println(Storage.getDeltagere());
        });
//        Label vælgKonference = new Label("Vælg Konference");
//        pane.add(vælgKonference, 1, 1);
//        vælgKonference.setPadding(new Insets(10, 10, 10, 65));
//        stage.show();
//        ListView konferencer = new ListView<>();
//        pane.add(konferencer, 1, 2);
//        konferencer.getItems().setAll(Storage.getKonferencer());
//        VBox vbLabels = new VBox(10);
//        VBox vbTxf = new VBox(10);
//        HBox buttonFortsæt = new HBox(60);
//        Button tilmeldingTilbage = new Button("Tilbage");
//        Button tilmeldingFortsæt = new Button("Fortsæt");
//        buttonFortsæt.getChildren().add(tilmeldingTilbage);
//        buttonFortsæt.getChildren().add(tilmeldingFortsæt);
//        pane.add(buttonFortsæt, 1, 3);
//        buttonFortsæt.setPadding(new Insets(10, 10, 10, 10));
//        tilmeldingFortsæt.setOnAction(e -> visBlanketVindueOnAction());
    }


    public void opretKonferenceOnAction() {
        DatePicker dpStart = new DatePicker();
        DatePicker dpSlut = new DatePicker();
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setHeight(400);
        stage.setWidth(400);
        stage.setTitle("Opret konference");
        VBox vbLabels = new VBox(18);
        vbLabels.setPadding(new Insets(15, 10, 0, 10));
        Label lblStart = new Label("Start");
        Label lblSlut = new Label("Slut");
        Label lblLokation = new Label("Lokation");
        Label lblNavn = new Label("Navn");
        Label lblPris = new Label("Pris");
        vbLabels.getChildren().add(lblStart);
        vbLabels.getChildren().add(lblSlut);
        vbLabels.getChildren().add(lblLokation);
        vbLabels.getChildren().add(lblNavn);
        vbLabels.getChildren().add(lblPris);
        pane.add(vbLabels, 1, 2);

        VBox vbTxf = new VBox(10);
        vbTxf.setPadding(new Insets(10, 0, 0, 0));
        TextField txfStart = new TextField();
        TextField txfSlut = new TextField();
        TextField txfLokation = new TextField();
        TextField txfNavn = new TextField();
        TextField txfPris = new TextField();
        Button opret = new Button("Opret");
        vbTxf.getChildren().add(dpStart);
        vbTxf.getChildren().add(dpSlut);
        vbTxf.getChildren().add(txfLokation);
        vbTxf.getChildren().add(txfNavn);
        vbTxf.getChildren().add(txfPris);
        vbTxf.getChildren().add(opret);
        pane.add(vbTxf, 2, 2);
        stage.show();
        opret.setOnAction(e -> {
            LocalDate start = dpStart.getValue();
            LocalDate slut = dpSlut.getValue();
            String lokation = txfLokation.getText();
            String navn = txfNavn.getText();
            int pris = Integer.parseInt(txfPris.getText());
            Controller.createKonference(start, slut, lokation, navn, pris);
            stage.hide();
        });
    }

    public void opretHotelOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Opret hotel");
        stage.setScene(scene);
        stage.setHeight(400);
        stage.setWidth(400);
        VBox vbLabel = new VBox(18);
        Label lblNavn = new Label("Navn");
        Label lblTelefon = new Label("Telefon");
        Label lblPrisPerDag = new Label("Pris pr. nat");
        vbLabel.getChildren().add(lblNavn);
        vbLabel.getChildren().add(lblTelefon);
        vbLabel.getChildren().add(lblPrisPerDag);
        pane.add(vbLabel, 1, 2);
        vbLabel.setPadding(new Insets(15, 10, 0, 10));

        VBox vbTxf = new VBox(10);
        vbTxf.setPadding(new Insets(10, 10, 10, 10));
        TextField txfNavn = new TextField();
        TextField txfTelefon = new TextField();
        TextField txfPrisPerDag = new TextField();
        vbTxf.getChildren().add(txfNavn);
        vbTxf.getChildren().add(txfTelefon);
        vbTxf.getChildren().add(txfPrisPerDag);
        pane.add(vbTxf, 2, 2);
        vbTxf.setPadding(new Insets(10, 0, 0, 0));
        stage.show();

        HBox hbButton = new HBox(10);
        Button opret = new Button("Opret");

        hbButton.getChildren().add(opret);
        pane.add(hbButton, 2, 3);
        hbButton.setPadding(new Insets(10, 10, 10, 0));

        opret.setOnAction(e -> {
            String navn = txfNavn.getText();
            String telefon = txfTelefon.getText();
            int prisPerDag = Integer.parseInt(txfPrisPerDag.getText());
            Controller.createHotel(navn, telefon, prisPerDag);
            stage.hide();
        });

    }

    public void opretUdflugtOnAction() {
        GridPane pane = new GridPane();
        pane.setVgap(10);
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Opret udflugt");
        stage.setScene(scene);
        stage.setHeight(400);
        stage.setWidth(400);

        VBox vbLabel = new VBox(18);
        Label lblNavn = new Label("Navn");
        Label lblTidspunkt = new Label("Tidspunkt");
        Label lblMødested = new Label("Mødested");
        Label lblPris = new Label("Pris");
        vbLabel.getChildren().add(lblNavn);
        vbLabel.getChildren().add(lblTidspunkt);
        vbLabel.getChildren().add(lblMødested);
        vbLabel.getChildren().add(lblPris);
        pane.add(vbLabel, 1, 2);
        vbLabel.setPadding(new Insets(15, 10, 0, 10));

        VBox vbTxf = new VBox(10);
        vbTxf.setPadding(new Insets(10, 10, 10, 10));
        TextField txfNavn = new TextField();
        TextField txfTidspunkt = new TextField();
        TextField txfMødested = new TextField();
        TextField txfPris = new TextField();
        Button opret = new Button("Opret");
        vbTxf.getChildren().addAll(txfNavn, txfTidspunkt, txfMødested, txfPris, opret);
        pane.add(vbTxf, 2, 2);
        stage.show();
        opret.setOnAction(e -> {
            String navn = txfNavn.getText();
            String tidspunkt = txfTidspunkt.getText();
            String mødested = txfMødested.getText();
            int pris = Integer.parseInt(txfPris.getText());
            Controller.createUdflugt(navn, tidspunkt, mødested, pris);
            stage.hide();
        });
    }

}
