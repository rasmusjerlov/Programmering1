package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.YatzyDice;

import java.util.Arrays;

public class YatzyGui extends Application {
    // txfValues shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];
    // cbxHolds shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];

    // -------------------------------------------------------------------------
    // txfResults shows the obtained results.
    // For results not set yet, the possible result of
    // the actual face values of the 5 dice are shown.
    private final TextField[] txfResults = new TextField[15];
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField();
    private final TextField txfBonus = new TextField();
    private final TextField txfSumOther = new TextField();
    private final TextField txfTotal = new TextField();
    private final Label lblThrowCount = new Label();
    private final Button btnThrow = new Button(" Throw ");
    private final int[] privateResult = new int[15];
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setGridLinesVisible(false);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds
        HBox valueContainer = new HBox(20);
        dicePane.add(valueContainer, 0, 0);

        // Textfields
        for (int i = 0; i < txfValues.length; i++) {
            TextField dieRoll = new TextField();
            dieRoll.setPrefSize(50.0, 50.0);
            dieRoll.setAlignment(Pos.CENTER);
            dieRoll.setDisable(true);
            dieRoll.setStyle("-fx-opacity: 1.0");
            dieRoll.setFont(Font.font("Arial", FontWeight.BOLD, 24));

            txfValues[i] = dieRoll;
            valueContainer.getChildren().add(txfValues[i]);
        }

        HBox holdContainer = new HBox();
        dicePane.add(holdContainer, 0, 1);

        // Hold buttons
        for (int i = 0; i < cbxHolds.length; i++) {
            CheckBox holdBtn = new CheckBox();
            Label holdBtnValue = new Label("Hold");
            holdBtnValue.setPadding(new Insets(0, 21.0, 0, 5.0));

            cbxHolds[i] = holdBtn;
            holdContainer.getChildren().add(cbxHolds[i]);
            holdContainer.getChildren().add(holdBtnValue);
        }

        // add lblThrowCount and btnThrow
        HBox throwContainer = new HBox();
        dicePane.add(throwContainer, 0, 2);

        btnThrow.setFont(Font.font("Arial", FontWeight.NORMAL, 16));
        lblThrowCount.setText("Throw " + Integer.toString(dice.getThrowCount()));
        btnThrow.setPrefSize(100.0, 50.0);
        btnThrow.setOnAction(event -> throwAction());
        throwContainer.setAlignment(Pos.BASELINE_RIGHT);
        throwContainer.setPadding(new Insets(20, 0, 0, 0));
        throwContainer.getChildren().add(btnThrow);


        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setGridLinesVisible(false);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int width = 50; // width of the text fields

        VBox resultContainer = new VBox(5);
        scorePane.add(resultContainer, 0, 4);

        // add labels for results
        // add txfResults,
        for (int i = 0; i < privateResult.length; i++) {
            privateResult[i] = -1; // til at holde privat resultat

        }

        for (int i = 0; i < txfResults.length; i++) {
            int[] resultat = dice.getResults();
            int finalI = i;

            String[] labelNames = {"One pairs", "Two Pairs", "Three-same", "Four-same", "Full House", "Small str.", "Large str.", "Chance", "Yatzy"};
            String name = "";
            if (i < 6) {
                name = (i + 1) + "-s :";
            } else {
                name = labelNames[i - 6];
            }

            Label resultLabel = new Label(name);
            resultLabel.setPrefWidth(80.0);

            TextField resultValue = new TextField();

            resultValue.setText("" + resultat[i]);

            resultValue.setPrefWidth(width);

            resultValue.setOnMouseClicked(event -> {
                int index = finalI; // virkede ikke kun med i
                this.mouseClicked(event, index); // Kalder mouseClicked() med bÃ¥de event og index
            });

            txfResults[i] = resultValue;

            HBox resultInnerContainer = new HBox();
            resultInnerContainer.getChildren().add(resultLabel);
            resultInnerContainer.getChildren().add(resultValue);

            resultContainer.getChildren().add(resultInnerContainer);

            int maxWidth = 100;
            txfBonus.setMaxWidth(maxWidth);
            txfSumSame.setMaxWidth(maxWidth);
            txfTotal.setMaxWidth(maxWidth);
            txfSumOther.setMaxWidth(maxWidth);

            // Declaring labels
            Label sumSame = new Label("Sum: ");
            Label bonus = new Label("Bonus: ");
            Label total = new Label("Total: ");
            Label sumOther = new Label("Sum: ");

            // Setting max width for labels
            sumSame.setMaxWidth(maxWidth);
            bonus.setMaxWidth(maxWidth);
            total.setMaxWidth(maxWidth);
            sumOther.setMaxWidth(maxWidth);

            // Creating Horizontal Boxes
            HBox sums0 = new HBox(5);
            HBox sums01 = new HBox(15);
            HBox sums02 = new HBox(12);
            HBox sums03 = new HBox(15);

            // Creating Vertical Boxes
            VBox vbox0 = new VBox(5);
            VBox vbox01 = new VBox(5);

            // Setting padding for Vertical Boxes
            vbox0.setPadding(new Insets(155, 10, 0, 10));
            vbox01.setPadding(new Insets(400, 10, 0, 10));

            // Adding elements to Horizontal Boxes
            sums03.getChildren().add(sumOther);
            sums03.getChildren().add(txfSumOther);

            sums02.getChildren().add(total);
            sums02.getChildren().add(txfTotal);

            sums01.getChildren().add(sumSame);
            sums01.getChildren().add(txfSumSame);

            sums0.getChildren().add(bonus);
            sums0.getChildren().add(txfBonus);

            // Adding elements to Vertical Boxes
            vbox0.getChildren().add(sums01);
            vbox0.getChildren().add(sums0);

            vbox01.getChildren().add(sums03);
            vbox01.getChildren().add(sums02);

            // Adding panes for Vertical Boxes
            scorePane.add(vbox0, 1, 4);
            scorePane.add(vbox01, 1, 4);

        }

