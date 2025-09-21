package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

public class Controller1 {

    @FXML
    private Button buttonBack;

    @FXML
    private Text textOutput;

    @FXML
    private void goBack(ActionEvent event) {
        UtilsViews.setViewAnimating("View1");
    }

    // Método público para actualizar el texto cuando se navega a esta vista
    public void updateOutput() {
        textOutput.setText("Hola " + Main.nom + ", tens " + Main.edat + " anys!");
    }

    @FXML
    public void initialize() {
        updateOutput();
    }
}