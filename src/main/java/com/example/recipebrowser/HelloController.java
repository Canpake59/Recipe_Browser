package com.example.recipebrowser;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    private RecipeFinder r = new RecipeFinder();

    @FXML private Text titleText;
    @FXML private Button searchButton;
    @FXML private TextField textField;
    @FXML private ListView listView;

    @FXML
    protected void startSearch() {
        String searchText = textField.getText();
        listView.getItems().clear();
        for (Recipe recipe : r.findRecipes(searchText)) {
            listView.getItems().add(recipe.name);
        }
    }

}