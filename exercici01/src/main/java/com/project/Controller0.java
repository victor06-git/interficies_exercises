package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller0 {
    @FXML
    private Button buttonNext;

    @FXML
    private TextField edatField, nomField;

    @FXML
    private void goNext(ActionEvent event) {
        
        Main.nom = nomField.getText();
        Main.edat = edatField.getText();
        
        Controller1 controller1 = (Controller1) UtilsViews.getController("View2");
        controller1.updateOutput();
        UtilsViews.setViewAnimating("View2");
    }

    @FXML
    private void initialize() {

        // Desactiva el botón hasta que ambos campos tengan texto
        buttonNext.setDisable(true);

        // Listener único para ambos campos
        Runnable updateButtonState = () -> buttonNext.setDisable(
            nomField.getText().trim().isEmpty() || edatField.getText().trim().isEmpty()
        );
        nomField.textProperty().addListener((obs, oldVal, newVal) -> updateButtonState.run());
        edatField.textProperty().addListener((obs, oldVal, newVal) -> updateButtonState.run());
    }
}
