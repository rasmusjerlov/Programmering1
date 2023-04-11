package exercise1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;


    public class GUI1 extends Application {

        @Override
        public void start(Stage stage) {
            stage.setTitle("Person administration");
            GridPane pane = new GridPane();
            this.initContent(pane);

            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        }

        // -------------------------------------------------------------------------

        private final TextField txfName = new TextField();
        private final TextField txfTitle = new TextField();
        private final ListView<String> lvwNames = new ListView<>();
        private final ArrayList<String> names = new ArrayList<>();
        private final TextArea nameList = new TextArea();
        private final Button add = new Button("Add");
        private final CheckBox isSenior = new CheckBox("Senior");
        private void initContent(GridPane pane) {
            // show or hide grid lines
            pane.setGridLinesVisible(false);
            // set padding of the pane
            pane.setPadding(new Insets(20));
            // set horizontal gap between components
            pane.setHgap(10);
            // set vertical gap between components
            pane.setVgap(10);

            // add a label to the pane (at col=0, row=0)
            Label lblName = new Label("Name:");
            pane.add(lblName, 0, 0);

            // add a label to the pane (at col=0, row=1)
            Label lblNames = new Label("Title:");
            pane.add(lblNames, 0, 1);
            GridPane.setValignment(lblNames, VPos.TOP);

            // add a text field to the pane (at col=1, row=0)
            pane.add(txfName, 1, 0);
            pane.add(txfTitle, 1, 1);

            // add textarea
//            pane.add(nameList, 1, 4);

            // add a listView to the pane(at col=1, row=1)
            pane.add(lvwNames, 1, 3);
            lvwNames.setPrefWidth(200);
            lvwNames.setPrefHeight(200);

            // add a pane for buttons
            pane.add(isSenior, 1, 2);
            pane.add(add, 2, 3);
            add.setOnAction(event -> addPerson());

        }

        // -------------------------------------------------------------------------


        private void addPerson() {
            String name = txfName.getText();
            String title = txfTitle.getText();
            boolean senior = false;
            if (isSenior.isSelected()) {
                senior = true;
            } else {
                senior = false;
            }
            Person person = new Person(name, title, senior);
            names.add(person.toString());
            lvwNames.getItems().setAll(names);
        }

    }

