package guifx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox layout1 = new VBox();
        VBox layout2 = new VBox();
        VBox layout3 = new VBox();
        VBox layout4 = new VBox();
        VBox layout5 = new VBox();
        VBox layout6 = new VBox();
        VBox layout7 = new VBox();
        VBox layout8 = new VBox();
        VBox layout9 = new VBox();
        VBox layout10 = new VBox();
        VBox layout11 = new VBox();
        VBox layout12 = new VBox();
        VBox layout13 = new VBox();
        VBox layout14 = new VBox();
        VBox layout15 = new VBox();
        VBox layout16 = new VBox();
        VBox layout17 = new VBox();
        VBox layout18 = new VBox();
        VBox layout19 = new VBox();
        VBox layout20 = new VBox();
        VBox layout21 = new VBox();
        VBox layout22 = new VBox();
        VBox layout23 = new VBox();
        VBox layout24 = new VBox();
        VBox layout25 = new VBox();
        VBox layout26 = new VBox();
        VBox layout27 = new VBox();
        VBox layout28 = new VBox();
        VBox layout29 = new VBox();
        VBox layout30 = new VBox();
//        VBox layout31 = new VBox();
//        VBox layout32 = new VBox();
//        VBox layout33 = new VBox();

        layout1.setAlignment(Pos.CENTER);
        layout2.setAlignment(Pos.CENTER);
        layout3.setAlignment(Pos.CENTER);
        layout4.setAlignment(Pos.CENTER);
        layout5.setAlignment(Pos.CENTER);
        layout6.setAlignment(Pos.CENTER);
        layout7.setAlignment(Pos.CENTER);
        layout8.setAlignment(Pos.CENTER);
        layout9.setAlignment(Pos.CENTER);
        layout10.setAlignment(Pos.CENTER);
        layout11.setAlignment(Pos.CENTER);
        layout12.setAlignment(Pos.CENTER);
        layout13.setAlignment(Pos.CENTER);
        layout14.setAlignment(Pos.CENTER);
        layout15.setAlignment(Pos.CENTER);
        layout16.setAlignment(Pos.CENTER);
        layout17.setAlignment(Pos.CENTER);
        layout18.setAlignment(Pos.CENTER);
        layout19.setAlignment(Pos.CENTER);
        layout20.setAlignment(Pos.CENTER);
        layout21.setAlignment(Pos.CENTER);
        layout22.setAlignment(Pos.CENTER);
        layout23.setAlignment(Pos.CENTER);
        layout24.setAlignment(Pos.CENTER);
        layout25.setAlignment(Pos.CENTER);
        layout26.setAlignment(Pos.CENTER);
        layout27.setAlignment(Pos.CENTER);
        layout28.setAlignment(Pos.CENTER);
        layout29.setAlignment(Pos.CENTER);
        layout30.setAlignment(Pos.CENTER);
//        layout31.setAlignment(Pos.CENTER);
//        layout32.setAlignment(Pos.CENTER);
//        layout33.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(layout1, 800, 600);
        Scene scene2 = new Scene(layout2, 800, 600);
        Scene scene3 = new Scene(layout3, 800, 600);
        Scene scene4 = new Scene(layout4, 800, 600);
        Scene scene5 = new Scene(layout5, 800, 600);
        Scene scene6 = new Scene(layout6, 800, 600);
        Scene scene7 = new Scene(layout7, 800, 600);
        Scene scene8 = new Scene(layout8, 800, 600);
        Scene scene9 = new Scene(layout9, 800, 600);
        Scene scene10 = new Scene(layout10, 800, 600);
        Scene scene11 = new Scene(layout11, 800, 600);
        Scene scene12 = new Scene(layout12, 800, 600);
        Scene scene13 = new Scene(layout13, 800, 600);
        Scene scene14 = new Scene(layout14, 800, 600);
        Scene scene15 = new Scene(layout15, 800, 600);
        Scene scene16 = new Scene(layout16, 800, 600);
        Scene scene17 = new Scene(layout17, 800, 600);
        Scene scene18 = new Scene(layout18, 800, 600);
        Scene scene19 = new Scene(layout19, 800, 600);
        Scene scene20 = new Scene(layout20, 800, 600);
        Scene scene21 = new Scene(layout21, 800, 600);
        Scene scene22 = new Scene(layout22, 800, 600);
        Scene scene23 = new Scene(layout23, 800, 600);
        Scene scene24 = new Scene(layout24, 800, 600);
        Scene scene25 = new Scene(layout25, 800, 600);
        Scene scene26 = new Scene(layout26, 800, 600);
        Scene scene27 = new Scene(layout27, 800, 600);
        Scene scene28 = new Scene(layout28, 800, 600);
        Scene scene29 = new Scene(layout29, 800, 600);
        Scene scene30 = new Scene(layout30, 800, 600);
