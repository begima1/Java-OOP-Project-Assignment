package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField incomeField;
    @FXML
    private TextField rateField;
    @FXML
    private Label resultLabel;
    @FXML
    protected void onCalculateTax() {
        try {
            String name = nameField.getText();
            double income = Double.parseDouble(incomeField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double tax = (income * rate) / 100;
            resultLabel.setText(name + "'s Tax: " + String.format("%.2f", tax));
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numeric values.");
        }
    }
}