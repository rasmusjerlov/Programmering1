package guifx;

import application.controller.Controller;
import application.model.Company;
import application.model.Customer;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CustomerWindow extends Stage {

    private Customer customer;
    private CheckBox chbCompany;
    private ComboBox<Company> cbbCompany;
    private TextField txfName;
    private Label lblError;

    public CustomerWindow(String title, Customer customer) {
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setResizable(false);

        this.customer = customer;

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    public CustomerWindow(String title) {
        this(title, null);
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblName = new Label("Name");
        pane.add(lblName, 0, 0);

        txfName = new TextField();
        pane.add(txfName, 0, 1);
        txfName.setPrefWidth(200);

        chbCompany = new CheckBox("Company");
        pane.add(chbCompany, 0, 4);
        ChangeListener<Boolean> listener = (ov, oldValue, newValue) -> selectedCompanyChanged(newValue);
        chbCompany.selectedProperty().addListener(listener);

        cbbCompany = new ComboBox<>();
        pane.add(cbbCompany, 0, 5);
        cbbCompany.getItems().addAll(Controller.getCompanies());
        cbbCompany.setDisable(true);

        HBox hbxButtons = new HBox(40);
        pane.add(hbxButtons, 0, 6, 3, 1);
        hbxButtons.setPadding(new Insets(10, 0, 0, 0));
        hbxButtons.setAlignment(Pos.BASELINE_CENTER);

        Button btnCancel = new Button("Cancel");
        hbxButtons.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        hbxButtons.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction());

        lblError = new Label();
        pane.add(lblError, 0, 5);
        lblError.setStyle("-fx-text-fill: red");

        this.initControls();
    }

    private void initControls() {
        if (customer != null) {
            txfName.setText(customer.getName());
        } else {
            txfName.clear();
        }
    }

    private void cancelAction() {
        this.hide();
    }

    private void okAction() {
        String name = txfName.getText();
        if (name.length() == 0) {
            lblError.setText("Name is empty");
        } else {
            boolean companyIsSelected = chbCompany.isSelected();
            Company newCompany = cbbCompany.getSelectionModel().getSelectedItem();
            // Call application.controller methods
            if (companyIsSelected) {
                this.customer = Controller.createCustomer(name);
                Controller.addCustomerToCompany(this.customer, newCompany);
            } else {
                Controller.createCustomer(name);
            }
        }
        this.hide();
    }

    private void selectedCompanyChanged(boolean checked) {
        cbbCompany.setDisable(!checked);
    }
}