//        Scene scene31 = new Scene(layout28, 800, 600);
//        Scene scene32 = new Scene(layout29, 800, 600);
//        Scene scene33 = new Scene(layout30, 800, 600);

        //Skærmbillede 1: Forside
        Label label1 = new Label("Velkommen til KAS - Konference Administrations Systemet");
        label1.setTranslateX(-120);
        label1.setTranslateY(100);

        Button button1 = new Button("Log ind");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        button1.setTranslateX(-100);
        button1.setTranslateY(100);

        Button button2 = new Button("Opret bruger");
        button2.setOnAction(e -> primaryStage.setScene(scene3));

        Button button3 = new Button("Systemlogin");
        button3.setOnAction(e -> primaryStage.setScene(scene17));

        layout1.getChildren().addAll(label1, button1, button2, button3);

        //Skærmbillede 2: Brugerlogin
        Label label2 = new Label("Log ind");
        Label label3 = new Label("For at kunne tilmelde dig en konference skal du første logge ind. Ny bruger? Tryk på opret bruger");
        Label label4 = new Label("Ny bruger? Tryk på opret bruger");
        Label label5 = new Label("Brugernavn:");
        Label label6 = new Label("Adgangskode:");

        TextField brugernavn1 = new TextField();
        brugernavn1.setMaxWidth(100);

        TextField adgangskode1 = new TextField();
        adgangskode1.setMaxWidth(100);

        Button button4 = new Button("Log ind");
        button4.setOnAction(e -> primaryStage.setScene(scene5));

        Button button5 = new Button("Tilbage til forside");
        button5.setOnAction(e -> primaryStage.setScene(scene1));

        Button button6 = new Button("Glemt brugernavn/adgangskode");
        button6.setOnAction(e -> primaryStage.setScene(scene4));

        Button button7 = new Button("Opret bruger");
        button7.setOnAction(e -> primaryStage.setScene(scene3));

        layout2.getChildren().addAll(label2, label3, label4, label5, label6, brugernavn1, adgangskode1, button4, button5, button6, button7);

        //Skærmbillede 3: Oprettelse af ny bruger
        Label label7 = new Label("Opret ny brugerkonto");
        Label label8 = new Label("Udfyld nedenstående oplysninger for at oprette ny konto.");
        Label label9 = new Label("Alle felter skal udfyldes");
        Label label10 = new Label("Brugernavn:");
        Label label11 = new Label("Adgangskode:");
        Label label12 = new Label("Fulde navn:");
        Label label13 = new Label("Adresse:");
        Label label14 = new Label("Postnummer:");
        Label label15 = new Label("By:");
        Label label16 = new Label("Land:");
        Label label17 = new Label("E-mail:");
        Label label18 = new Label("Mobilnummer:");

        TextField brugernavn2 = new TextField();
        brugernavn2.setMaxWidth(100);

        TextField adgangskode2 = new TextField();
        adgangskode2.setMaxWidth(100);

        TextField fuldeNavn = new TextField();
        fuldeNavn.setMaxWidth(100);

        TextField adresse = new TextField();
        adresse.setMaxWidth(100);

        TextField postnummer = new TextField();
        postnummer.setMaxWidth(100);

        TextField by = new TextField();
        by.setMaxWidth(100);

        TextField land = new TextField();
        land.setMaxWidth(100);

        TextField email = new TextField();
        email.setMaxWidth(100);

        TextField mobilnummer = new TextField();
        mobilnummer.setMaxWidth(100);

        Button button8 = new Button("Opret bruger");
        button8.setOnAction(e -> primaryStage.setScene(scene5));

        Button button9 = new Button("Tilbage til forside");
        button9.setOnAction(e -> primaryStage.setScene(scene1));

        layout3.getChildren().addAll(label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18, brugernavn2, adgangskode2, fuldeNavn, adresse, postnummer, by, land, email, mobilnummer, button8, button9);

        //Skærmbillede 4: Glemt brugernavn/adgangskode for bruger
        Label label19 = new Label("Glemt brugernavn eller adgangskode");
        Label label20 = new Label("Indtast enten e-mail eller mobilnummer:");
        Label label21 = new Label("E-mail:");
        Label label22 = new Label("Mobilnummer:");

        TextField email2 = new TextField();
        email2.setMaxWidth(100);

        TextField mobilnummer2 = new TextField();
        mobilnummer2.setMaxWidth(100);

        Button button10 = new Button("Send");
        button10.setOnAction(e -> primaryStage.setScene(scene5));

        Button button11 = new Button("Tilbage til forside");
        button11.setOnAction(e -> primaryStage.setScene(scene1));

        layout4.getChildren().addAll(label19, label20, label21, label22, email2, mobilnummer2, button10, button11);

        //Skærmbillede 5: Hovedmenu/log ind for bruger
        Label label23 = new Label("Hovedmenu");
        Label label24 = new Label("Her har du mulighed for at se og eventuelt ændre dine kontaktoplysninger.");
        Label label25 = new Label("Du kan selvfølgelig også tilmelde dig konferencer og udflugter og ændre i dine nuværende.");

        Button button12 = new Button("Se og opdater kontaktoplysninger");
        button12.setOnAction(e -> primaryStage.setScene(scene6));

        Button button13 = new Button("Tilmelding til konference");
        button13.setOnAction(e -> primaryStage.setScene(scene7));

        Button button14 = new Button("Administrer konferencer og udflugter");
        button14.setOnAction(e -> primaryStage.setScene(scene15));

        Button button15 = new Button("Log ud");
        button15.setOnAction(e -> primaryStage.setScene(scene1));

        layout5.getChildren().addAll(label23, label24, label25, button12, button13, button14, button15);

        //Skærmbillede 6: Se/ret kontaktoplysninger
        Label label26 = new Label("Se og ret kontaktoplysninger");
        Label label27 = new Label("Her kan du se og opdatere dine kontaktoplysninger");
        Label label28 = new Label("Brugernavn:");
        Label label29 = new Label("Adgangskode:");
        Label label30 = new Label("Adresse:");
        Label label31 = new Label("Fulde navn:");
        Label label32 = new Label("Adresse:");
        Label label33 = new Label("Postnummer:");
        Label label34 = new Label("By:");
        Label label35 = new Label("Land:");
        Label label36 = new Label("E-mail:");
        Label label37 = new Label("Mobilnummer:");

        TextField brugernavn3 = new TextField();
        brugernavn3.setMaxWidth(100);

        TextField adgangskode3 = new TextField();
        adgangskode3.setMaxWidth(100);

        TextField fuldeNavn2 = new TextField();
        fuldeNavn2.setMaxWidth(100);

        TextField adresse2 = new TextField();
        adresse2.setMaxWidth(100);

        TextField postnummer2 = new TextField();
        postnummer2.setMaxWidth(100);

        TextField by2 = new TextField();
        by2.setMaxWidth(100);

        TextField land2 = new TextField();
        land2.setMaxWidth(100);

        TextField email3 = new TextField();
        email3.setMaxWidth(100);

        TextField mobilnummer3 = new TextField();
        mobilnummer3.setMaxWidth(100);

        Button button16 = new Button("Gem oplysninger");

        Button button17 = new Button("Tilbage til hovedmenu");
        button17.setOnAction(e -> primaryStage.setScene(scene5));

        Button button18 = new Button("Slet brugerkonto");

        layout6.getChildren().addAll(label26, label27, label28, label29, label30, label31, label32, label33, label34, label35, label36, label37, brugernavn3, adgangskode3, fuldeNavn2, adresse2, postnummer2, by2, land2, email3, mobilnummer3);

        //Skærmbillede 7: Tilmelding til konference side 1
        Label label38 = new Label("Tilmelding til konference");
        Label label39 = new Label("Side 1 ud af 8");
        Label label40 = new Label("Er du ansat i et firma?");
        Label label41 = new Label("Hvis ja, indtast følgende:");
        Label label42 = new Label("Firmanavn:");
        Label label43 = new Label("Firma e-mail:");
        Label label44 = new Label("Firma telefonnummer:");
        Label label45 = new Label("Er du foredragsholder?");
        Label label46 = new Label("Bemærk at du IKKE skal betale for SELVE KONFERENCEN, hvis du er foredragsholder.");

        RadioButton ja1 = new RadioButton();
        ja1.setText("Ja");

        RadioButton nej1 = new RadioButton();
        nej1.setText("Nej");

        RadioButton ja2 = new RadioButton();
        ja2.setText("Ja");

        RadioButton nej2 = new RadioButton();
        nej2.setText("Nej");

        TextField firmanavn1 = new TextField();
        firmanavn1.setMaxWidth(100);

        TextField firmaEmail1 = new TextField();
        firmaEmail1.setMaxWidth(100);

        TextField firmaTelefonnummer1 = new TextField();
        firmaTelefonnummer1.setMaxWidth(100);

        Button button19 = new Button("Annuller tilmelding");
        button19.setOnAction(e -> primaryStage.setScene(scene5));

        Button button20 = new Button("Næste side");
        button20.setOnAction(e -> primaryStage.setScene(scene8));

        layout7.getChildren().addAll(label38, label39, label40, label41, label42, label43, label44, label45, label46, ja1, nej1, ja2, nej2, firmanavn1, firmaEmail1, firmaTelefonnummer1, button19, button20);

        //Skærmbillede 8: Tilmelding til konference side 2
        Label label47 = new Label("Tilmelding til konference");
        Label label48 = new Label("Side 2 ud af 8");
        Label label49 = new Label("Herunder ses nuværende konferencer. Du kan KUN tilmelde dig én konference ad gangen.");

        Button button21 = new Button("Annuller tilmelding");
        button21.setOnAction(e -> primaryStage.setScene(scene5));

        Button button22 = new Button("Læs mere om valgt konference");

        Button button23 = new Button("Vælg konference");

        Button button24 = new Button("Forrige side");
        button24.setOnAction(e -> primaryStage.setScene(scene7));

        Button button25 = new Button("Næste side");
        button25.setOnAction(e -> primaryStage.setScene(scene9));

        layout8.getChildren().addAll(label47, label48, label49, button21, button22, button23, button24, button25);

        //Skærmbillede 9: Tilmelding til konference side 3
        Label label50 = new Label("Tilmelding til konference");
        Label label51 = new Label("Side 3 ud af 8");
        Label label52 = new Label("Har du en ledsager med?");
        Label label53 = new Label("Hvis ja, udfyld nedenstående felter. Alle felter skal udfyldes:");
        Label label54 = new Label("Ledsagers fulde navn:");
        Label label55 = new Label("Ledsagers adresse:");
        Label label56 = new Label("Ledsagers postnummer:");
        Label label57 = new Label("Ledsagers by:");
        Label label58 = new Label("Ledsagers land:");
        Label label59 = new Label("Ledsagers e-mail:");
        Label label60 = new Label("Ledsagers mobilnummer:");

        RadioButton ja3 = new RadioButton();
        ja3.setText("Ja");

        RadioButton nej3 = new RadioButton();
        nej3.setText("Nej");

        TextField ledsagerNavn1 = new TextField();
        ledsagerNavn1.setMaxWidth(100);

        TextField ledsagerAdresse1 = new TextField();
        ledsagerAdresse1.setMaxWidth(100);

        TextField ledsagerPostnummer1 = new TextField();
        ledsagerPostnummer1.setMaxWidth(100);

        TextField ledsagerBy1 = new TextField();
        ledsagerBy1.setMaxWidth(100);

        TextField ledsagerLand1 = new TextField();
        ledsagerLand1.setMaxWidth(100);

        TextField ledsagerEmail1 = new TextField();
        ledsagerEmail1.setMaxWidth(100);

        TextField ledsagerMobilnummer1 = new TextField();
        ledsagerMobilnummer1.setMaxWidth(100);

        Button button26 = new Button("Annuller tilmelding");
        button26.setOnAction(e -> primaryStage.setScene(scene5));

        Button button27 = new Button("Forrige side");
        button27.setOnAction(e -> primaryStage.setScene(scene8));

        Button button28 = new Button("Næste side");
        button28.setOnAction(e -> primaryStage.setScene(scene10));

        layout9.getChildren().addAll(label50, label51, label52, label53, label54, label55, label56, label57, label58, label59, label60, ja3, nej3, ledsagerNavn1, ledsagerAdresse1, ledsagerPostnummer1, ledsagerBy1, ledsagerLand1, ledsagerEmail1, ledsagerMobilnummer1, button26, button27, button28);

        //Skærmbillede 10: Tilmelding til konference side 4
        Label label61 = new Label("Hovedmenu");
        Label label62 = new Label("Side 4 ud af 8");
        Label label63 = new Label("Ønsker din ledsager at komme med på udflugt?");
        Label label64 = new Label("Hvis ja, vælg da én udflugt:");
        Label label65 = new Label("Bemærk: Du kan tilmelde din ledsager én udflugt.");

        RadioButton ja4 = new RadioButton();
        ja4.setText("Ja");

        RadioButton nej4 = new RadioButton();
        nej4.setText("Nej");

        Button button29 = new Button("Annuller tilmelding");
        button29.setOnAction(e -> primaryStage.setScene(scene5));

        Button button30 = new Button("Læs mere om valgt udflugt");

        Button button31 = new Button("Vælg udflugt");

        Button button32 = new Button("Forrige side");
        button32.setOnAction(e -> primaryStage.setScene(scene9));

        Button button33 = new Button("Næste side");
        button33.setOnAction(e -> primaryStage.setScene(scene11));

        layout10.getChildren().addAll(label61, label62, label63, label64, label65, ja4, nej4, button29, button30, button31, button32, button33);

        //Skærmbillede 11: Tilmelding til konference side 5

        Label label66 = new Label("Tilmelding til konference");
        Label label67 = new Label("Side 5 ud af 8");
        Label label68 = new Label("Ønsker du/I overnatning på hotel?");
        Label label69 = new Label("Hvis ja, vælg da et hotel herunder:");
        Label label70 = new Label("Hoteller i nærheden af konferencen:");
        Label label71 = new Label("Bemærk: Ved bestilling af overnatning får man automatisk dobbeltværelse, hvis man har en ledsager med");

        RadioButton ja5 = new RadioButton();
        ja5.setText("Ja");

        RadioButton nej5 = new RadioButton();
        nej5.setText("Nej");

        Button button34 = new Button("Annuller tilmelding");
        button34.setOnAction(e -> primaryStage.setScene(scene5));

        Button button35 = new Button("Læs mere om valgt hotel:");
        button2.setOnAction(e -> primaryStage.setScene(scene3));

        Button button36 = new Button("Vælg hotel");

        Button button37 = new Button("Forrige side");
        button37.setOnAction(e -> primaryStage.setScene(scene10));

        Button button38 = new Button("Næste side");
        button38.setOnAction(e -> primaryStage.setScene(scene12));

        layout11.getChildren().addAll(label66, label67, label68, label69, label70, label71, ja5, nej5, button34, button35, button36, button37, button38);

        //Skærmbillede 12: Tilmelding til konference side 6
        Label label72 = new Label("Tilmelding til konference");
        Label label73 = new Label("Side 6 ud af 8");
        Label label74 = new Label("Ønsker du/I ekstra service på hotellet?");
        Label label75 = new Label("Hvis ja, vælg da ekstra services:");

        RadioButton ja6 = new RadioButton();
        ja6.setText("Ja");

        RadioButton nej6 = new RadioButton();
        nej6.setText("Nej");

        CheckBox wifi = new CheckBox();
        wifi.setText("Wifi:");

        CheckBox badPåVærelse = new CheckBox();
        badPåVærelse.setText("Bad på værelset:");

        CheckBox morgenmad = new CheckBox();
        morgenmad.setText("Morgenmad:");

        Button button39 = new Button("Annuller tilmelding");
        button39.setOnAction(e -> primaryStage.setScene(scene5));

        Button button40 = new Button("Vælg valgte ekstra services");

        Button button41 = new Button("Forrige side");
        button41.setOnAction(e -> primaryStage.setScene(scene11));

        Button button42 = new Button("Næste side");
        button42.setOnAction(e -> primaryStage.setScene(scene13));

        layout12.getChildren().addAll(label72, label73, label74, label75, button39, ja6, nej6, wifi, badPåVærelse, morgenmad, button40, button41, button42);

        //Skærmbillede 13: Tilmelding til konference side 7
        Label label76 = new Label("Tilmelding til konference");
        Label label77 = new Label("Side 7 ud af 8");
        Label label78 = new Label("Bemærk: Angiv dato i formatet dd-mm-åååå");
        Label label79 = new Label("Alle felter skal udfyldes:");
        Label label80 = new Label("Konferenceperiode:");
        Label label81 = new Label("Indtast ankomstdato:");
        Label label82 = new Label("Indtast afrejsedato:");

        TextField konferencePeriode1 = new TextField();
        konferencePeriode1.setMaxWidth(100);

        TextField ankomstDato1 = new TextField();
        ankomstDato1.setMaxWidth(100);

        TextField afrejseDato1 = new TextField();
        afrejseDato1.setMaxWidth(100);

        Button button43 = new Button("Annuller tilmelding");
        button43.setOnAction(e -> primaryStage.setScene(scene5));

        Button button44 = new Button("Forrige side");
        button44.setOnAction(e -> primaryStage.setScene(scene12));

        Button button45 = new Button("Næste side");
        button45.setOnAction(e -> primaryStage.setScene(scene14));

        layout13.getChildren().addAll(label76, label77, label78, label79, label80, label81, label82, konferencePeriode1, ankomstDato1, afrejseDato1, button43, button44, button45);

        //Skærmbillede 14: Tilmelding til konference side 8
        Label label83 = new Label("Tilmelding til konference");
        Label label84 = new Label("Side 8 ud af 8");
        Label label85 = new Label("Du har valgt følgende:");
        Label label86 = new Label("Samlet pris i kroner:");
        Label label87 = new Label("Konference:");
        Label label88 = new Label("Udflugt:");
        Label label89 = new Label("Hotel:");
        Label label90 = new Label("Total:");

        ListView opremsningValg = new ListView<>();

        TextField konferencePris1 = new TextField();
        konferencePris1.setMaxWidth(100);

        TextField udflugtPris1 = new TextField();
        udflugtPris1.setMaxWidth(100);

        TextField hotelPris1 = new TextField();
        hotelPris1.setMaxWidth(100);

        TextField totalPris1 = new TextField();
        totalPris1.setMaxWidth(100);

        Button button46 = new Button("Annuller tilmelding");
        button46.setOnAction(e -> primaryStage.setScene(scene5));

        Button button47 = new Button("Forrige side");
        button47.setOnAction(e -> primaryStage.setScene(scene13));

        Button button48 = new Button("Bekræft tilmelding");
        button48.setOnAction(e -> primaryStage.setScene(scene5));

        layout14.getChildren().addAll(label83, label84, label85, label86, label87, label88, label89, label90, opremsningValg, konferencePris1, udflugtPris1, hotelPris1, totalPris1, button46, button47, button48);

        //Skærmbillede 15: Administrer tilmeldte konferencer og udflugter
        Label label91 = new Label("Administrer tilmeldinger til konferencer med mere");
        Label label92 = new Label("Her er de tilmeldinger, du/I har registreret indtil videre. Vælg én og tryk på ændr eller slet tilmelding:");

        ListView tilmeldteKonferencer = new ListView<>();

        Button button49 = new Button("Ændr tilmelding");

        Button button50 = new Button("Slet tilmelding");

        Button button51 = new Button("Tilbage til hovedmenu");
        button51.setOnAction(e -> primaryStage.setScene(scene5));

        Button button52 = new Button("Betal for tilmeldinger");
        button52.setOnAction(e -> primaryStage.setScene(scene16));

        layout15.getChildren().addAll(label91, label92, button49, tilmeldteKonferencer, button50, button51, button52);

        //Skærmbillede 16: Ubetalte konferencer
        Label label93 = new Label("Betal for tilmeldinger");
        Label label94 = new Label("Her er de tilmeldinger, du/I endnu IKKE har betalt for.");
        Label label95 = new Label("Vælg én og tryk på betal og du vil blive viderestillet til betalingsside:");

        ListView ubetalteKonferencer = new ListView<>();

        Button button53 = new Button("Betal");

        Button button54 = new Button("Slet tilmelding");

        Button button55 = new Button("Tilbage til hovedmenu");
        button55.setOnAction(e -> primaryStage.setScene(scene5));

        layout16.getChildren().addAll(label93, label94, label95, ubetalteKonferencer, button53, button54, button55);

        //Skærmbillede 17: Systemlogin
        Label label96 = new Label("Log in for systemadminstrator");
        Label label97 = new Label("Brugernavn:");
        Label label98 = new Label("Adgangskode:");

        TextField systemBrugernavn1 = new TextField();
        systemBrugernavn1.setMaxWidth(100);

        TextField systemAdgangskode1 = new TextField();
        systemAdgangskode1.setMaxWidth(100);

        Button button56 = new Button("Log ind");
        button56.setOnAction(e -> primaryStage.setScene(scene20));

        Button button57 = new Button("Tilbage til forside");
        button57.setOnAction(e -> primaryStage.setScene(scene1));

        Button button58 = new Button("Glemt brugernavn/adgangskode");
        button58.setOnAction(e -> primaryStage.setScene(scene18));

        Button button59 = new Button("Opret systembruger");
        button59.setOnAction(e -> primaryStage.setScene(scene19));

        layout17.getChildren().addAll(label96, label97, label98, systemBrugernavn1, systemAdgangskode1, button56, button57, button58, button59);

        //Skærmbillede 18: Glemt adgangskode/brugernavn - systemadministrator
        Label label99 = new Label("Glemt brugernavn/adgangskode for systemadministrator");
        Label label100 = new Label("Indtast enten e-mail eller mobilnummer:");
        Label label101 = new Label("Indtast e-mail:");
        Label label102 = new Label("Indtast mobilnummer:");

        TextField systemEmail1 = new TextField();
        systemEmail1.setMaxWidth(100);

        TextField systemMobilnummer1 = new TextField();
        systemMobilnummer1.setMaxWidth(100);

        Button button60 = new Button("Send");

        Button button61 = new Button("Tilbage til systemlogin");
        button61.setOnAction(e -> primaryStage.setScene(scene17));

        layout18.getChildren().addAll(label99, label100, label101, label102, systemEmail1, systemMobilnummer1, button60, button61);

        //Skærmbillede 19: Opret ny systemkonto
        Label label103 = new Label("Opret ny systemkonto");
        Label label104 = new Label("Udfyld nedenstående oplysninger for at oprette ny systemkonto.");
        Label label105 = new Label("Alle felter skal udfyldes:");
        Label label106 = new Label("Brugernavn:");
        Label label107 = new Label("Adgangskode:");
        Label label108 = new Label("Fulde navn:");
        Label label109 = new Label("Adresse:");
        Label label110 = new Label("Postnummer:");
        Label label111 = new Label("By:");
        Label label112 = new Label("Land:");
        Label label113 = new Label("E-mail:");
        Label label114 = new Label("Mobilnummer:");
        Label label115 = new Label("Organisation:");

        TextField systemBrugernavn2 = new TextField();
        systemBrugernavn2.setMaxWidth(100);

        TextField systemAdgangskode2 = new TextField();
        systemAdgangskode2.setMaxWidth(100);

        TextField systemNavn1 = new TextField();
        systemNavn1.setMaxWidth(100);

        TextField systemAdresse1 = new TextField();
        systemAdresse1.setMaxWidth(100);

        TextField systemPostnummer1 = new TextField();
        systemPostnummer1.setMaxWidth(100);

        TextField systemBy1 = new TextField();
        systemBy1.setMaxWidth(100);

        TextField systemLand1 = new TextField();
        systemLand1.setMaxWidth(100);

        TextField systemEmail2 = new TextField();
        systemEmail2.setMaxWidth(100);

        TextField systemMobilnummer2 = new TextField();
        systemMobilnummer2.setMaxWidth(100);

        TextField systemOrganisation1 = new TextField();
        systemOrganisation1.setMaxWidth(100);

        Button button62 = new Button("Opret konto");
        button62.setOnAction(e -> primaryStage.setScene(scene20));

        Button button63 = new Button("Tilbage til forside");
        button63.setOnAction(e -> primaryStage.setScene(scene1));

        layout19.getChildren().addAll(label103, label104, label105, label106, label107, label108, label109, label110, label111, label112, label113, label114, label115, systemBrugernavn2, systemAdgangskode2, systemNavn1, systemAdresse1, systemPostnummer1, systemBy1, systemLand1, systemEmail2, systemMobilnummer2, systemOrganisation1, button62, button63);

        //Skærmbillede 20: Hovedmenu - systemadministrator
        Label label116 = new Label("Hovedmenu - systemadministrator");
        Label label117 = new Label("Kunder:");
        Label label118 = new Label("System:");

        Button button64 = new Button("Administrer brugere");
        button64.setOnAction(e -> primaryStage.setScene(scene21));

        Button button65 = new Button("Tilmelding til konference");

        Button button66 = new Button("Kundebetalinger");
        button66.setOnAction(e -> primaryStage.setScene(scene22));

        Button button67 = new Button("Statistikker");
        button67.setOnAction(e -> primaryStage.setScene(scene23));

        Button button68 = new Button("Se og opdater kontaktoplysninger");
        button68.setOnAction(e -> primaryStage.setScene(scene27));

        Button button69 = new Button("Administrer konferencer");
        button69.setOnAction(e -> primaryStage.setScene(scene28));

        Button button70 = new Button("Administrer udflugter");
        button70.setOnAction(e -> primaryStage.setScene(scene29));

        Button button71 = new Button("Administer hoteller");
        button71.setOnAction(e -> primaryStage.setScene(scene30));

        Button button72 = new Button("Log ud af system");
        button72.setOnAction(e -> primaryStage.setScene(scene1));

        layout20.getChildren().addAll(label116, label117, label118, button64, button65, button66, button67, button68, button69, button70, button71, button72);

        //Skærmbillede 21: Administrer brugere
        Label label119 = new Label("Administer brugere");
        Label label120 = new Label("Vælg én bruger eller opret ny:");

        ListView brugerliste = new ListView<>();

        Button button73 = new Button("Opret bruger");

        Button button74 = new Button("Slet bruger");

        Button button75 = new Button("Ændr/opdater bruger");

        Button button76 = new Button("Tilbage til hovedmenu");
        button76.setOnAction(e -> primaryStage.setScene(scene20));

        layout21.getChildren().addAll(label119, label120, brugerliste, button73, button74, button75, button76);

        //Skærmbillede 22: Kundebetalinger
        Label label121 = new Label("Kundebetalinger");
        Label label122 = new Label("Liste over brugere, der har betalt:");
        Label label123 = new Label("Liste over brugere, der IKKE har betalt:");
        Label label124 = new Label("Vælg bruger for at sende påmindelse om betaling:");

        ListView brugerbetalt = new ListView<>();
        ListView brugerikkebetalt = new ListView<>();

        Button button77 = new Button("Send påmindelse");

        Button button78 = new Button("Tilbage til hovedmenu");
        button78.setOnAction(e -> primaryStage.setScene(scene20));

        layout22.getChildren().addAll(label121, label122, label123, label124, brugerbetalt, brugerikkebetalt, button77, button78);

        //Skærmbillede 23: Statistikker
        Label label125 = new Label("Statistikker");
        Label label126 = new Label("Her findes diverse statistikker:");

        Button button79 = new Button("Konferencer med flest tilmeldinger");
        button79.setOnAction(e -> primaryStage.setScene(scene24));

        Button button80 = new Button("Udflugter med flest tilmeldinger");
        button80.setOnAction(e -> primaryStage.setScene(scene25));

        Button button81 = new Button("Mest populære hoteller");
        button81.setOnAction(e -> primaryStage.setScene(scene26));

        Button button82 = new Button("Tilbage til hovedmenu");
        button82.setOnAction(e -> primaryStage.setScene(scene20));

        layout23.getChildren().addAll(label125, label126, button79, button80, button81, button82);

        //Skærmbillede 24: Konference med flest tilmeldinger

        Label label127 = new Label("Konferencer med flest tilmeldinger");

        ListView mestPopulæreKonferencer = new ListView<>();

        Button button83 = new Button("Tilbage");
        button83.setOnAction(e -> primaryStage.setScene(scene23));

        Button button84 = new Button("Tilbage til hovedmenu");
        button84.setOnAction(e -> primaryStage.setScene(scene20));


        layout24.getChildren().addAll(label127, mestPopulæreKonferencer, button83, button84);

        //Skærmbillede 25: Udflugter med flest tilmeldinger
        Label label128 = new Label("Liste over udflugter med flest tilmeldinger");

        ListView mestPopulæreUdflugter = new ListView<>();

        Button button85 = new Button("Tilbage");
        button85.setOnAction(e -> primaryStage.setScene(scene23));

        Button button86 = new Button("Tilbage til hovedmenu");
        button86.setOnAction(e -> primaryStage.setScene(scene20));

        layout25.getChildren().addAll(label128, mestPopulæreUdflugter, button85, button86);

        //Skærmbillede 26: Mest populære hoteller
        Label label129 = new Label("Liste over de mest populære hoteller:");

        ListView mestPopulæreHoteller = new ListView<>();

        Button button87 = new Button("Tilbage");
        button87.setOnAction(e -> primaryStage.setScene(scene23));

        Button button88 = new Button("Tilbage til hovedmenu");
        button88.setOnAction(e -> primaryStage.setScene(scene20));

        layout26.getChildren().addAll(label129, mestPopulæreHoteller, button87, button88);

        //Skærmbillede 27: Se og opdater personlige oplysninger
        Label label130 = new Label("Se og opdater personlige oplysninger");
        Label label131 = new Label("Alle felter skal være udfyldt:");
        Label label132 = new Label("Brugernavn:");
        Label label133 = new Label("Adgangskode:");
        Label label134 = new Label("Fulde navn:");
        Label label135 = new Label("Adresse:");
        Label label136 = new Label("Postnummer:");
        Label label137 = new Label("By:");
        Label label138 = new Label("Land:");
        Label label139 = new Label("E-mail:");
        Label label140 = new Label("Mobilnummer:");
        Label label141 = new Label("Organisation:");

        TextField systemBrugernavn3 = new TextField();
        systemBrugernavn3.setMaxWidth(100);

        TextField systemAdgangskode3 = new TextField();
        systemAdgangskode3.setMaxWidth(100);

        TextField systemNavn2 = new TextField();
        systemNavn2.setMaxWidth(100);

        TextField systemAdresse2 = new TextField();
        systemAdresse2.setMaxWidth(100);

        TextField systemPostnummer2 = new TextField();
        systemPostnummer2.setMaxWidth(100);

        TextField systemBy2 = new TextField();
        systemBy2.setMaxWidth(100);

        TextField systemLand2 = new TextField();
        systemLand2.setMaxWidth(100);

        TextField systemEmail3 = new TextField();
        systemEmail3.setMaxWidth(100);

        TextField systemMobilnummer3 = new TextField();
        systemMobilnummer3.setMaxWidth(100);

        TextField systemOrganisation2 = new TextField();
        systemOrganisation2.setMaxWidth(100);

        Button button89 = new Button("Gem oplysninger");

        Button button90 = new Button("Tilbage til hovedmenu");
        button90.setOnAction(e -> primaryStage.setScene(scene20));

        Button button91 = new Button("Tilbage til forside");

        layout27.getChildren().addAll(label130, label131, label132, label133, label134, label135, label136, label137, label138, label139, label140, label141, systemBrugernavn3, systemAdgangskode3, systemAdresse2, systemPostnummer2, systemBy2, systemLand2, systemEmail3, systemMobilnummer3, systemOrganisation2, button89, button90, button91);

        //Skærmbillede 28: Liste over konferencer
        Label label142 = new Label("Liste over konferencer");
        Label label143 = new Label("Vælg én konference for at ændre den eller opret en ny:");

        ListView listeKonferencer = new ListView<>();

        Button button92 = new Button("Opret konference");

        Button button93 = new Button("Ændr/opdater konference");

        Button button94 = new Button("Slet konference");

        Button button95 = new Button("Tilbage til hovedmenu");
        button95.setOnAction(e -> primaryStage.setScene(scene20));

        layout28.getChildren().addAll(label142, label143, listeKonferencer, button92, button93, button94, button95);

        //Skærmbillede 29: Liste over udflugter
        Label label144 = new Label("Liste over udflugter");
        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");

        ListView listeUdflugter = new ListView<>();

        Button button96 = new Button("Opret udflugt");
        Button button97 = new Button("Ændr/opdater udflugt");

        Button button98 = new Button("Slet udflugt");

        Button button99 = new Button("Tilbage til hovedmenu");
        button99.setOnAction(e -> primaryStage.setScene(scene20));

        layout29.getChildren().addAll(label144, label145, listeUdflugter, button96, button97, button98, button99);

        //Skærmbillede 30: Liste over hoteller
        Label label146 = new Label("Liste over hoteller");
        Label label147 = new Label("Vælg ét hotel for at ændre det eller opret et nyt:");

        ListView listeHoteller = new ListView<>();

        Button button100 = new Button("Opret hotel");

        Button button101 = new Button("Ændr/opdater hotel");

        Button button102 = new Button("Slet hotel");

        Button button103 = new Button("Tilbage til hovedmenu");
        button103.setOnAction(e -> primaryStage.setScene(scene20));

        layout30.getChildren().addAll(label146, label147, listeHoteller, button100, button101, button102, button103);

