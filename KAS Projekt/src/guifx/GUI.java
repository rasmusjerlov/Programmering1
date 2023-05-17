package guifx;

import application.controller.Controller;
import application.model.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
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
import java.util.ArrayList;


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
    private int nummerCount;
    private RadioButton deltagerPrivat;
    private RadioButton deltagerForedragsholder;
    private RadioButton deltagerAnsat;
    private ComboBox hotelTilvalg;
    private ListView<Konference> konferenceListView;

    public static void visTilmeldingOnAction() {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Tilmeldinger");
        stage.setScene(scene);
        ListView tilmeldinger = new ListView<>();
        pane.add(tilmeldinger, 2, 15);
        tilmeldinger.getItems().setAll(Storage.getTilmeldinger());
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
        hoteller.getItems().setAll(Storage.getHoteller());
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
        udflugter.getItems().setAll(Storage.getUdflugter());
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
        ChangeListener<Konference> listener1 = (ov, o, n) -> this.nyKonferenceValg();
        konferencerLV.getSelectionModel().selectedItemProperty().addListener(listener1);
        ChangeListener<Hotel> listener2 = (ov, oo, nn) -> this.nytHotelValgt();
        hotellerLV.getSelectionModel().selectedItemProperty().addListener(listener2);


        VBox vbDeltagerTxf = new VBox(10);
        Label deltagernavnLbl = new Label("Deltagerens navn");
        TextField deltagerNavnTxf = new TextField();
        Label deltagerTelefonLbl = new Label("Deltagerens telefonnummer");
        TextField deltagerTelefonTxf = new TextField();
        Label deltagerAdresseLbl = new Label("Adresse");
        TextField deltagerAdresseTxf = new TextField();
        Label deltagerLandLbl = new Label("Land");
        TextField deltagerLandTxf = new TextField();
        Label ankomstLbl = new Label("Ankomst");
        DatePicker dpAnkomst = new DatePicker(LocalDate.of(2023, 5, 17));
        Label afrejseLbl = new Label("Afrejse");
        DatePicker dpAfrejse = new DatePicker(LocalDate.of(2023, 5, 18));

        deltagerPrivat = new RadioButton("Privat");
        deltagerForedragsholder = new RadioButton("Foredragsholder");
        deltagerAnsat = new RadioButton("Ansat i firma");

        ToggleGroup deltagerRolle = new ToggleGroup();
        deltagerPrivat.setToggleGroup(deltagerRolle);
        deltagerForedragsholder.setToggleGroup(deltagerRolle);
        deltagerAnsat.setToggleGroup(deltagerRolle);

        HBox hbRadio = new HBox(10);
        hbRadio.getChildren().addAll(deltagerPrivat, deltagerForedragsholder, deltagerAnsat);
        vbDeltagerTxf.getChildren().addAll(deltagernavnLbl, deltagerNavnTxf, deltagerTelefonLbl, deltagerTelefonTxf, deltagerAdresseLbl, deltagerAdresseTxf,
                deltagerLandLbl, deltagerLandTxf, ankomstLbl, dpAnkomst, afrejseLbl, dpAfrejse, hbRadio);
        pane.add(vbDeltagerTxf, 1, 3);
        vbDeltagerTxf.setPadding(new Insets(10, 10, 10, 10));

        VBox vbLedsagerTxf = new VBox(10);
        Label ledsagerNavnLbl = new Label("Ledsagerens navn");
        TextField ledsagerNavnTxf = new TextField();
        Label ledsagerTelefonLbl = new Label("Ledsagerens telefonnummer");
        TextField ledsagerTelefonTxf = new TextField();
        Label tilvalgLbl = new Label("Tilkøb");
        hotelTilvalg = new ComboBox<>();
        ChangeListener<Tilkøb> listener3 = (ooo, on, oonn) -> this.valgtTilvalg();
        hotelTilvalg.getItems().setAll(getTilkøb());

        vbLedsagerTxf.getChildren().addAll(ledsagerNavnLbl, ledsagerNavnTxf, ledsagerTelefonLbl, ledsagerTelefonTxf, tilvalgLbl, hotelTilvalg);
        pane.add(vbLedsagerTxf, 2, 3);
        vbLedsagerTxf.setPadding(new Insets(10, 10, 10, 10));


        Button buttonOpret = new Button("Opret tilmelding");
        pane.add(buttonOpret, 2, 4);

        VBox vbFirmaTxf = new VBox(10);
        Label firmaNavnLbl = new Label("Firmanavn");
        TextField firmaNavnTxf = new TextField();
        Label firmaTelefonLbl = new Label("Firma telefonnummer");
        TextField firmaTelefonTxf = new TextField();
        firmaNavnTxf.setEditable(false);
        firmaTelefonTxf.setEditable(false);
        deltagerAnsat.setOnAction(e2 -> {
            firmaNavnTxf.setEditable(true);
            firmaTelefonTxf.setEditable(true);
        });
        deltagerPrivat.setOnAction(e3 -> {
            firmaNavnTxf.clear();
            firmaTelefonTxf.clear();
            firmaNavnTxf.setEditable(false);
            firmaTelefonTxf.setEditable(false);
        });
        deltagerForedragsholder.setOnAction(e4 -> {
            firmaNavnTxf.clear();
            firmaTelefonTxf.clear();
            firmaNavnTxf.setEditable(false);
            firmaTelefonTxf.setEditable(false);
        });
        vbFirmaTxf.getChildren().addAll(firmaNavnLbl, firmaNavnTxf, firmaTelefonLbl, firmaTelefonTxf, buttonOpret);
        pane.add(vbFirmaTxf, 3, 3);
        vbFirmaTxf.setPadding(new Insets(10, 10, 10, 10));
        stage.show();
        buttonOpret.setOnAction(e -> {
            nummerCount++;
            String deltagerNavn = deltagerNavnTxf.getText();
            String deltagerTelefon = deltagerTelefonTxf.getText();
            String nationalitet = deltagerLandTxf.getText();
            boolean firma = false;
            Rolle rolle = Rolle.PRIVAT;
            if (firmaNavnTxf.getText().length() > 0 && firmaTelefonTxf.getText().length() > 0) {
                rolle = Rolle.FIRMADELTAGER;
                firma = true;
            }
            boolean hasLedsager = false;
            if (ledsagerNavnTxf.getText().length() > 0 && ledsagerTelefonTxf.getText().length() > 0) {
                hasLedsager = true;
            }
            LocalDate ankomst = dpAnkomst.getValue();
            LocalDate afrejse = dpAfrejse.getValue();
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
            stage.hide();
            Tilmelding tilmelding = getValgtKonference().createTilmelding(nummerCount, ankomst, afrejse, deltager);
            tilmelding.setHotel(getValgtHotel());
            tilmelding.addUdflugt(getValgtUdflugt());
            Button buttonBeregn = new Button("Beregn samlet pris");
            pane.add(buttonBeregn, 3, 4);
            buttonBeregn.setOnAction(e1 -> {
                getValgtKonference().beregnPris(tilmelding);
                Label pris = new Label("Pris: " + getValgtKonference().beregnPris(tilmelding));
                pris.setPadding(new Insets(10, 10, 10, 10));
                pane.add(pris, 3, 5);
            });
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

    private Tilkøb valgtTilvalg() {
        return (Tilkøb) hotelTilvalg.getSelectionModel().getSelectedItem();
    }

    private void nytHotelValgt() {
        hotelTilvalg.getItems().setAll(getValgtHotel().getTilkøbt());
    }

    private ArrayList<Tilkøb> getTilkøb() {
        Hotel hotel = getValgtHotel();
        if (hotel != null) {
            return hotel.getTilkøbt();
        }
        return new ArrayList<Tilkøb>();
    }

    private void nyKonferenceValg() {
        udflugterLV.getItems().setAll(getValgtKonference().getUdflugter());
        ChangeListener<Udflugt> listener1 = (ov, o, n) -> this.getValgtUdflugt();
        hotellerLV.getItems().setAll(getValgtKonference().getHoteller());
    }

    private Hotel getValgtHotel() {
        return (Hotel) hotellerLV.getSelectionModel().getSelectedItem();
    }

    private Udflugt getValgtUdflugt() {
        return (Udflugt) udflugterLV.getSelectionModel().getSelectedItem();
    }

    private Konference getValgtKonference() {
        return (Konference) konferencerLV.getSelectionModel().getSelectedItem();
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
//            Controller.createUdflugt(navn, tidspunkt, mødested, pris, listener);
            stage.hide();
        });
    }

}
