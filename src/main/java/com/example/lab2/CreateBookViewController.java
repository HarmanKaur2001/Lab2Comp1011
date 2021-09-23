package com.example.lab2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateBookViewController implements Initializable {

    @FXML
    private TextField genreTextField;

    @FXML
    private TextField authorTextField;

    @FXML
    private TextField makeTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private CheckBox digitalCheckBox;

    @FXML
    private Label msgLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void submitButton() {
        try {
            String genre    = this.genreTextField.getText();
            String author   = this.authorTextField.getText();
            String make     = this.makeTextField.getText();
            double price    = Double.parseDouble(this.priceTextField.getText());
            boolean digital = this.digitalCheckBox.isSelected();

            Books books = new Books(genre,author,make,price,digital);
            msgLabel.setText("You can buy a book" + books);
        }
        catch (Exception ex)
        {
            this.msgLabel.setText(ex.getMessage());
        }
    }



}