//        //Skærmbillede 31: Opret konference
//        Label label144 = new Label("Opret konference");
//        Label label145 = new Label("Alt skal udfyldes");
//        Label label144 = new Label("Navn:");
//        Label label145 = new Label("Startdato:");
//        Label label144 = new Label("Starttidspunkt:");
//        Label label145 = new Label("Slutdato:");
//        Label label144 = new Label("Adresse:");
//        Label label145 = new Label("Postnummer:");
//        Label label144 = new Label("By:");
//        Label label145 = new Label("Hjemmeside:");
//        Label label144 = new Label("Sprog:");
//        Label label145 = new Label("Billede:");
//        Label label144 = new Label("Beskrivelse:");
//        Label label145 = new Label("Priser i kroner:");
//        Label label144 = new Label("Deltager:");
//        Label label145 = new Label("Foredragsholder:");
//
//        TextField konferencenavn = new TextField();
//        konferencenavn.setMaxWidth(100);
//
//        TextField startdato = new TextField();
//        startdato.setMaxWidth(100);
//
//        TextField starttidspunkt = new TextField();
//        starttidspunkt.setMaxWidth(100);
//
//        TextField slutdato = new TextField();
//        slutdato.setMaxWidth(100);
//
//        TextField konferenceAdresse = new TextField();
//        konferenceAdresse.setMaxWidth(100);
//
//        TextField konferencePostnummer = new TextField();
//        konferencePostnummer.setMaxWidth(100);
//
//        TextField konferenceBy = new TextField();
//        konferenceBy.setMaxWidth(100);
//
//        TextField konferencehjemmeside = new TextField();
//        konferencehjemmeside.setMaxWidth(100);
//
//        TextField konferencesprog = new TextField();
//        konferencesprog.setMaxWidth(100);
//
//        TextField systemBrugernavn3 = new TextField();
//        systemBrugernavn3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        layout31.getChildren().addAll();
//
//        //Skærmbillede 32: Opret udflugt
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemNavn2 = new TextField();
//        systemNavn2.setMaxWidth(100);
//
//        TextField systemBrugernavn3 = new TextField();
//        systemBrugernavn3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemNavn2 = new TextField();
//        systemNavn2.setMaxWidth(100);
//
//        TextField systemBrugernavn3 = new TextField();
//        systemBrugernavn3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        layout32.getChildren().addAll();
//
//        //Skærmbillede 33: Opret hotel
//
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//        Label label144 = new Label("Liste over udflugter");
//        Label label145 = new Label("Vælg én udflugt for at ændre den eller opret en ny:");
//        Label label144 = new Label("Liste over udflugter");
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemNavn2 = new TextField();
//        systemNavn2.setMaxWidth(100);
//
//        TextField systemBrugernavn3 = new TextField();
//        systemBrugernavn3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        TextField systemNavn2 = new TextField();
//        systemNavn2.setMaxWidth(100);
//
//        TextField systemBrugernavn3 = new TextField();
//        systemBrugernavn3.setMaxWidth(100);
//
//        TextField systemAdgangskode3 = new TextField();
//        systemAdgangskode3.setMaxWidth(100);
//
//        CheckBox wifi2 = new CheckBox();
//        wifi2.setText("Wifi:");
//
//        CheckBox badPåVærelse2 = new CheckBox();
//        badPåVærelse2.setText("Bad på værelset:");
//
//        CheckBox morgenmad2 = new CheckBox();
//        morgenmad2.setText("Morgenmad:");
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        Button button103 = new Button("Tilbage til hovedmenu");
//        button103.setOnAction(e -> primaryStage.setScene(scene20));
//
//        layout33.getChildren().addAll();

        primaryStage.setTitle("Konferenceadministrationssystemet KAS");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}