        // add labels and text fields for sums, bonus and total.
        // TO-DO

    }

    // -------------------------------------------------------------------------

    // Create an action method for btnThrow's action.
    // Hint: Create small helper methods to be used in the action method.
    public void throwAction() {

        boolean[] hold = new boolean[5];
        for (int i = 0; i < cbxHolds.length; i++) {
            if (cbxHolds[i].isSelected()) {
                hold[i] = true;
            }
        }
        dice.throwDice(hold);
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i].setText(Integer.toString(dice.getValues()[i]));
        }
        for (int i = 0; i < txfResults.length; i++) {
            txfResults[i].setText(Integer.toString(dice.getResults()[i]));
            if (privateResult[i] != -1) {
                txfResults[i].setText("" + privateResult[i]);

            }
        }

        lblThrowCount.setText("Throw " + Integer.toString(dice.getThrowCount()));
        btnThrow.setText(lblThrowCount.getText());

        if (dice.getThrowCount() == 3) {
            btnThrow.setDisable(true);


            for (int i = 0; i < cbxHolds.length; i++) {
                cbxHolds[i].setDisable(true);
            }

            dice.resetThrowCount();
            for (int i = 0; i < txfResults.length; i++) {
                if (!txfResults[i].isDisabled()) {
                    txfResults[i].setStyle("-fx-background-color: yellow");
                }

            }
        }
    }

    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    // TODO
    private void mouseClicked(MouseEvent event, int index) {
        lblThrowCount.setText("Throw ");
        TextField txf = (TextField) event.getSource();
        privateResult[index] = Integer.parseInt(txf.getText());
        txf.setEditable(false);

        System.out.println(Arrays.toString(privateResult));
        btnThrow.setDisable(false);

        for (int i = 0; i < cbxHolds.length; i++) {
            cbxHolds[i].setSelected(false);
            cbxHolds[i].setDisable(false);
        }
        System.out.println(Arrays.toString(privateResult));
        txf.setDisable(true);

        for (int i = 0; i < txfResults.length; i++) {
            txfResults[i].setStyle("-fx-background-color: white");
        }
        dice.resetThrowCount();
        lblThrowCount.setText("Throw ");

        int sumSame = 0;
        for (int i = 0; i < 6; i++) {
            if (privateResult[i] != -1) {
                sumSame += privateResult[i];
            }

        }
        int sumOther = 0;
        for (int i = 6; i <= 15; i++) {
            if (privateResult[i] != -1) {
                sumOther += privateResult[i];
            }
        }
        int bonus = 0;
        if (sumSame >= 63) {
            bonus = 50;
            txfBonus.setText("" + bonus);
        }
        txfSumSame.setText("" + sumSame);
        txfSumOther.setText("" + sumOther);

        int total = sumOther + sumOther + bonus;
        int i = 0;
        while (privateResult[i] != -1) {
            i++;
        }
        if (i == privateResult.length - 1) {
            txfTotal.setText("" + total);
        }


    }


}