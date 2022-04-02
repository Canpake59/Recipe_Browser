package com.example.recipebrowser;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML private Text titleText;
    @FXML private Button searchButton;
    @FXML private TextField textField;

    @FXML
    protected void startSearch() {
        String searchText = textField.getText();
        titleText.setText(searchText);
    }

}