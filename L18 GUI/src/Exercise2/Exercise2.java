package Exercise2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise2 extends Application {

    private TextField txfFirst;
    private TextField txfLast;
    private TextField txfComb;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    public void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(true);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label firstName = new Label("First name:");
        pane.add(firstName, 0, 0);
        Label lastName = new Label("Last name: ");
        pane.add(lastName, 0, 1);
        Label combined = new Label("Combined: ");
        pane.add(combined, 0, 3);


        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txfFirst = new TextField();
        pane.add(txfFirst, 1, 0, 2, 1);
        txfLast = new TextField();
        pane.add(txfLast, 1, 1, 2, 1);
        txfComb = new TextField();
        pane.add(txfComb, 1, 3, 3, 1);

        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 2, 2);
        GridPane.setMargin(btnCombine, new Insets(10, 10, 10, 20));
        btnCombine.setOnAction(event -> this.combine());
//        btnCombine.setOnAction(event -> txfComb.setText(txfFirst.getText() +
//                " " + txfLast.getText()));
    }
    private void combine() {
        String name = txfFirst.getText() + " " + txfLast.getText();
        txfComb.setText(name);
    }
    }
