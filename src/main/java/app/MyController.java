package app;
 // Change to your actual package name

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class MyController {

    // Cashier tab controls
    @FXML
    private TableView<?> cashierTableView;
    @FXML
    private Button finishButton;
    @FXML
    private Button addButton;
    @FXML
    private Button cardButton;
    @FXML
    private Button cashButton;
    @FXML
    private Button removeButton;

    // Manager tab controls
    @FXML
    private TableView<?> managerTableView;
    @FXML
    private Button addProductButton;
    @FXML
    private Button deleteProductButton;
    @FXML
    private Button addQuantityButton;
    @FXML
    private Button removeQuantityButton;

    // Stats tab controls
    @FXML
    private Button showStatsButton;

    @FXML
    public void initialize() {
        // Initialization code
    }

    @FXML
    private void handleFinishButton() {
        System.out.println("Finish button pressed!");
    }

    @FXML
    private void handleAddButton() {
        System.out.println("Add button pressed!");
    }

    @FXML
    private void handleCardButton() {
        System.out.println("Card button pressed!");
    }

    @FXML
    private void handleCashButton() {
        System.out.println("Cash button pressed!");
    }

    @FXML
    private void handleRemoveButton() {
        System.out.println("Remove button pressed!");
    }

    @FXML
    private void handleAddProductButton() {
        System.out.println("Add Product button pressed!");
    }

    @FXML
    private void handleDeleteProductButton() {
        System.out.println("Delete Product button pressed!");
    }

    @FXML
    private void handleAddQuantityButton() {
        System.out.println("Add Quantity button pressed!");
    }

    @FXML
    private void handleRemoveQuantityButton() {
        System.out.println("Remove Quantity button pressed!");
    }

    @FXML
    private void handleShowStatsButton() {
        System.out.println("Show Stats button pressed!");
    }
}
